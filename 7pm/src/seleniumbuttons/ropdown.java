package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		
		// create an object for select class
		// pass your dropdown box as input
		// index/value/visible text 
		// only one option at a time
		// you cannot select multiple options
		
		WebElement ele = ob.findElementById("carselect");
		
		Select s= new Select(ele);
		//s.selectByIndex(1);
		//s.selectByValue("benz");
		s.selectByVisibleText("Benz");
	}
}
