package TestNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeSuite
	public void createUser() {
		System.out.println("BS--Create User");
	}
	
	@BeforeTest
	public void connectWithDB() {
		System.out.println("BT--Connect with DB");
	}
	
	@BeforeClass
	public static void launchBrowser() {
		System.out.println("Bc--launch browser");
	
	}
	
	@BeforeMethod
	public static void login() {
		System.out.println("BM--login");
		
	}
	@Test
	public static void searchTest() {
		System.out.println("Test--serachTest");
		
	}
	@Test
	public static void addToCart() {
		System.out.println("Test--addToCart");
	}
	@Test
	public static void payment() {
		System.out.println("Test--payment");
		
	}
	@AfterMethod
	public static void logout() {
		System.out.println("AM--logout");
		
	}
	
	@AfterClass
	public static void closeBrowser() {
		System.out.println("AC--serachTest");
		
	}
	@AfterTest
	public static void disconnectWithDB() {
		System.out.println("AT--disconnectWithDB");
		
	}
	@AfterSuite
	public static void deleteUser() {
		System.out.println("AS--deleteUser");
		
	}

}
