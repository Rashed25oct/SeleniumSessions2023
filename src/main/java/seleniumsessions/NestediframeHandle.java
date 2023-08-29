package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestediframeHandle {
	/*
	 * A browser window can have multiple iframes inside it, like iFrame f1 and iFrame f2. 
	 * These iframes can further have child iframes like iframe cf1 is inside iframe f1. 
	 * This arrangement is nested iframes.
	 */

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		//page
		driver.get("https://selectorshub.com/iframe-scenario/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("first crush");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("current crush");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("destiny crush");
		
		// now come back to parent("pact2");/Use selenium 4. x
		//pact2
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("update 2");
		//pact1
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys(" my first crush update");
		
		//back to page/browser context
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();/D.C take u to the parent page
		String h3Text= driver.findElement(By.tagName("h3")).getText();
		System.out.println(h3Text);
		
		

	}

}
