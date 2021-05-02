package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignementFrame {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("DeepaliK");
		driver.findElement(By.name("password")).sendKeys("testing123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//driver.switchTo().frame(driver.findElement(By.linkText("Contacts")));
		
		driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
				
		

	}

}
