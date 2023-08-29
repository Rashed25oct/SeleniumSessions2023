package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotallinkConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		By links = By.tagName("a");
		
		List<WebElement> linksList = driver.findElements(links);
		int linksCount = linksList.size();		
		System.out.println("total links = " + linksCount);
		
		//1.index based loop
		
		for(int i=0; i<linksCount; i++) {
		String text = linksList.get(i).getText();
		if(!text.isEmpty()) {
			//System.out.println(text);
			//which num got the  exact text
			System.out.println(i+";"+text);	}
		}
		//2.foe each loop
		int count = 0;
		for(WebElement e : linksList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				System.out.println(count +";"+text);
			}
			count++;
		}
		
		
		
		
		
	}
	
	
	
	

}
