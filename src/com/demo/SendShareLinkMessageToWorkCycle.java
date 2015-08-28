package com.demo;

import com.minxing.client.app.AppAccount;
import com.minxing.client.model.ShareLink;

public class SendShareLinkMessageToWorkCycle {

	public static void main(String[] args) {

		// 1.社区管理员登录系统，系统管理-接入端应用管理-创建应用。类型：其他，权限范围：模拟普通用户，ssokey:login_name,生成accessToken:是

		int fromuserid = 20;// 一个用户的id，接口会模拟该id发送消息.web上打开一个用户，从url里获取id
		int MY_SALE_GROUPE = 2;// 工作圈id，web上打开一个工作圈，从url里获取

		AppAccount account = AppAccount.loginByAccessToken("http://localhost:3000",
				"cGTsJXPAJeEwUEXvt2SvJ--0q7cPunUqvc4AMKb8i6y-PUti");

		String body = "XXX转发了一个连接";

		ShareLink sharelink = new ShareLink();
		sharelink.setTitle("什么东西难以复制");
		sharelink
				.setURL("http://mp.weixin.qq.com/s?__biz=MjAzNzMzNTkyMQ==&mid=201137562&idx=2&sn=b3b99117e6c4a69aa567de803dafc120&scene=2&from=timeline&isappinstalled=0#rd");
		sharelink
				.setDescription("此文是著名VC Fred Wilson的文章，在此文中他提出了软件的商品化不可阻挡，所以投资此类公司必须注重“防御性”。他用一个牙科诊所软件的故事来说明如何做到这一点，其合作伙伴Albert后来又为这个故事修改了一个更好的结局");
		sharelink
				.setImageURL("http://mmbiz.qpic.cn/mmbiz/WRGz2LWLARDqOAnu1ib7Rum3PWc0KDtCqJHNhcrrXPEnROS4IHXXm73Ik9LtxIcAdm1l6uniaLjdkXkDo9Tdc4AA/0");
		// sharelink.setAppURL("your_native_app_url");
		// 如果需要客户端打开native页面，则填写该信息，例如：nativeLaunch://

		try {

			account.sendSharelinkToGroup(MY_SALE_GROUPE, body, sharelink);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}