package seleniubuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		
		// create an object for select class
		// pass your desired dropdown box in it
		// select the value => index, value or visible text 
		
		WebElement ele = ob.findElementById("carselect");
		
		Select s= new Select(ele);
		//s.selectByIndex(2);
		//s.selectByValue("benz");
		s.selectByVisibleText("Honda");
	}
}
