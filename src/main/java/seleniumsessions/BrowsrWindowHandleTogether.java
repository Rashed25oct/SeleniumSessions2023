package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsrWindowHandleTogether {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //w1
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String parentWindowId = driver.getWindowHandle();
		
		WebElement LinkedIn = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twiterEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement youTubeEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		LinkedIn.click();
		fbEle.click();
		twiterEle.click();
		youTubeEle.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);
			if(!windowId.equals(parentWindowId)) {
			driver.close();	
		}
		}
	driver.switchTo().window(parentWindowId);
	System.out.println("parent window url:"+ driver.getCurrentUrl());
	driver.quit();
}
}
