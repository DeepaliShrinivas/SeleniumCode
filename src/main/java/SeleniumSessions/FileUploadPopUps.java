package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUps {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement chooseFile= driver.findElement(By.name("upfile"));
		chooseFile.sendKeys("/Users/deepalikulkarni/Downloads/UserCertificationDetails.csv");
		//to write above path, the type attribute should be there
	}

}
