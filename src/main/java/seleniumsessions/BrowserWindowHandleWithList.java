package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //w1
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();  //w2
		
		//1.fetching window IDs
		Set<String> handles = driver.getWindowHandles();
		
		//.set to list
		List<String>handlesList= new ArrayList<String>(handles);
		String parentWindowId  = handlesList.get(0);
		String childWindowId  = handlesList.get(1);
		
		//2.Switch work
		driver.switchTo().window(childWindowId);
		System.out.println("Child window url:"+driver.getCurrentUrl());
		
		//close the window:
		driver.close();
		//come back to parent window
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url:"+driver.getCurrentUrl());
		
		driver.quit();
		

	}

}
