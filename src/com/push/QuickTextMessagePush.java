package com.push;

import com.minxing.client.app.AppAccount;
import com.minxing.client.ocu.Message;
import com.minxing.client.ocu.TextMessage;

public class QuickTextMessagePush {
	//单独初始化OcuAccount，用于对应对个公众号
	private static void pushMessage() {
		String body = "测试下推送";
		Message m = new TextMessage(body);
		//管理员或者社区管理员创建接入端，获取到access_token，
		String access_token="59p68NMCUftkkeiXAz9Pj4wpjB7umUSzFyPbQUHsxcHPibuf";
		AppAccount account = AppAccount.loginByAccessToken("http://intg.dehuinet.com:8060",access_token);
		String[] toUserIds = new String[] {"1081"};//loginname
		String ocuId = "80917071fe3d6ef27d3e0f73fa5e1580";
		String ocuSecret = "5deb243248901b0d0f8275ddf6462f7e";
		account.sendOcuMessageToUsers(toUserIds, m, ocuId, ocuSecret);
	}
	public static void main(String[] args) throws InterruptedException {
		pushMessage();
	}

}
