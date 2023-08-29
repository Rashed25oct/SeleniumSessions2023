package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAccount {
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		
		
		By fn_xpath = By.xpath("//*[@id=\"input-firstname\"]");
		By ln_xpath = By.xpath("//*[@id=\"input-lastname\"]");
		By email_name = By.name("email");
		By tp_css = By.cssSelector("#input-telephone");
		By password_xpath = By.xpath("//*[@id=\"input-password\"]");
		By conPasword_xpath = By.xpath("//*[@id=\"input-confirm\"]");
		
		By radiolineOneYES_xpath = By.xpath("(//input[@name='newsletter'])[position()=1]");//custom xpath
		By radiolinetwoNO_xpath = By.xpath("(//input[@name='newsletter'])[position()=2]");//custom xpath
        By priPoliBox_name = By.name("agree");
		By continue_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
			
		doSendKeys(fn_xpath, "Rashed");
		doSendKeys(ln_xpath,"Rahman");
		doSendKeys(email_name,"rashed25oct@yahoo.com");
		doSendKeys(tp_css,"0123456789");
		doSendKeys(password_xpath,"test1234");
		doSendKeys(conPasword_xpath,"test1234");
		
		doClick(radiolineOneYES_xpath);
		doClick(radiolinetwoNO_xpath);
		doClick(priPoliBox_name);
		doClick(continue_xpath);
		
		/*
		 if(text.contains("Warning: E-Mail Address is already registered!" )) {
			System.out.println("A new account has been created.");
		}
		else
		{
			System.out.println("RegisterAccount creation fail.");
		}
		
	*/

	}
	
	public static WebElement getElement (By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	

}
