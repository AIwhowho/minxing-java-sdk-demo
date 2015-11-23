package com.push;

import com.minxing.client.app.AppAccount;
import com.minxing.client.ocu.Article;
import com.minxing.client.ocu.ArticleMessage;

public class QuickArticlePush {
	
	private static void pushMessage() {
		ArticleMessage m = new ArticleMessage();
		//消息标题,描述，消息图片地址,消息html5链接,消息native链接
		Article a = new Article("【急】建设有限责任公司2014年度工作总结暨2015", 
				"当前环节：部门领导审核<br>提交人：战三<br>到达时间：2016-12-11", 
				"", 
				"/todo.do", 
				null);
		
		a.setAction_label("打开工单待办");
		//最多支持4个
		m.addArticle(a);
		
		String access_token="59p68NMCUftkkeiXAz9Pj4wpjB7umUSzFyPbQUHsxcHPibuf";
		AppAccount account = AppAccount.loginByAccessToken("http://intg.dehuinet.com:8060",access_token);
		String[] toUserIds = new String[] {"1051"};//loginname
		String ocuId = "80917071fe3d6ef27d3e0f73fa5e1580";
		String ocuSecret = "5deb243248901b0d0f8275ddf6462f7e";
		account.sendOcuMessageToUsers(toUserIds, m, ocuId, ocuSecret);
	}
	public static void main(String[] args) throws InterruptedException {
		pushMessage();
	}

}
