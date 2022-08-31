package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		//linktext:   word/groupofwords=> click on => new url will be opened 
		// partial linktext
		//ob.findElementByLinkText("Privacy").click();
		
		//How Search works
		
		ob.findElementByPartialLinkText("works").click();
		
		Thread.sleep(3000);
		
		ob.quit();
		
	}

}
