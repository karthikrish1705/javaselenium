package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		//linktext:   word/group of words=> having link inside it  
		//partial linktext 
		
		// no need for code inspection
		
		//ob.findElementByLinkText("Privacy").click();
		
		//How Search works
		
		ob.findElementByPartialLinkText("Search").click();
		
		Thread.sleep(3000);
//		;
		ob.quit();
	}
}
