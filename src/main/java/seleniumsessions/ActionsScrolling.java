package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).perform();

		//Completely Scroll down/up with one shot.
		//With control button or command button(mac)(control n command are work for Windows)
		//act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
		//kye up
//		Thread.sleep(2000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
		
		//SCROLL TO ELEMENT:
		act.scrollToElement(driver.findElement(By.linkText("Help")))
		.click(driver.findElement(By.linkText("Help"))).perform();
		
		// refresh:f5
		//act.keyDown(Keys.DOWN).sendKeys(Keys.F5).keyUp(Keys.COMMAND);
		
		driver.navigate().refresh();
		
		
		
		
		

	}

}
