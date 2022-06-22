package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POJO.Fixbrowser;
import POJO.WaitMeThode;
import POM.ZerodhGraphShow;
import POM.ZerodhLoginPage;
import POM.ZerodhPinPage;
import Utility.Parametrization;
import Utility.ScreenShot;

public class ZerodhGraphShowTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openchrome() {
	driver = Fixbrowser.openBrowser("");
	}
	
	@Test
	public void SearchShare() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhLoginPage zerodhLoginPage = new ZerodhLoginPage(driver);
		String username = Parametrization.getData("credential", 0, 1);
		String password = Parametrization.getData("credential", 1, 1);
		
		zerodhLoginPage.EnterEmail(username);
	    zerodhLoginPage.EnterPass(password);
		
		zerodhLoginPage.ClickOnbutton();
		
		ZerodhPinPage zerodhPinPage = new ZerodhPinPage(driver);
		String Pin = Parametrization.getData("credential",2, 1);
		zerodhPinPage.EnterPinNumber(driver, Pin);
		zerodhPinPage.ClickonContinue();
		
		ZerodhGraphShow zerodhGraphShow = new ZerodhGraphShow(driver);
		
		String share = Parametrization.getData("credential", 5, 1);
		zerodhGraphShow.clickOnsearchTabandEnterShare(share, driver);
		zerodhGraphShow.MovetoShareAndClickonGraph(driver);
		
		
		zerodhGraphShow.SwitchtoIframe(driver);
		Thread.sleep(3000);
	boolean image =zerodhGraphShow.ShowtheGraphisdisplayed(driver);
		Assert.assertTrue(image, "Graph is not present");
		
		
		
		
	}

}
