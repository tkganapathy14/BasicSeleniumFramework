package Register;

import org.testng.annotations.Test;

import Generics.BaseClass;

public class DWS_10_Register_Test extends BaseClass {
	@Test
	public void Registering_User()
	{
		Register.getRegisterLink().click();
		Register.getFirstname().sendKeys("T K");
		Register.getLastname().sendKeys("Ganapathy");
		Register.getEmail().sendKeys("tkganapathy16@gmail.com");
		Register.getPassword().sendKeys("123456");
		Register.getConfirmpassword().sendKeys("123456");
		Register.getRegisterButton().click();
	}

}
