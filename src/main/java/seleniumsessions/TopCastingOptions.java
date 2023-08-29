package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		// 1.valid but not recommended
		//SearchContext sc = new ChromeDriver();
		
		//02.valid and recommended--LOCAL EXECUSION
		WebDriver driver = new ChromeDriver();
		
		//03.valid and recommended--LOCAL EXECUSION
		RemoteWebDriver driver1 = new ChromeDriver();
		
		//04.Valid only for Chrome/edge
		//ChromiumDriver driver2 = new ChromeDriver();
		//driver2 = new EdgeDriver();
		//driver2 = new FirefoxDriver();
		
		//5.valid and recommended -- used for remote execution/sel grid/cloud-AWS/docker-browser stack/LT
		//WebDriver driver3 = new RemoteWebDriver(remoteAddress, capabilities);
	

	}

}
