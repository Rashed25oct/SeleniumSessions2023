package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By registerheader = By.tagName("h1");
		By forgotPassword = By.linkText("Forgotten Password");
		
		System.out.println(doElementGetText(registerheader));
		System.out.println(doElementGetText(forgotPassword));

//	boolean flag = driver.findElement(registerheader).isDisplayed();
//	System.out.println(flag);
		if(checkElementIsDisplayed(registerheader)) {
			System.out.println("registerheader is displayed");
			String regHeader = doElementGetText(registerheader);
			if (regHeader.equals("Register Account")) {
				System.out.println("Register Account--pass");
				
			}else {
				System.out.println("Register Account--faill");
			}
		}
	

	}
	public static boolean checkElementIsDisplayed(By locator) {
		return getElement (locator).isDisplayed();
		
		
	}
	public static String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("Element text is ===>"+eleText);
		return eleText;
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
