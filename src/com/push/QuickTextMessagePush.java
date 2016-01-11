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
		String body = "测试下推送2";
		Message m = new TextMessage(body);
		//管理员或者社区管理员创建接入端，获取到access_token，
		String access_token="zeOwCJxT33f7_6DmdxUARZQosEAsW6kxy8FL6_AWnP0PPVMy";
		//敏行服务器实际地址
		String mx_server_url="http://192.168.100.19/";
		String[] toUserIds = new String[] {"xiexun","zhangweijia","liangyan"};//loginnames
		String ocuId = "1523bfdbbdda8ae12f36bb73506c4992";
		String ocuSecret = "bc9bb82c444388c07c245f0e80609438";
		int i=0;
		AppAccount account = AppAccount.loginByAccessToken(mx_server_url,access_token);
		while(i<50){
//			AppAccount account = AppAccount.loginByAccessToken(mx_server_url,access_token);
			System.out.println(i++);
			OcuMessageSendResult result = account.sendOcuMessageToUsers(null,toUserIds, m, ocuId, ocuSecret);
		}
//		System.out.println(result);
	}
	public static void main(String[] args) throws InterruptedException {
		pushMessage();
	}

}
