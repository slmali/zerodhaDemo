package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhForgotPassword {
	
	
	
	@FindBy(xpath = "//a[text()=\"Forgot user ID or password?\"]")private WebElement forgot;
	@FindBy(xpath= "//label[@for=\"radio-31\"]") private WebElement RedioButton;
	@FindBy(xpath= "(//input[@type=\"text\"])[1]") private WebElement Pan;
    @FindBy(xpath= "//label[@for=\"radio-36\"]") private WebElement RedioButton1;
	@FindBy(xpath= "(//input[@type=\"text\"])[2]") private WebElement Mobile;
@FindBy(xpath= "//a[@class=\"text-xsmall text-light reset-account-button\"]")private WebElement BackTolog;
	
	
	
	
	
	public ZerodhForgotPassword (WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
	
	
	public void ClickOnForgot() {
		forgot.click();
	}
	
	public void RedioButtonClick() {
		RedioButton.click();
	}
	
	public void EnterPan(String PanNumber) {
		Pan.sendKeys(PanNumber);
	}
	public void RedioButtonClick1() {
		RedioButton1.click();
	}
	
	public void EnterMobile(String MobNumber) {
		Mobile.sendKeys(MobNumber);
	}
	
	public void ClickOnBackToLog() {
		BackTolog.click();
	}
}
