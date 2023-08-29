package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //w1
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();  //w2
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		System.out.println("parentWindowId:"+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("childWindowId:"+childWindowId);
		
		//Switching
		driver.switchTo().window(childWindowId);
		System.out.println("childWindowId url:"+ driver.getCurrentUrl());
		//close the child window
		driver.close();
		Thread.sleep(3000);
		//come back to parent window
		driver.switchTo().window(parentWindowId);
		System.out.println("parentWindowId url:"+driver.getCurrentUrl());
		driver.quit();
	}

}
