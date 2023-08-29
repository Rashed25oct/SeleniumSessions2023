package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickinfoScoreTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-cricket-world-cup-qualifier-2023-1377745/ireland-vs-oman-4th-match-group-b-1377749/full-scorecard");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(null));
		

	}

}
