package mytest;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	@Test
	public void loginTest() {
		System.out.println("login to app");
	}
	
	
	@Test(dependsOnMethods="loginTest")
	public void appSearchTest() {
		System.out.println("appSearchTest");
	}
	
	
	@Test(dependsOnMethods="appSearchTest")
	public void selectProductTest() {
		System.out.println("selectProductTest");
	}
	
	

}
