package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class GetAttribute {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By forgotPassword = By.linkText("Forgotten Password");
		By firstName = By.id("input-firstname");
		By logoImage = By.className("img-responsive");
		
		
//		String forgotpwd_href = driver.findElement(forgotPassword).getAttribute("href");
//		System.out.println(forgotpwd_href);
//		
//		String fn_placeholder_val = driver.findElement(firstName).getAttribute("placeholder");
//		System.out.println(fn_placeholder_val);
//		
//		WebElement logo_ele = driver.findElement(logoImage);
//		String srcVal = logo_ele.getAttribute("src");
//		String titleVal= logo_ele.getAttribute("title");
//      String alVale=logo_ele.getAttribute("alt");
//      System.out.println(srcVal);
//		System.out.println(titleVal);
//		System.out.println(alVale);
		
		String srcVal = getElementAttribute(logoImage,"src");
		System.out.println(srcVal);
		String titleVal = getElementAttribute(logoImage,"title");
		System.out.println(titleVal);
		String altVal = getElementAttribute(logoImage,"alt");
		System.out.println(altVal);
		String fn_placeholder_val = getElementAttribute(firstName,"placeholder");
		System.out.println(fn_placeholder_val);
		String forgotpwd_href = getElementAttribute(forgotPassword,"href");
		System.out.println(forgotpwd_href);


	}
	public static String getElementAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public static  WebElement getElement(By locator) {
        return driver.findElement(locator);
	}
	
	
	
	
}
