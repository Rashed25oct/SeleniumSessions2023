package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://classic.crmpro.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.name("username")).sendKeys("newautomation");
	driver.findElement(By.name("password")).sendKeys("selenium@12345");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	Thread.sleep(2000);
	
	driver.switchTo().frame("mainpanel");
	driver.findElement(By.linkText("CONTACTS")).click();
	}

}
