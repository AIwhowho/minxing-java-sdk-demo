package com.demo;


import com.minxing.client.app.AppAccount;
import com.minxing.client.ocu.Article;
import com.minxing.client.ocu.ArticleMessage;

public class TestOcuAccount {
		public static void main(String[] args){
				
//				oa.sendMessageToUsersStr(new HtmlMessage("测试<a href='http://www.baidu.com'>百度</a>"), "dev001@dehui220.com.cn");
				ArticleMessage am = new ArticleMessage();
				Article pt = new Article("标题\r\n", "内容\r详细内容","","","");
				am.addArticle(pt);
				
				
				AppAccount account = AppAccount.loginByAccessToken("http://localhost:3000",
						"iPefUDrrardwZMWQXaZnBDBCLyY3iksJTmYtP2rcrJ0EYCJA");
				
				String ocuId = "82c4084644296524197ae4fd66ae14f3";
				String ocuSecret = "178455fde52319391ff16b75106580d2";
				
				int send_to = account.sendOcuMessageToUsers(new String[] {"dev001@dehui220.com.cn"}, am, ocuId, ocuSecret);
				System.out.println("发送至:" + send_to + "人");
				
		}
		
}
