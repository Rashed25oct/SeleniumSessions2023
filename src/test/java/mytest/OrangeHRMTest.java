package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{
	

//	
//	@BeforeTest
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}
	
	@Test(priority=1)
	public void TitleTest() {
		driver.get("www.orangehrm.com/en/30-day-free-trial");
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
	}
	@Test(priority=2)
	public void URLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("30-day-free-trial"));
	}
	
	
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}


}


