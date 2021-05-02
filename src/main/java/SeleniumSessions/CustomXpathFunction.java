package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpathFunction {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		getLinksElements("Forgotten Password").click();

	}
	public static WebElement getLinksElements(String text) {
		return driver.findElement(By.xpath("//a[text()='"+ text + "']"));
			
	}
	public static WebElement getLinksElements(String tag,String text) {
		return driver.findElement(By.xpath("//" + tag + "[text()='"+ text + "']"));
			
	}
	
}
