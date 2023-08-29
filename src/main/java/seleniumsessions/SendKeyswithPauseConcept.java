package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeyswithPauseConcept {
	static WebDriver driver;

	public static void main(String[] args)  {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		WebElement fn= driver.findElement(By.id("input-firstname"));
		Actions act = new Actions(driver);
		
		String value ="RashedRahman";
		
		
		char ch[]=value.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			//act.sendKeys(fn, String.valueOf(ch[i]++)).pause(500).perform();
			
			act.sendKeys(fn, String.valueOf(ch[i]+" ")).pause(500).perform();//R a s h e d R a h m a n
			
			//act.sendKeys(fn, String.valueOf(ch[i]+"_")).pause(500).perform();//R_a_s_h_e_d_R_a_h_m_a_n
		}
		
		
		
	}

}
