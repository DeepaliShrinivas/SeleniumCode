package TestNgSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public static void loginTest() {
	System.out.println("Login Test");
	//int i=9/0;
	}
	
	@Test(dependsOnMethods= "loginTest", priority=1)
	public static void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test(dependsOnMethods="loginTest",priority=2)
	public static void paymentTest() {
		System.out.println("PaymentTest");
		
	}

}
