package com.demo;

import com.minxing.client.app.AppAccount;
import com.minxing.client.model.ApiErrorException;
import com.minxing.client.organization.Department;
import com.minxing.client.organization.Network;
import com.minxing.client.organization.User;

public class TestOrgSync {
	static String network_name = "t.cn";

	public static void main(String[] args) {
		AppAccount account = AppAccount.loginByPassword(
				"http://192.168.88.103:3000", "admin", "111111", "4");

		// addNetwork(account);

		account = AppAccount.loginByPassword("http://192.168.88.103:3000",
				"admin@t.cn", "111111", "4");

		// addDepart(account);
		// addUser(account);
		//updateUser(account);
		deleteUser(account);
	}

	private static void addNetwork(AppAccount account) {

		Network n = new Network();
		n.setDisplay_name("电访测试");
		n.setName(network_name);
		Network net;
		try {
			net = account.createNetwork(n);
			System.out.println("成功,id:" + net.getId());
		} catch (ApiErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void addDepart(AppAccount account) {

		Department d = new Department();
		d.setDept_code("001004");
		d.setShortName("客户部");
		d.setNetwork_name(network_name);

		try {
			Department newDept = account.createDepartment(d);
			System.out.println("Depart:" + newDept);
		} catch (ApiErrorException e) {

			e.printStackTrace();
		}

		// System.out.println(e.getErrorCode() + e.getErrorMessage());
	}

	private static void addUser(AppAccount account) {

		User u = new User();
		// u.setNetwork_name(network_name);
		u.setLoginName("java");
		u.setName("(（test）)");
		u.setEmail("java@t.cn");
		u.setPassword("123456");
		u.setTitle("经理");
		u.setCellvoice1("13145678912");
		u.setDeptCode("001004");

		try {
			User user = account.addNewUser(u);
			System.out.println("user:" + user);
		} catch (ApiErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(e.getErrorCode() + e.getErrorMessage());
	}

	private static void updateUser(AppAccount account) {

		User u = new User();
		u.setNetworkName(network_name);
		u.setLoginName("java");
		u.setName("(（test）)");
		u.setEmail("ruby@t.cn");
		u.setPassword("123456");
		u.setTitle("经理");
		u.setCellvoice1("13145678912");
		u.setDeptCode("001003");
		try {
			account.updateUser(u);
		} catch (ApiErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void deleteUser(AppAccount account) {

//		User u = new User();
//		u.setNetworkName(network_name);
//		u.setLoginName("java");
//		u.setName("(（test）)");
//		u.setEmail("ruby@t.cn");
//		u.setPassword("123456");
//		u.setTitle("经理");
//		u.setCellvoice1("13145678912");
//		u.setDeptCode("001003");
		try {
			account.deleteUserByLoginName("java");
		} catch (ApiErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
