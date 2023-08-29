package mytest;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpencartTest extends BaseTest {

	
//	@BeforeTest
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}
	
	@Test(priority=1)
	public void TitleTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Assert.assertEquals(driver.getTitle(),"Account Login");
	}
	@Test(priority=2)
	public void URLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));
	}
	
	
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}


}
