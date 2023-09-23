package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver  driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getLoginlink() {
		return Loginlink;
	}
	public WebElement getEmailtextField() {
		return emailtextField;
	}
	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	@FindBy(linkText = "Log in")
	private WebElement Loginlink;
	@FindBy(id="Email")
	private WebElement emailtextField;
	@FindBy(id="Password")
	private WebElement passwordtextfield;
	@FindBy(xpath="//input[@value=\"Log in\"]")
	private WebElement LoginButton;
	
}
