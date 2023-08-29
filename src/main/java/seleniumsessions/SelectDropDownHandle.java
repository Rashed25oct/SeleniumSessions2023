package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/orangehrm-30-day-trial");
		Thread.sleep(2000);
		
		By Country = By.id("Form_getForm_Country");
//		WebElement country_ele = driver.findElement(Country);
//		Select select = new Select(country_ele);
//		select.selectByIndex(5);
//  	select.selectByVisibleText("Bangladesh");
//		select.selectByValue("United States");
		
		doSelectDropDownByIndex(Country, 5);
		doSelectDropDownByVisibleText(Country, "Brazil");
		

	}
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
		
	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		
		if(index<0) {
			System.out.println("please pass the positive index");
			return;}
		Select select= new Select(getElement(locator));
		select.selectByIndex(index);
		}
     public static void doSelectDropDownByVisibleText(By locator, String visibleText) {
		
		if(visibleText==null) {
			System.out.println("please pass the right visibleText and it can not be null");
			return;}
		Select select= new Select(getElement(locator));
		select.selectByVisibleText(visibleText);}
     
     public static void doSelectDropDownByValue(By locator, String value) {
 		
 		if(value==null) {
 			System.out.println("please pass the right visibleText and it can not be null");
 			return;}
 		Select select= new Select(getElement(locator));
 		select.selectByValue(value);}
     
     
	
	
	
	
	
}
