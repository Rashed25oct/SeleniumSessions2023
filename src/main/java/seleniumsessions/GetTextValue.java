package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextValue {

	static WebDriver driver;

	public static void main(String[] args) {
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			By firstName = By.id("input-firstname");
			
			//driver.findElement(firstName).sendKeys("Rana");// rana is the value thats why nothing print 
			//on the console and GET TEXT not allow.
//			String fn_Value = driver.findElement(firstName).getText();
//			System.out.println(fn_Value);
			
			//Use GetAttribute
			String fn_Value = driver.findElement(firstName).getAttribute("value");
			System.out.println(fn_Value);
			

	

		}
}
