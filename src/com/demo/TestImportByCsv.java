package com.demo;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;
import com.minxing.client.app.AppAccount;
import com.minxing.client.organization.Department;
import com.minxing.client.organization.User;

public class TestImportByCsv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readeCsv();
	}

	/**
	 * 读取CSV文件,增加兼职
	 */
	public static void readeCsv() {
		try {

			ArrayList<String[]> csvList = new ArrayList<String[]>(); // 用来保存数据
			String csvFilePath = "/Users/liuhua/work/code/gitlab/customers/bgctv/import/sort/歌华重复.csv";
			CsvReader reader = new CsvReader(csvFilePath, ',',
					Charset.forName("UTF-8")); // 一般用这编码读就可以了

			reader.readHeaders(); // 跳过表头 如果需要表头的话，不要写这句。

			while (reader.readRecord()) { // 逐行读入除表头的数据
				csvList.add(reader.getValues());
			}
			reader.close();
			AppAccount account = AppAccount.loginByAccessToken(
					"http://211.99.134.13/",
					"etD8HwwL2xqEYQOeWK6h6o_xhYEmOORVm9d_-oUOCFNUsnq_");
			int count=1;
			for (int row = 0; row < csvList.size(); row++) {

				User u = account.findUserByLoginname(csvList.get(row)[0]);
				Department[] departs = u.getAllDepartments();
				List<String> depart_dept_code = new ArrayList();
				for (Department d : departs) {
					depart_dept_code.add(d.getDept_code());
				}
				count++;
				System.out.println( count + "-all-user-info==" + csvList.get(row)[0]+"    " +
						csvList.get(row)[10] +"    " + csvList.get(row)[11] +"    " +
						csvList.get(row)[3]);
				if (!depart_dept_code.contains(csvList.get(row)[10])) {
					/*
					 *  userLoginName  departmentCode  displayOrder  title 
					 */
					System.out.println("insert-user==" + csvList.get(row)[0]+"    " +
							csvList.get(row)[10] +"    " + csvList.get(row)[11] +"    " +
							csvList.get(row)[3]);
					account.addUserDepartment(csvList.get(row)[0],
							csvList.get(row)[10], csvList.get(row)[11],
							csvList.get(row)[3]);
				}

			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
