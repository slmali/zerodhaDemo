package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POJO.Fixbrowser;
import POM.ZerodhLoginPage;
import POM.ZerodhPinPage;
import POM.ZerodhaShareByeAndSell;
import Utility.Parametrization;
import Utility.ScreenShot;


public class ZerodhaShareByeAndSellTest {
		WebDriver driver;
		@BeforeMethod
		public void openchrome() {
			
			driver = Fixbrowser.openBrowser("");
		}

		
@Test
public void LogIn() throws EncryptedDocumentException, IOException, InterruptedException {
	
	
	ZerodhLoginPage zerodhLoginPage = new ZerodhLoginPage(driver);
	String username = Parametrization.getData("credential", 0, 1);
	String password = Parametrization.getData("credential", 1, 1);
	zerodhLoginPage.EnterEmail(username);

	
	zerodhLoginPage.EnterPass(password);
	zerodhLoginPage.ClickOnbutton();
	
	
	Thread.sleep(3000);
	ZerodhPinPage zerodhPinPage = new ZerodhPinPage(driver);
	String Pin = Parametrization.getData("credential",2, 1);
	zerodhPinPage.EnterPinNumber(driver, Pin);
	zerodhPinPage.ClickonContinue();
	

    ZerodhaShareByeAndSell ZerodhaShareByeAndSell = new ZerodhaShareByeAndSell(driver);
    String ShareName = Parametrization.getData("credential", 5, 1);
    System.out.println(ShareName);
    Thread.sleep(2000);
    ZerodhaShareByeAndSell.EnterShare(ShareName, driver);
    ZerodhaShareByeAndSell.ClickByeButtonShare(driver);

    ZerodhaShareByeAndSell.RedioClick();
   
    ZerodhaShareByeAndSell.RedioClickC();
 
    ZerodhaShareByeAndSell.MarketValueClick();
  
    ZerodhaShareByeAndSell.CheckBoxClick();
   
    ZerodhaShareByeAndSell.ClickonBye();
  
   
    ZerodhaShareByeAndSell.ClickOnSwitchT();
  
    ZerodhaShareByeAndSell.ClickOnSeelSubmit();
  
    
	}
}
