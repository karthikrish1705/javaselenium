package seleniumnavigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class n1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		
		ob.get("http://www.google.com");   //step1
		
		Thread.sleep(3000);
		
		ob.findElementByLinkText("Images").click();  //step2
		
		Thread.sleep(3000);
		
		// move back to step1
		
		ob.navigate().back();
		
		Thread.sleep(3000);
		
		// mve forward to step2
		
		ob.navigate().forward();
		
		Thread.sleep(3000);
		
		ob.quit();
	}

}
