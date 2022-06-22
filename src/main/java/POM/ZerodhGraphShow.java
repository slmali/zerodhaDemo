package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POJO.WaitMeThode;

public class ZerodhGraphShow {
	@FindBy(xpath = "//input[@type=\"text\"]")private WebElement Search;
	@FindBy(xpath="(//span[@class=\"tradingsymbol\"])[1]")private WebElement Tata;
	@FindBy(xpath="(//span[@class=\"icon icon-trending-up\"])[1]")private WebElement graph;
	@FindBy(xpath="//iframe[@allowtransparency=\"true\"]")private WebElement iframe;
	@FindBy(xpath="(//div[text()=\"Compare\"])[1]")private WebElement RealGraph;
	
	
	
	public  ZerodhGraphShow(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnsearchTabandEnterShare(String Share, WebDriver driver) {
		WaitMeThode.FluentWait(driver, Search);
		Search.click();
		Search.sendKeys(Share);
		
	}
	public void MovetoShareAndClickonGraph(WebDriver driver) {
		
		WaitMeThode.FluentWait(driver, Tata);
		
		Actions action = new Actions(driver);
		action.moveToElement(Tata).perform();
		action.moveToElement(graph).click().perform();
		
		
		
	}
	
	public void SwitchtoIframe(WebDriver driver) {
		WaitMeThode.FluentWait(driver, iframe);
		
		driver.switchTo().frame(iframe);
		
	}
	public boolean ShowtheGraphisdisplayed(WebDriver driver) {
		
		WaitMeThode.FluentWait(driver, RealGraph);
		boolean status = RealGraph.isDisplayed();
		return status;
	
	
	}
	
	}

