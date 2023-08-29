package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
		//Headless-no browser/no UI/invisible browser
		
		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--headless");
		
		//co.setHeadless(headless)
//		Deprecated.  Use addArguments(String).
//		Recommended to use '--headless=chrome' as argument for browsers v94-108.
//		Recommended to use '--headless=new' as argument for browsers v109+.
//		Example: `addArguments("--headless=new")`.
		
		//WebDriver driver =new ChromeDriver(co);//have to have pass 'co' otherwise title open
		//WebDriver driver =new FirefoxDriver(fo);
		WebDriver driver =new EdgeDriver(eo);
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();		

	}

}
