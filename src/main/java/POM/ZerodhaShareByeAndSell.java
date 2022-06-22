package POM;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POJO.WaitMeThode;

public class ZerodhaShareByeAndSell {
	

@FindBy(xpath = "//input[@type=\"text\"]")private WebElement Search;
@FindBy(xpath="(//span[@class=\"tradingsymbol\"])[1]")private WebElement Tata;
@FindBy(xpath ="(//button[@type=\"button\"])[1]")private WebElement Bye;
@FindBy(xpath = "(//label[@class=\"su-radio-label\"])[7]")private WebElement RedioMis;
@FindBy(xpath = "(//label[@class=\"su-radio-label\"])[8]")private WebElement RedioCnc;
@FindBy(xpath = "(//label[@class=\"su-radio-label\"])[9]")private WebElement RedioMkt;
@FindBy(xpath = "(//span[@class=\"su-checkbox-box\"])[2]")private WebElement CheckTgt;
@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement Byesubmit;
@FindBy(xpath="//label[@class=\"su-switch-control\"]")private WebElement SwitchT;
@FindBy(xpath="//button[@type=\"submit\"]")private WebElement Selsubmit;


public ZerodhaShareByeAndSell(WebDriver driver){
	PageFactory.initElements(driver, this);	
}	
public void EnterShare(String Share, WebDriver driver){
	
	WaitMeThode.FluentWait(driver, Search);
	Search.click();
	Search.sendKeys(Share);	} 
public void ClickByeButtonShare(WebDriver driver) {
	
	WaitMeThode.FluentWait(driver, Tata);
	Actions action = new Actions(driver);

 action.moveToElement(Tata).perform();
 action.moveToElement(Bye);
 action.click();
 action.perform();}			
public void RedioClick() throws InterruptedException {

	RedioMis.click();}
public void RedioClickC() {
	RedioCnc.click();}
public void MarketValueClick() {
	RedioMkt.click();}
public void CheckBoxClick() {
	CheckTgt.click();
}
public void ClickonBye() {
	Byesubmit.click();
}
public void ClickOnSwitchT() {
	SwitchT.click();
}
public void ClickOnSeelSubmit() {
	Selsubmit.click();
}

}
