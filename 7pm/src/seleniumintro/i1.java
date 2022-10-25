package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class i1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		// added selenium jar:     right click=> properties=> java buildpath=> libraries=> add external jar=> selenium=> apply and close
		
		// step1: congfigure the chrmedriver
		//step2: create an object for chromedriver class 
		//step3: opening the site using chromedriver object 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//max
		//ob.manage().window().maximize();
		
		//fullscreen
		//ob.manage().window().fullscreen();
		
		//refresh
		ob.navigate().refresh();
		
		//hold the page fr certain sec
		
		Thread.sleep(3000);
		
		//close the browser 
		ob.quit();
		
		
		
	}

}
