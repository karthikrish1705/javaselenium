package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	// added a jar
	// right clicked=> project=> properties=> java buildpath
	//       libraris=> classpath=> add externarl => select=> apply and close
	
	
	// chrome browser=> chrome driver
	// edge browser=> edge driver
	
	//step1: configuring chromedriver
	//step2: create an object for chromedriver class 
	//step3: visiting the site 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		// maximise
		//ob.manage().window().maximize();
		
		//fullscreen
		
		//ob.manage().window().fullscreen();
		
		
		// refresh
		
		ob.navigate().refresh();
		
		// wait fr certain seconds
		
		Thread.sleep(3000);
		
		//close 
		ob.quit();
		
	}
}
