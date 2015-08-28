package com.demo;


import com.minxing.client.app.AppAccount;

public class TestAppThirdAccount {
	
	public static void main(String[] args) throws Exception{
		
		AppAccount account = AppAccount.loginByAccessToken("http://localhost:3000",
				"cGTsJXPAJeEwUEXvt2SvJ--0q7cPunUqvc4AMKb8i6y-PUti");
		
			
//			ata.sendMessage(24932, 24933, "what");
			account.sendTextMessageToGroup(4861, "abc");
	}
	
}
