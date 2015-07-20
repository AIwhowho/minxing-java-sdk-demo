package com.push;

import com.minxing.client.app.AppAccount;
import com.minxing.client.ocu.HtmlMessage;
import com.minxing.client.ocu.Message;

public class QuickHtmlMessagePush {

	private static void pushMessage() {
		String body = "<h1>欢迎</h1><br>使用<a href='https://www.minxing365.com/m'>敏行平台</a><br><br><a href='/connect/mx_bridge.js'>test relative url</a><br><br><a href='/sandbox'>test relative url sandbox</a>";
		Message m = new HtmlMessage(body);
		String access_token="59p68NMCUftkkeiXAz9Pj4wpjB7umUSzFyPbQUHsxcHPibuf";
		AppAccount account = AppAccount.loginByAccessToken("http://intg.dehuinet.com:8060",access_token);
		String[] toUserIds = new String[] {"1081","1061"};//loginname
		String ocuId = "80917071fe3d6ef27d3e0f73fa5e1580";
		String ocuSecret = "5deb243248901b0d0f8275ddf6462f7e";
		//给特定人员发消息
		account.sendOcuMessageToUsers(toUserIds, m, ocuId, ocuSecret);
	}
	public static void main(String[] args) throws InterruptedException {
		pushMessage();
	}

}
