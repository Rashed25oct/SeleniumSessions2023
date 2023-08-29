package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyswithNull {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		//driver.findElement(firstName).sendKeys("null");//it like a text
		//driver.findElement(firstName).sendKeys(null);//nothing entry
		driver.findElement(firstName).sendKeys("");//nothing entry

	}

}
