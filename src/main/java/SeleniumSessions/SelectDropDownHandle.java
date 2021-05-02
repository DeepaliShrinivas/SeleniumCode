package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) {
	
		
		//select html tag
		//Use Select class in selenium (only for select html tag)
		
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry= By.id("Form_submitForm_Industry");
		By country= By.id("Form_submitForm_Country");
		
		//WebElement industry_list= driver.findElement(industry);
		
		//Select select =new Select(industry_list);
		
		//select.selectByIndex(10);
		//select.selectByValue("Travel");
		//select.selectByVisibleText("Electronics");
		
		//WebElement country_list=driver.findElement(country);
		//Select select1= new Select(country_list);
		
		//select1.selectByIndex(5);
		//select1.selectByValue("Aruba");
		//select1.selectByVisibleText("India");
		doSelectByVisibleText(industry, "Electronics");
		doSelectByVisibleText(country, "India");
		
			
	}
	
	//Creating Utility classes
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
		
	}
	
	public static void doSelectByVisibleText(By locator,String text) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	public static void doSelectByValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
		
	}

}
