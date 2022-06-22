package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Fixbrowser;
import POM.ZerodhForgotPassword;
import Utility.Parametrization;
import Utility.ScreenShot;

public class ZerodhForgotPasswordTest {
	
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void openchrome() {
		
		driver = Fixbrowser.openBrowser("");
	}
@Test
public void ClikOnForgot() throws EncryptedDocumentException, IOException, InterruptedException {
	
	ZerodhForgotPassword zerodhForgotPassword = new ZerodhForgotPassword(driver);
	zerodhForgotPassword.ClickOnForgot();
	Thread.sleep(3000);
	zerodhForgotPassword.RedioButtonClick();
	Thread.sleep(3000);
	String PanNum = Parametrization.getData("credential", 4, 1);
	zerodhForgotPassword.EnterPan(PanNum);
	Thread.sleep(3000);

	zerodhForgotPassword.RedioButtonClick1();
	Thread.sleep(3000);
	String Number = Parametrization.getData("credential", 3, 1);
	zerodhForgotPassword.EnterMobile(Number);
	Thread.sleep(3000);

	zerodhForgotPassword.RedioButtonClick1();
	zerodhForgotPassword.ClickOnBackToLog();
}	
}	



