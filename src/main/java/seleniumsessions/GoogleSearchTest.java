package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
		By search = By.name("q");
		By suggestionList = By.xpath("//ul[@role='listbox']//div[@role='presentation' and @class='wM6W7d']/span");
		doSearch(search, suggestionList, "Naveen Automation Labs", "youtube");
		
		
		Thread.sleep(4000);
		List<WebElement> suggList = 
		driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='presentation' and @class='wM6W7d']/span"));
		System.out.println(suggList.size());
		for(WebElement e: suggList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("youtube")) {
				e.click();
				break;
			}
			
		}
	
	}
public static void doSearch(By searchLocator, By seacrchSuggLocator, String searchkey, String suggName ) throws InterruptedException {
            	 driver.findElement(searchLocator).sendKeys("searchkey");
            	 Thread.sleep(4000);
         		List<WebElement> suggList = 
         		driver.findElements(seacrchSuggLocator);
         		System.out.println(suggList.size());
         		for(WebElement e: suggList) {
         			String text = e.getText();
         			System.out.println(text);
         			if(text.contains("suggName")) {
         				e.click();
         				break;
         			}
         			
         		}
         	
         	}
	
}
	
	
	
	
