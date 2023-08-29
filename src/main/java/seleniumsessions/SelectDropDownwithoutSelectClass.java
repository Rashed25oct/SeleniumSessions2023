package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownwithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/orangehrm-30-day-trial");
		Thread.sleep(3000);
		
		By  countryoptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		// use css as well
		
		doSelectDropDownValueUsingLocator(countryoptions, "Japan");
		
		
   	

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownValueUsingLocator(By locator, String dropDownValue) {
		List<WebElement> optionList = driver.findElements(locator);
		
		
        for(WebElement e: optionList) {
        	String text = e.getText();
        	System.out.println(text);
        	if(text.equals(dropDownValue)) {
        		e.click();
        		break;
        	}
        }
	}
	
	
	
	
	
	
}
