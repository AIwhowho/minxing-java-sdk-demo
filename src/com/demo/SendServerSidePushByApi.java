package com.demo;
import com.minxing.client.app.AppAccount;
import com.minxing.client.model.ApiErrorException;

public class SendServerSidePushByApi {

	public static void main(String[] args) {

		// 创建一个连接
		AppAccount account = AppAccount.loginByAccessToken(
				"http://localhost:3000",
				"yh5EgUi0rV51l2_s0oZ6Q45nd8zWdgUqiyxiLgwEDtzPmNVy");

		String message = "<msg>my message</msg>"; // 发送给移动端的消息，可以是json，xml，base64或者其他序列化成string的

		// 推送
		try {
			String user_ids = "t1@dehuinet.com,t2@dehuinet.com,t3@dehuinet.com"; // 接收人列表
			String alert = "您有一个提醒"; // iOS通知栏信息，可选
			String alert_extend = "{'count': 1}"; // iOS的扩展内容,可选
			int send_count = account.pushMessage(user_ids, message, alert,
					alert_extend);
			
			System.out.println(send_count); // 成功发送给几个人

		} catch (ApiErrorException e) {

			System.err.println("错误信息" + e.getMessage()); // 成功发送给几个人
			e.printStackTrace();

		}

	}

}
