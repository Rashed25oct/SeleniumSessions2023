package seleniumsessions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignatureActions {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.ChromeDriver().setup();
		WebDriver driver= new ChromeDriver() ;
		driver.get("https://signature-generator.com/draw-signature/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement canvas = driver.findElement(By.id("signature-pad"));
		Actions act= new Actions(driver);
		
		org.openqa.selenium.interactions.Action signature = act.click(canvas)
		.moveToElement(canvas,3,3)
		.clickAndHold(canvas)
		.moveToElement(canvas,-200,-50)
		.moveByOffset(50,-50)
		.moveByOffset(50,-50)
		.moveByOffset(3, 3)
		.release(canvas)
		.build();
		
		signature.perform();
	

	
	
	
	
	
	
	}
}
