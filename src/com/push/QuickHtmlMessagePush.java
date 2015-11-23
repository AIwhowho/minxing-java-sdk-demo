package com.push;

import com.minxing.client.app.AppAccount;
import com.minxing.client.ocu.HtmlMessage;
import com.minxing.client.ocu.Message;

public class QuickHtmlMessagePush {

	private static void pushMessage() {
		String body = "<font color='red'>[特急]</font><b>关于机房监控系统研发立项的...</b><br><br>7月9号&nbsp;&nbsp;工单系统<br><br>当前环节：部门领导审核<br>提交人：战三<br>到达时间：2016-12-11";
		Message m = new HtmlMessage(body);
		String access_token="59p68NMCUftkkeiXAz9Pj4wpjB7umUSzFyPbQUHsxcHPibuf";
		AppAccount account = AppAccount.loginByAccessToken("http://intg.dehuinet.com:8060",access_token);
		String[] toUserIds = new String[] {"1051"};//loginname
		String ocuId = "80917071fe3d6ef27d3e0f73fa5e1580";
		String ocuSecret = "5deb243248901b0d0f8275ddf6462f7e";
		//给特定人员发消息
		account.sendOcuMessageToUsers(toUserIds, m, ocuId, ocuSecret);
	}
	public static void main(String[] args) throws InterruptedException {
		pushMessage();
	}

}
