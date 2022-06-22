package Test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShot;

public class Testlistners extends BaseTest implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "Test has started");
	}
	public void onTestFailure(ITestResult result) {
		try {
			ScreenShot.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test has started");
	}
	public void onTestSkip(ITestResult result) {
		System.out.println(result.getName()+"Test has started");
	}
	

}
