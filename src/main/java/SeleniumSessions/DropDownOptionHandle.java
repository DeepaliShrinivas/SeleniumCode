package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptionHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		List<String>indus_list= getDropDownOptionList(industry);
		System.out.println(indus_list.contains("Electronics"));
				
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static List<String> getDropDownOptionList(By locator) {

		Select select = new Select(getElement(locator));
		
		List<String> dropdownlist=new ArrayList<String>();
		
		
		List<WebElement> optionsList = select.getOptions();
		
		System.out.println(optionsList.size());
		
		for (WebElement e : optionsList) {
			
			dropdownlist.add(e.getText());
			

		}
		return dropdownlist;
	}

}
