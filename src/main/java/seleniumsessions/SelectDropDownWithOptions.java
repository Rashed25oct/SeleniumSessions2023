package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithOptions {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/orangehrm-30-day-trial");
		Thread.sleep(2000);
		
        // htmltag = select
		By Country = By.id("Form_getForm_Country");
		if(getDropDownTextList(Country).contains("Bangladesh")){
			System.out.println("pass");}
		
		List<String> expCountryOptionsList = Arrays.asList("India","Bangladesh","Aruba");
		if(getDropDownTextList(Country).containsAll(expCountryOptionsList)) {
			System.out.println(expCountryOptionsList +"is available");
			
		}
		
	}
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
		
	}
   public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();	}

	public static List<String> getDropDownTextList(By locator) {
		Select select = new Select(getElement(locator));
		
		List<WebElement>optionList = select.getOptions();
		List<String> optionTextList = new ArrayList<String>();
		
		
		for(WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			optionTextList.add(text);
			}
		return optionTextList;
		
	}
	
	
	
	
}

