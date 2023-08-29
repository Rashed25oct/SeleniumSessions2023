package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	//   //htmltag[@attribute='value']
	//    htmltag= input/div/a/b....
	//    attribute= id/class/name...
	//    value= ??

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/&hubs_signup-cta=homepage-nav-login&hubs_content=www.hubspot.com/&hubs_content-cta=homepage-nav-login&_ga=2.141668594.1357504816.1686010680-73164388.1686010680");
		
		By e1 = By.xpath(null);
		By e2 = By.className(null);
		By e3 = By.className(null);
		
		driver.findElement(e1).sendKeys(null);
		driver.findElement(e2).sendKeys(null);
		
		//Contains() in xpath:

	}

}
