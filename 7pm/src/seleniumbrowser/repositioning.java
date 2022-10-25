package seleniumbrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class repositioning {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//point : x and y 
		// create an object for point 
		// pass your desired x and y value
		// apply it on the window
		
		//400,400
		
		Point pt= new Point(500,500);
		ob.manage().window().setPosition(pt);
		
		Thread.sleep(3000);
		
		ob.quit();
	}
}
