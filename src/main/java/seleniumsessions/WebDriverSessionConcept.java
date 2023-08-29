package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverSessionConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		

		// enter the url:
		driver.get("https://www.google.com");
		

		// get the title:
		String title = driver.getTitle();
		System.out.println("act title:" + title);//Google
		System.out.println(driver.getCurrentUrl());//url
		
		driver.quit();

		


	}

}
