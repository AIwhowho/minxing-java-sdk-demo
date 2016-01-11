package com.push;

import com.minxing.client.app.AppAccount;
import com.minxing.client.ocu.Article;
import com.minxing.client.ocu.ArticleMessage;

public class CopyOfQuickArticlePush {
	
	private static void pushMessage() {
		ArticleMessage m = new ArticleMessage();
		//消息标题,描述，消息图片地址,消息html5链接,消息native链接
		Article a = new Article("歌华有线公司牵头召开电视院线控股有限公司筹备会", 
				"发布人员：张翰<br>发布机构：总工办<br>发布时间：2015-12-11", 
				"http://www.bgctv.com.cn/uploadfile/2015/1016/20151016084729882.jpg", 
				"http://www.bgctv.com.cn", 
				null);
		
//		a.setAction_label("打开工单待办");
		//最多支持4个
		m.addArticle(a);
		
		String access_token="etD8HwwL2xqEYQOeWK6h6o_xhYEmOORVm9d_-oUOCFNUsnq_";
		AppAccount account = AppAccount.loginByAccessToken("http://211.99.134.13/",access_token);
		String[] toUserIds = new String[] {"xiexun"};//loginname
		String ocuId = "news";
		String ocuSecret = "52098a9beaebe657d177a460c61130ff";
		account.sendOcuMessageToUsers(toUserIds, m, ocuId, ocuSecret);
	}
	public static void main(String[] args) throws InterruptedException {
		pushMessage();
	}

}
