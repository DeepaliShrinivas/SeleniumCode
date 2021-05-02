package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		String userName="admin";
		String passwd="admin";
		
		driver.get("https://"+ userName + ":" + passwd + "@" + "the-internet.herokuapp.com/basic_auth");
		
		

	}

}
