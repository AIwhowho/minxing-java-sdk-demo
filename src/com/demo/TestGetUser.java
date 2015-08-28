package com.demo;
import com.minxing.client.app.AppAccount;
import com.minxing.client.organization.User;

public class TestGetUser {
	public static void main(String[] args) {

		AppAccount account = AppAccount.loginByAccessToken("http://localhost:3000",
				"cGTsJXPAJeEwUEXvt2SvJ--0q7cPunUqvc4AMKb8i6y-PUti");

		// OcuAccount oa = new OcuAccount();
		// oa.setApiPrefix("/api/v1");
		// oa.setRootUrl("http://192.168.100.80:3000");
		// oa.setOcuId("a090d4e87df3aa72b828cfd65dc950e8");
		// oa.setOcuSecret("4c05b25c45f453c0d169d87d88e41690");
		// User user = oa
		// .getUserInfo("0249c38672a654088f4ae74a809829bb0af1469beba2b371679ea695f477c818d7d24a87c551681be120b6bbea7d4039");
		try {

			User user = account
					.verifyAppSSOToken(
							"0249c38672a654088f4ae74a809829bb0af1469beba2b371679ea695f477c818d7d24a87c551681be120b6bbea7d4039",
							null);

			System.out.println(user.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
