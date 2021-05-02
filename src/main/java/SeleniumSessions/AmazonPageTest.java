package SeleniumSessions;

public class AmazonPageTest {

	public static void main(String[] args) {
		String browserName="Chrome";
		
		BrowserUtility br=new BrowserUtility();
		br.launchBrowser(browserName);
		
		br.launchUrl("https://www.amazon.com.au/");
		
		String title=br.getPageTitle();
		if (title.contains("Shop online")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect title");
			
		}
		
		if(br.getPageUrl().equals("https://www.amazon.com.au/")){
			System.out.println("Pointing to the right URL");	
		}
		
		br.closeBrowser();
		
	}

}
