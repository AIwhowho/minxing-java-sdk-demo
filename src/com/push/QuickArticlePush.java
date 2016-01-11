package com.push;

import com.minxing.client.app.AppAccount;
import com.minxing.client.ocu.Article;
import com.minxing.client.ocu.ArticleMessage;

public class QuickArticlePush {
	
	private static void pushMessage() {
		ArticleMessage m = new ArticleMessage();
		//消息标题,描述，消息图片地址,消息html5链接,消息native链接
		Article a = new Article("【待阅】关于歌华办公MOA项目合同签署问题", 
				"文件类型：请示合同<br>当前环节：部门领导审核<br>提交人员：张唯佳<br>到达时间：2015-12-11", 
				"", 
				"http://www.bgctv.com.cn", 
				null);
		
//		a.setAction_label("打开工单待办");
		//最多支持4个
		m.addArticle(a);
		
		String access_token="etD8HwwL2xqEYQOeWK6h6o_xhYEmOORVm9d_-oUOCFNUsnq_";
		AppAccount account = AppAccount.loginByAccessToken("http://211.99.134.13/",access_token);
		String[] toUserIds = new String[] {"xiexun"};//loginname
		String ocuId = "oa";
		String ocuSecret = "c51594ff88367d75582d342f93527489";
		account.sendOcuMessageToUsers(toUserIds, m, ocuId, ocuSecret);
	}
	public static void main(String[] args) throws InterruptedException {
		pushMessage();
	}

}
