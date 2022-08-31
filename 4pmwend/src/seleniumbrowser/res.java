package seleniumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class res {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	
	//create an object fr dimension class 
	// pass your desired height and width in it
	// apply it on the window
	
	
	Dimension d= new Dimension(400,400);
	ob.manage().window().setSize(d);
	
	
	Thread.sleep(3000);
	ob.quit();
}
}
