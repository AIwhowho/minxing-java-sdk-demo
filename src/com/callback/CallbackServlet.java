package com.callback;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.FromPostBean;
import com.minxing.client.app.AppAccount;
import com.minxing.client.model.MxVerifyException;
import com.minxing.client.ocu.Article;
import com.minxing.client.ocu.ArticleMessage;
import com.minxing.client.ocu.Message;
import com.minxing.client.ocu.TextMessage;
import com.minxing.client.organization.User;
import com.response.Response;
import com.response.ResponseArticle;
import com.response.ResponseHtml;
import com.response.ResponseText;
import com.utils.Constants;
import com.utils.Util;

public class CallbackServlet extends HttpServlet {

	public CallbackServlet() {
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

		
		InputStream in = request.getInputStream();
		String app_access_token="59p68NMCUftkkeiXAz9Pj4wpjB7umUSzFyPbQUHsxcHPibuf";
		String ocuId="80917071fe3d6ef27d3e0f73fa5e1580";
		String ocuSecret="5deb243248901b0d0f8275ddf6462f7e";
		AppAccount oa=AppAccount.loginByAccessToken("http://intg.dehuinet.com:8060", app_access_token);
		oa.setDisabledCookie(true);
		String mx_sso_token = oa.checkSignature(request, ocuId, ocuSecret);
		if(mx_sso_token!=null){
			System.out.println("验证签名信息通过，获取到得mx_sso_token        ="+mx_sso_token);
			User user=null;
			try {
				user = oa.verifyOcuSSOToken(mx_sso_token, ocuId);
			} catch (MxVerifyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("获取到用户的信息="+user);
		}else{
			System.out.println("验证签名信息失败");
		}
		FromPostBean frompostbean = Util.getFromPostBean(in);
		System.out.println(frompostbean.toString());
		String eventkey = frompostbean.EventKey;
		String event = frompostbean.Event;
		String content = frompostbean.Content;

		try {
			Response message = new Response();
			String tip="<br>1.输入google返回google数据<br>2.点击菜单text返回text消息<br>3.点击html返回html消息<br>4.点击article返回图文消息";
			// 响应订阅事件
			if ("subscribe".equals(event)) {
				boolean success = true;
				String msg = "";
				if (success){
					msg = "{\"errcode\":0,\"errmsg\":\"订阅成功!"+tip+"\"}";
					System.out.println(msg);
				}else
					msg = "{\"errcode\":1,\"errmsg\":\"系统维护中\"}";
				message.setContent(msg);
				message.setContentType("application/json");
				String[] ids=new String[]{Constants.LOGIN_NAME};
				String body = "测试下推送";
				Message m = new TextMessage(body);
				oa.sendOcuMessageToUsers(ids, m, ocuId, ocuSecret);
			} else if ("unsubscribe".equals(content)) {
				String msg = "{\"errcode\":0,\"errmsg\":\"成功取消订阅\"}";
				message.setContent(msg);
				message.setContentType("application/json");
			} else if ("google".equals(content)) {
				// 响应公众号输入内容google
				ArticleMessage m = new ArticleMessage();
				//消息标题,描述，消息图片地址,消息html5链接,消息native链接
				Article a = new Article("建设有限责任公司2014年度工作总结暨2015", 
						"摘要发展总结", 
						"https://www.minxing365.com/logo.png", 
						"/logo.png", 
						null);
				//最多支持4个
				m.addArticle(a);
				message.setContent(m.getBody());
				message.setContentType("application/json");
			} else if ("text".equals(eventkey)) {
				//响应菜单内容为text的click类型的菜单
				message=ResponseText.createMessage();
			} else if ("html".equals(eventkey)) {
				//响应菜单内容为html的click类型的菜单
				message = ResponseHtml.createMessage();
			} else if ("article".equals(eventkey)) {
				//响应菜单内容为article的click类型的菜单
				message = ResponseArticle.createMessage();
			}  else {
				message.setContent("欢迎使用！"+tip);
				message.setContentType("application/text");
			}
			if(message.getHeaders() != null){
				Iterator<String> keys= message.getHeaders().keySet().iterator();
				while(keys.hasNext()){
					String key = keys.next();
					response.setHeader(key, message.getHeaders().get(key));
				}
			}
//			response.setCharacterEncoding("utf-8");
//			response.setContentType(message.getContentType());
//			response.getWriter().write(message.getContent());
//			response.getWriter().flush();
//			response.getWriter().close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
