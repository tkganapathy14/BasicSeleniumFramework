package Login;

import org.testng.annotations.Test;

import Generics.BaseClass;

public class DWS_01_Login_Test extends BaseClass{

	@Test
	public void Login_with_valid_Credentials()
	{
		login.getLoginlink().click();
		login.getEmailtextField().sendKeys("tkganapathy16@gmail.com");
		login.getPasswordtextfield().sendKeys("123456");
		login.getLoginButton().click();
	}
	
}
