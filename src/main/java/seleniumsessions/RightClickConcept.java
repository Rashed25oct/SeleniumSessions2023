package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//By contextMenuLocator = By.xpath("//span[text()='right click me']");
		
//		WebElement rightClickElement = driver.findElement(By.xpath("//span[text()='right click me']"));
		
//		Actions act = new Actions(driver);
//		act.contextClick(rightClickElement).perform();
		
//		List<WebElement> optionsList=driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root span"));
//		System.out.println(optionsList.size());
//		for(WebElement e: optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Paste")) {
//			e.click();
//			break;
//		}
//	}
		//driver.findElement(By.xpath("//span[text()='Paste']")).click();
		
		By contextMenuLocator = By.xpath("//span[text()='right click me']");
		selectrightClickoption(contextMenuLocator, "Quit");	
}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	public static void selectrightClickoption(By contextmenulocator, String optionValue) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(contextmenulocator)).perform();
		By optionLocator = By.xpath("//*[text()='"+optionValue+"']");//use * because in future if span change and use select or something
		getElement(optionLocator).click();
	}
	
	
	
	
}