package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		//JavaScript popup handle OR Alert OR modal dialog pop ups
		//they are coming from JS alert method
		//the sysntax is alert('This is my alert')
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		
		Alert alert= driver.switchTo().alert();
		
		
		String text= alert.getText();
		System.out.println(text);
		
		//to accept the alert
		alert.accept();
		
		//to dismiss the alert
		//alert.dismiss();
		
		//to take take driver back to main screen
		driver.switchTo().defaultContent();
		
		
		
	}

}
