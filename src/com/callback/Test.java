package com.callback;

import javax.servlet.http.HttpServlet;

import com.minxing.client.json.JSONException;
import com.minxing.client.json.JSONObject;

public class Test extends HttpServlet {
	protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {
		System.out.println(req.getParameter("login_name"));
		System.out.println(req.getParameter("password"));
		JSONObject o = new JSONObject();
		try {
			o.put("success", "false");
			o.put("token", "tokenafadsfaerfaseffsfas");
			o.put("message", "asdfsafsfsd");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().write(o.toString());
		resp.getWriter().flush();
		resp.getWriter().close();
	};
}
