package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import customException.FrameworkExceptions;


/**
 * 
 * @author rashe
 *
 */

public class BrowserUtil {
	private WebDriver driver;
	/**
	 * This method is used to initialize the driver on the basis of given browser name.
	 * valid browsers= chrome/firefox/edge
	 * @param browserName
	 */
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("browser name is :"+browserName);
		
		if(browserName==null) {
			System.out.println("browser can not be null");
			throw new FrameworkExceptions("BROWSERCANNOTBE NULL");
				
		}
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		

		default:
			System.out.println("plz pass the right borwser name..."+browserName);
			throw new FrameworkExceptions("NOTVALIDBROWSER");
		}
		return driver;
		
		}
		/**
		 * 
		 * @param url
		 */
	public void enterUrl(String url) {
		if(url.contains("http")) {
			driver.get(url);
		}
		else {
			throw new FrameworkExceptions("url should have http(s)");
		}
	}
	
	public String getPageTitle() {
		return driver.getTitle();	
	}
	public String getPageURL() {
		return driver.getCurrentUrl();
		}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
		
		
		
	}
	
	
	
	
	
	
	


