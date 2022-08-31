package seleniubuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		
		//checkbox=> select multiple options at a time 
		
		//method1 
		
		/*ob.findElementById("bmwcheck").click();
		Thread.sleep(2000);
		ob.findElementById("benzcheck").click();
		Thread.sleep(2000);
		
		ob.findElementById("hondacheck").click();
		Thread.sleep(2000);*/
		
		// method2
		// collecting all the checkbox
		// storing it in a list
		//iterating it
		// clicking in it
		
		List<WebElement> r = ob.findElementsByXPath("//*[@name='cars' and @type='checkbox']");
		
		for(WebElement x:r)
		{
			x.click();
			Thread.sleep(2000);
		}
		
		ob.quit();
	}

}
