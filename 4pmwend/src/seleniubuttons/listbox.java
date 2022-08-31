package seleniubuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		
		// create an object for select class
		// pass your desired list box in it
		// select the value => index, value or visible text 
		
		// can select multiple options
		//deselection is possible 
		
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
