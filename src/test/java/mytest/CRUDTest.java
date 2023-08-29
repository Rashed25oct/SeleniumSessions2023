package mytest;

import org.testng.annotations.Test;

public class CRUDTest {
	//CRUD is Create(add), Read(get), Update,Delete 
	
	int userId;
	
	@Test
	public void addUser() {
		System.out.println("adding a user");
		userId= 123;
		
	}
	
	@Test
	public void getUserTest() {
		System.out.println("get the user for user id: "+userId);
	}
	@Test
	public void updateUserTest() {
		System.out.println("update the user for user id: "+userId);
			
	}
	@Test
	public void deleteUserTest() {
		System.out.println("delete the user for user id: "+userId);
		
		
	}

}
