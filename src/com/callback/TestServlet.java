package com.callback;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.minxing.client.app.AppAccount;
import com.minxing.client.organization.User;

public class TestServlet extends HttpServlet {

	public TestServlet() {
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
			String app_access_token="59p68NMCUftkkeiXAz9Pj4wpjB7umUSzFyPbQUHsxcHPibuf";
			String ocu_id="80917071fe3d6ef27d3e0f73fa5e1580";
			String ocu_secret="5deb243248901b0d0f8275ddf6462f7e";
			AppAccount oa=AppAccount.loginByAccessToken("http://intg.dehuinet.com:8060", app_access_token);
			oa.setDisabledCookie(true);
			String mx_sso_token = oa.checkSignature(request, ocu_id, ocu_secret);
			if(mx_sso_token!=null){
				System.out.println("验证签名信息通过，获取到得mx_sso_token        ="+mx_sso_token);
				User user=oa.verifyOcuSSOToken(mx_sso_token, ocu_id);
				System.out.println("获取到用户的信息="+user);
			}else{
				System.out.println("验证签名信息失败");
			}
			
			
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter pw = response.getWriter();
            StringBuffer sb = new StringBuffer();
            sb.append("<html>\n" +
                    "<head>\n" +
                    "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                    "</head>\n" +
                    "<body>发生地方第三方地方电风扇地方第三方地方\n" +
                    "</body>\n" +
                    "</html>");
            pw.write(sb.toString());
            pw.flush();
            pw.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
