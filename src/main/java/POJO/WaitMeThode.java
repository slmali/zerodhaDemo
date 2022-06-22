package POJO;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitMeThode {
	public static FluentWait<WebDriver>  FluentWait (WebDriver driver,WebElement element   ) {
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(6000));
		wait.pollingEvery(Duration.ofMillis(50));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(element));
        return wait;
}
}
