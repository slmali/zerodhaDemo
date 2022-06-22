package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.gson.annotations.Until;

import POJO.WaitMeThode;

public class ZerodhPinPage {
	
	@FindBy(xpath= "//input[@id=\"pin\"]")private WebElement pin;
	@FindBy(xpath= "//button[@type='submit']")private WebElement submit;
	@FindBy(xpath= "//a[text()='Forgot 2FA?']")private WebElement forgot;
	@FindBy(xpath= "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	@FindBy(xpath = "//input[@type=\"text\"]")private WebElement Search;
    @FindBy(xpath= "(//span[text()='TATACOFFEE'])[1]")private WebElement TataCofee;
    @FindBy(xpath = "(//span[text()='TATACOFFEE'])[1]")private WebElement Watchlist;

public ZerodhPinPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public void EnterPinNumber(WebDriver driver ,String PinNum) {
	
	WaitMeThode.FluentWait(driver, pin);

	pin.sendKeys(PinNum);
}

public void EnterShare(String Share, WebDriver driver){
	
	WaitMeThode.FluentWait(driver, Search);
	Search.click();
	Search.sendKeys(Share);	
Actions action = new Actions(driver);

action.moveToElement(TataCofee).click().perform();
}

public boolean Addwatchlist() {
	boolean tata = Watchlist.isDisplayed();

	System.out.println(tata);
	return tata;
}
public void ClickonContinue() {
	submit.click();
}
public void ClickOnForgot() {
	forgot.click();
}
public void ClickOnSignUp() {
	signup.click();
}
}