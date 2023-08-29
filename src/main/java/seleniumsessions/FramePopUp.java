package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// page
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		
		driver.switchTo().defaultContent();//outside of the frame
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[text()='Ok,I Agree']")).click();
		
		

	}

}
