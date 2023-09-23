package Generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListnerUtility extends BaseClass implements ITestListener{
	public void OntestFailure(ITestResult result)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File photo=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("./demo/de.png");
		File files=new File("./demo1/demo.png");
		
		try {
			FileUtils.copyFile(photo,f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
