package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POJO.Fixbrowser;
import POM.ZerodhLoginPage;
import Utility.Parametrization;
import Utility.ScreenShot;

public class LoginPageTest {
	WebDriver driver;
	
@BeforeMethod
public void openchrome() {
	
	driver = Fixbrowser.openBrowser("");
}

@Test
public void loginWithValidCredantial() throws EncryptedDocumentException, IOException {
	ZerodhLoginPage zerodhLoginPage = new ZerodhLoginPage(driver);
	zerodhLoginPage.ClickOnbutton();
	
//	String text = zerodhLoginPage.getErrormsg();
//	String expected = "Password should be minimum 6 characters.";
	SoftAssert softassert = new SoftAssert();
//	softassert.assertEquals(text, expected);
	String username = Parametrization.getData("credential", 0, 1);
	String password = Parametrization.getData("credential", 1, 1);
	
	zerodhLoginPage.EnterEmail(username);
zerodhLoginPage.EnterPass(password);
	
	zerodhLoginPage.ClickOnbutton();
	
	softassert.assertAll();

//Assert.assertEquals(text, expected);// hard assert
}
@Test
public void ClickOnForgotlink() throws IOException  {
	ZerodhLoginPage zerodhLoginPage = new ZerodhLoginPage(driver);
	zerodhLoginPage.ClickOnForgot();
	
}
@Test
public void ClickOnSignUpLink() throws IOException  {
	ZerodhLoginPage zerodhLoginPage = new ZerodhLoginPage(driver);
	zerodhLoginPage.ClickOnSignUp();
	
}

	
}

