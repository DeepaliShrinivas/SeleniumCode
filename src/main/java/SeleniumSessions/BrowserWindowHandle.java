package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		Set<String> handles= driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		String parentWinId= it.next();
		
		System.out.println("Parent Window Id is " +parentWinId);
		
		String childWinId=it.next();
		System.out.println("Parent Window Id is " +childWinId);
		
		driver.switchTo().window(childWinId);
		System.out.println("The title of the page is=" + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWinId);
		System.out.println("The title of the page is=" + driver.getTitle());
		
		driver.quit();
		
		
		
		
	}

}
