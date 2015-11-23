package com.push;

import com.minxing.client.app.AppAccount;
import com.minxing.client.app.OcuMessageSendResult;
import com.minxing.client.json.JSONException;
import com.minxing.client.json.JSONObject;
import com.minxing.client.ocu.Message;
import com.minxing.client.ocu.TextMessage;

public class QuickTextMessagePush {
	//单独初始化OcuAccount，用于对应对个公众号
	private static void pushMessage() {
		String body = "测试下推送";
		Message m = new TextMessage(body);
		//管理员或者社区管理员创建接入端，获取到access_token，
		String access_token="iRmRKAHxURf8SuvpSrfgVb6UlKlOAtvyWr8l9FxMu_rKVBA5";
		//敏行服务器实际地址
		String mx_server_url="http://test1.dehuinet.com:8031/";
		AppAccount account = AppAccount.loginByAccessToken(mx_server_url,access_token);
		String[] toUserIds = new String[] {"t67","t66","t122"};//loginnames
		String ocuId = "f317ff96dfd76ca8b16c761fa6d92f34";
		String ocuSecret = "90e668958de44102d5d556c6c0a9c663";
		OcuMessageSendResult result = account.sendOcuMessageToUsers(null,toUserIds, m, ocuId, ocuSecret);
		System.out.println(result);
	}
	public static void main(String[] args) throws InterruptedException {
		pushMessage();
	}

}
