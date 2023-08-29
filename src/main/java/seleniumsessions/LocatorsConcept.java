package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// create a webelement + perform action(click,sendkey/write
		// something,gettext,isDisplayed)

		driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/signup");
//		//1
//		driver.findElement(By.id("email-address")).sendKeys("rashed25oct@yahoo.com");
//		driver.findElement(By.id("password")).sendKeys("");
//		
//		//2.Different way

		/*
		 * WebElement emailId = driver.findElement(By.id("email-address"));
		 * 
		 * WebElement password = driver.findElement(By.id("password"));
		 * 
		 * emailId.sendKeys("rashed25oct@yahoo.com"); password.sendKeys("");
		 * 
		 * 
		 * 
		 * //3.By locator By email_id = By.id("email-address"); By pass_id
		 * =By.id("password");
		 * 
		 * WebElement emailId = driver.findElement(email_id);
		 * 
		 * WebElement password = driver.findElement(pass_id);
		 * 
		 * emailId.sendKeys("rashed25oct@yahoo.com"); password.sendKeys("");
		 * 
		 * 
		 * //4. By.locator with web element generic method
		 * 
		 * By email_id = By.id("email-address"); By pass_id =By.id("password");
		 * 
		 * getElement(email_id).sendKeys("rashed25oct@yahoo.com");
		 * getElement(pass_id).sendKeys("");
		 * 
		 * 
		 * //5.By.locator with web element and action generic method
		 * 
		 * By email_id = By.id("email-address"); By pass_id =By.id("password");
		 * 
		 * doSendKeys(email_id,"rashed25oct@yahoo.com"); doSendKeys(pass_id," ");
		 */

		// 6. By.locator with web element and action generic method in a Utility class
		By email_id = By.id("email-address");
		By pass_id = By.id("password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email_id, "rashed25oct@yahoo.com");
		eleUtil.doSendKeys(pass_id, "");

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

}
