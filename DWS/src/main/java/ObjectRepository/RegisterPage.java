package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getRadioButton() {
		return RadioButton;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirmpassword() {
		return Confirmpassword;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;

	@FindBy(id="gender-male")
	private WebElement RadioButton;

	@FindBy(id="FirstName")
	private WebElement Firstname;

	@FindBy(id="LastName")
	private WebElement lastname;

	@FindBy(id="Email")
	private WebElement email;

	@FindBy(id="Password")
	private WebElement Password;

	@FindBy(id="ConfirmPassword")
	private WebElement Confirmpassword;

	@FindBy(id="register-button")
	private WebElement RegisterButton;	
}
