package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		
		// create an object for select class
		// pass your listbox box as input
		// index/value/visible text 
		
		// select multiple options
		// deselection is also possible 
		
		WebElement ele = ob.findElementById("multiple-select-example");
		
		Select s= new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("orange");
		s.selectByVisibleText("Peach");
		
		Thread.sleep(3000);
		
		s.deselectByVisibleText("Apple");
		
		Thread.sleep(3000);
		
		ob.quit();
		
		
		
	}
}
