package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFieldElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		List<WebElement> textLink= driver.findElements(By.xpath("//input[@class='form-control']"));
		System.out.println("The number of Text fileds =" + textLink.size());
		
		if(textLink.size()==6) {
			System.out.println("Yes.. all fields are there");
			
		}
		
		for(WebElement e: textLink) {
			e.sendKeys("testing");
		}
		

		}
		

	}


