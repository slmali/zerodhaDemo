 package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POJO.WaitMeThode;

public class ZerodhLoginPage {
	
	
	@FindBy(xpath = "//input[@id=\"userid\"]")private WebElement Email;
	@FindBy(xpath = "//input[@id=\"password\"]")private WebElement Pass;
	@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement Button;
	@FindBy(xpath = "//a[@href=\"/forgot\"]")private WebElement Forgot;
	@FindBy(xpath = "(//a[@target=\"_blank\"])[3]")private WebElement SignUp;
@FindBy(xpath="//span[text()='Password should be minimum 6 characters.']")private WebElement Error;
	public ZerodhLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
	public void EnterEmail(String user) {
		Email.sendKeys(user);
	}
	public void EnterPass(String password) {
		Pass.sendKeys(password);
}
	public void ClickOnbutton( ) {
		
		Button.click();
}
	public void ClickOnForgot( ) {
		Forgot.click();
}
	public void ClickOnSignUp() {
		SignUp.click();
}
	public String getErrormsg() {
		String name = Error.getText();
		return name;
	}
	}

