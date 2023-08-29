package testngsessions;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@BeforeSuite
	public void connectwithDb() {
		System.out.println("BS  -- connectwithDb");
	}
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
		Assert.assertEquals("Google", "Google");
	}

}
