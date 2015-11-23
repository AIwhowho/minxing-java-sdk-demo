package com.demo;


import java.util.HashMap;
import java.util.Map;

import com.minxing.client.app.AppAccount;
import com.minxing.client.json.JSONObject;
import com.minxing.client.model.MxException;

public class TestGetDepartmentByApi {
	public static void main(String[] args) {
		getDepartmentsUsers(-1,-1,0,20);
//		JSONObject subdepartment = getDepartmentsUsers(-1,-1,4,20);
	}
	private static void getDepartmentsUsers(int last_dept_id, int last_user_id, int parent_id,int limit){
		
		AppAccount account = AppAccount.loginByAccessToken("http://localhost:3000",
				"cGTsJXPAJeEwUEXvt2SvJ--0q7cPunUqvc4AMKb8i6y-PUti");
		
		Map<String,String> params = new HashMap<String, String>();
		if(parent_id > 0 ){
			if (last_dept_id > 0) {
				params.put("last_dept_id", last_dept_id+"");
			}
			if (last_user_id > 0) {
				params.put("last_user_id", last_user_id+"");
			}
			if (parent_id > 0) {
				params.put("parent_id", parent_id+"");
			}
			params.put("with_root", "true");
			params.put("all_dept", "true");
		}
		params.put("limit", limit+"");
		
		try {
			account.get("/api/v1/departments.json",params);
		} catch (MxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
