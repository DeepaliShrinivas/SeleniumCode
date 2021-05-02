package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsConcepts {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://au.adp.com/");
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links are" + linklist.size());
		
		for(int i=0;i<linklist.size();i++) {
			String text= linklist.get(i).getText();
			
			if(!text.isEmpty()) {
				System.out.println(i + "-->" + text);
				
			}
			
		}
	}

}
