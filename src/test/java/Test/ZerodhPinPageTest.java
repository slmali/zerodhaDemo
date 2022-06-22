package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.annotations.IListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Fixbrowser;
import POM.ZerodhGraphShow;
import POM.ZerodhLoginPage;
import POM.ZerodhPinPage;
import POM.ZerodhaShareByeAndSell;
import Utility.Parametrization;
import Utility.Report;
import Utility.ScreenShot;

@Listeners(Testlistners.class)
public class ZerodhPinPageTest extends BaseTest {
	ExtentReports reports;
	ExtentTest test;
	public class LoginPageTest {
		
	@BeforeTest
	public void extentReport() {
		reports = Report.createReport();
	}
	@BeforeMethod
	public void openchrome() {
		
		driver = Fixbrowser.openBrowser("");
	}

	@Test(priority = 1)
	public void loginWithValidCredantial() throws EncryptedDocumentException, IOException, InterruptedException {
		test = reports.createTest("loginWithValidCredantial");
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
	ScreenShot.takeScreenshot(driver, username);
	
	String ShareName = Parametrization.getData("credential", 5, 1);
	zerodhPinPage.EnterShare(ShareName, driver);
	boolean Watchlist =zerodhPinPage.Addwatchlist();
	Assert.assertTrue(Watchlist);
	}
	
	
	@Test (priority = 2)
	public void ByeShareAndSell() throws InterruptedException, EncryptedDocumentException, IOException {
		
		test = reports.createTest("ByeShareAndSell");

		
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
		

	    ZerodhaShareByeAndSell ZerodhaShareByeAndSell = new ZerodhaShareByeAndSell(driver);
	    String ShareName = Parametrization.getData("credential", 5, 1);
	    System.out.println(ShareName);
	    
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
	@Test (priority = 3)
	public void GraphView() throws InterruptedException, EncryptedDocumentException, IOException {
		
		test = reports.createTest("GraphView");

		
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
		
		
	boolean image =zerodhGraphShow.ShowtheGraphisdisplayed(driver);
		Assert.assertTrue(image, "Graph is not present");
		
	}
	@Test
	public void Hello() {
		System.out.println("i am balaso Mali");
	}
	
@AfterMethod
public void closeBrowser(ITestResult result) {
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL, result.getName());
	}else if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS, result.getName());
	}else {
		test.log(Status.SKIP, result.getName());
	}
}

	@AfterTest
	public void flushResult() {
		reports.flush();
	}
}
}