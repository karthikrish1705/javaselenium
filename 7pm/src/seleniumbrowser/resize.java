package seleniumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class resize {
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//size=> Dimension
		//create an object for Dimension class
		// pass your desired height and width in it
		// apply it on the window
		
		//300,300
		
		Dimension d= new Dimension(400,500);
		ob.manage().window().setSize(d);
		
		Thread.sleep(3000);
		
		ob.quit();
		
	}

}
