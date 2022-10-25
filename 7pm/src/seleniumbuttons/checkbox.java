package seleniumbuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		
		//method1
		/*ob.findElementById("bmwcheck").click();
		Thread.sleep(2000);
		
		ob.findElementById("benzcheck").click();
		Thread.sleep(2000);
		
		ob.findElementById("hondacheck").click();
		Thread.sleep(2000);*/
		
		// method2
		// collecting all the checkboxes
		// iterating through it
		// clicking on it 
		
		List<WebElement> c = ob.findElementsByXPath("//*[@name='cars' and @type='checkbox']");
		for(WebElement x: c)
		{
			x.click();
			Thread.sleep(1000);
		}
		ob.quit();
	}

}
