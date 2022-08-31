package seleniumbrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class repositioning {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	
	//create an object fr Point class 
	// pass your desired x and yin it
	// apply it on the window
	
	Point pt= new Point(300,400);
	ob.manage().window().setPosition(pt);
	
	Thread.sleep(3000);
	
	ob.quit();
}
}
