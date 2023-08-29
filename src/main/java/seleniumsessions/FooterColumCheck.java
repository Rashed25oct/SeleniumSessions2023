package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterColumCheck {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(5000);
		System.out.println(getfooterHeaderText("Careers"));
		System.out.println(getfooterHeaderText("Accessibility"));
		System.out.println(getfooterHeaderText("Amazon Devices"));
	    System.out.println(getfooterHeaderText("Amazon Science"));
		System.out.println(getfooterHeaderText("Shop with Points"));
		System.out.println(getfooterHeaderText("Reload Your Balance"));
		System.out.println(getfooterHeaderText("Amazon Prime"));
		System.out.println(getfooterHeaderText("Help"));
	}
	
	public static String getfooterHeaderText(String footerHeaderText)
	
	{
		String footerHeaderText1= driver
		.findElement
		(By.xpath("//a[text()='"+footerHeaderText+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
		.getText();
		
		return footerHeaderText1;
		
		


	}
	
	

}
