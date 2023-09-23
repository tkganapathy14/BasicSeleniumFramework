package Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import ObjectRepository.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//public static void main(String[] args) {
	
			//when chrome browser is not opening use this first two lines
			//WebDriverManager.chromedriver().clearDriverCache().setup();
		//	WebDriverManager.chromedriver().clearResolutionCache().setup();
//			WebDriverManager.chromedriver().setup();
//			 driver=new ChromeDriver();
	public static WebDriver driver;
	public static  javaScriptUtility js;
	public static propertyUtility utility=new propertyUtility();
	public LoginPage login;
	public RegisterPage Register;
	
	@BeforeClass
	public void launchingBrowser()
	{
		if(utility.Readingdata("browser").equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(utility.Readingdata("browser").equalsIgnoreCase("firefox"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new FirefoxDriver();
	}
	else if(utility.Readingdata("browser").equalsIgnoreCase("edge"))
		
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login=new LoginPage(driver);
		Register=new RegisterPage(driver);
		
		
	}
	
	@BeforeMethod
	public void navigatingToApplication()
	{
		driver.get(utility.Readingdata("url"));
	}
	
	@AfterClass
	public void teardownbrowser() {
		driver.quit();
	}
		 
	}

