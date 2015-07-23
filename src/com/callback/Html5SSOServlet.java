package com.callback;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.minxing.client.app.AppAccount;
import com.minxing.client.organization.User;

public class Html5SSOServlet extends HttpServlet {

	public Html5SSOServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

	public void init() throws ServletException {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
			String access_token="59p68NMCUftkkeiXAz9Pj4wpjB7umUSzFyPbQUHsxcHPibuf";
			String app_id="80917071fe3d6ef27d3e0f73fa5e1580";
			AppAccount oa=AppAccount.loginByAccessToken("http://intg.dehuinet.com:8060(敏行地址)", access_token);
			String mx_sso_token = request.getParameter("mx_sso_token");
			if(mx_sso_token!=null){
				System.out.println("验证签名信息通过，获取到得mx_sso_token        ="+mx_sso_token);
				User user=oa.verifyAppSSOToken(mx_sso_token, app_id);
				System.out.println("获取到用户的信息="+user);
			}else{
				System.out.println("验证签名信息失败");
			}
			
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
