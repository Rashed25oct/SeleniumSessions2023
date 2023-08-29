package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegister {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		WebElement fn= driver.findElement(By.id("input-firstname"));
		Actions act = new Actions(driver);
		
		act.sendKeys(fn, "Rashed")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("Rahman")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("rashed25oct@yahoo.com")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("0123456789")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("test1234")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("test1234")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.SPACE)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.click().perform();

	}

}
