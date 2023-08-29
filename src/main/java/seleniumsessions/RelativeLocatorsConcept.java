package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class RelativeLocatorsConcept {

	public static void main(String[] args) {
		//selenium 4.x feature
	                         //above	
		//    left<------------ele------------->right
                           //below		
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		driver.manage().window().maximize();
		
		WebElement ele= driver.findElement(By.linkText("Sudbury, Canada"));
		
		//Right of the ele:
		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		//Left of the ele:
		String leftRank= driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		//below of ele
		String belowCity= driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		//Above of ele
		String aboveCity= driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		//near of ele
		String nearCity= driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearCity);
		
		List<WebElement> belowElements = driver.findElements(with(By.xpath("//div[@id='most_pollutedCitiesRank']/p"))
				.below(ele));
		System.out.println(belowElements.size());
		for(WebElement e: belowElements) {
			System.out.println(e.getText());
		}


	
		
		
		
		
		
		
		
		
		
		

	}

}
