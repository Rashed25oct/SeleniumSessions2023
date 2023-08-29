package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=1)
	public void searchTest() {
		System.out.println("searchTest");
		Assert.assertEquals("Google", "Google");
	}
	
	@Test(priority=2)
	public void cartTest() {
		System.out.println("searchTest");
		Assert.assertEquals("macbook", "macbook");
	}
	
	@Test(priority=3)
	public void orderTest() {
		System.out.println("searchTest");
		Assert.assertEquals(1000, 1000);
	}



}
