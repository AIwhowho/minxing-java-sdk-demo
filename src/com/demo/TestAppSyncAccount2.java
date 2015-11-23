package com.demo;


import com.minxing.client.app.AppAccount;
import com.minxing.client.organization.Department;

public class TestAppSyncAccount2 {
	
	public static void main(String[] args) throws Exception{
		AppAccount account = AppAccount.loginByAccessToken("http://localhost:3000",
				"cGTsJXPAJeEwUEXvt2SvJ--0q7cPunUqvc4AMKb8i6y-PUti");
//		User u = new User();
//		u.setNetwork_name("jitou.com");
//		u.setLogin_name("jitou_wang6");
//		u.setName("wang6");
//		u.setEmp_code("jitou_wang6");
//		AppSyncAccount asa = new AppSyncAccount();
//		Error error = asa.add(u);
//		System.out.println(error.getErrorCode());
//		System.out.println(error.getErrorMessage());
//		
//		User u1 = new User();
//		u1.setNetwork_name("jitou.com");
//		u1.setLogin_name("jitou_wang6");
//		u1.setEmail("wang6@jitou.com");
//		u1.setPassword("111111");
//		error = asa.update(u1);
//		System.out.println(error.getErrorCode());
//		System.out.println(error.getErrorMessage());
		Department de = new Department();
		de.setNetwork_name("jitou.com");
		de.setShortName("机头");
		de.setDept_code("abcd");
		de.setRoot(true);
		
		
		
		account.createDepartment(de);
		account.updateDepartment(de);
		
//		System.out.println(error.getErrorCode());
//		System.out.println(error.getErrorMessage());
//		AppSyncAccount asa = new AppSyncAccount();
//		User user = asa.getUser("jitou_wang8");
//		Department dept = asa.getDepartment("abcd");
//		System.out.println(user.getName());
//		System.out.println(dept.getShort_name());
	}
	
}