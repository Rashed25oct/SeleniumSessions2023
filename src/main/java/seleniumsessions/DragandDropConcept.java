package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropConcept {
	//D&D only for webElement to webElement

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		//composite action
		//act.clickAndHold(sourceEle).moveToElement(targetEle).build().perform();
		//act.clickAndHold(sourceEle).moveToElement(targetEle).perform();
		
		act.dragAndDrop(sourceEle, targetEle).perform();//single action

	}

}
