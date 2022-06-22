package Test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Fixbrowser;
import POM.ZerodhaSignUpPage;
import Utility.Parametrization;
import Utility.ScreenShot;


public class ZerodhaSignUpPageTest {
	WebDriver driver;
	@BeforeMethod
	public void openchrome() {
		
		driver = Fixbrowser.openBrowser("");
	}


@Test
public void ClickOnSignUpandFocusSignUp() throws EncryptedDocumentException, IOException, InterruptedException {
	ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(driver);
	zerodhaSignUpPage.ClickOnSignUp();
	Thread.sleep(3000);

	zerodhaSignUpPage.SwitchWindow(driver);
	
	Thread.sleep(3000);
	 String Mobile = Parametrization.getData("credential", 3, 1);
	 zerodhaSignUpPage.EnterMobileNumber(Mobile);
	 System.out.println(Mobile);
	
	 zerodhaSignUpPage.ClickNri();
	 
}
						 																	
}
