package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		selectEmployee("Joe.Root");
		selectEmployee("Garry.White");
		
		System.out.println(getEmpInfo("Joe.Root"));
		System.out.println(getEmpInfo("Garry.White"));
		
	}

	public static void selectEmployee(String empName) {
		driver
		.findElement
		(By.xpath("//a[text()='"+empName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
		.click();
		
	}
	
	public static List<String> getEmpInfo(String empName) {
		List<WebElement> infolist = 
				driver.findElements(By.xpath("//a[text()='"+empName+"']/parent::td/following-sibling::td"));
		System.out.println(infolist.size());
		
		List<String>infoValList = new ArrayList<String>();
		for(WebElement e :infolist) {
			String text = e.getText();
			infoValList.add(text);
		}
		return infoValList;
	}
	
	
}




