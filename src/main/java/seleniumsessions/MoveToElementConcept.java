package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?/txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
//		Thread.sleep(3000);
//		
//		WebElement parentMenue = driver.findElement(By.className("menulink"));
//		
//		
//		act.moveToElement(parentMenue).perform();//only .build not work
//		//act.moveToElement(parentMenue).build().perform();
//		Thread.sleep(1500);
//		driver.findElement(By.linkText("COURSES")).click();//capital letter
//		//Homework: use small letter
//		//driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")).click();

		
		By parentMenu = By.className("menulink");
		By childMenu = By.linkText(" ARTICLE");
		
		
		
		twolevelMenuHandling(parentMenu,childMenu);
		
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void twolevelMenuHandling (By level1MenuLocator, By level2MenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1MenuLocator)).perform();
		Thread.sleep(1500);
		getElement(level2MenuLocator).click();
	}
}

	
	
	
	
	
	
	
	
	
	
	
	

