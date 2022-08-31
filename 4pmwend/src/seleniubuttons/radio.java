package seleniubuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		
		//radio => at a tme u can select only one radio
		
		//method1 
		/*
		ob.findElementById("bmwradio").click();
		Thread.sleep(2000);
		ob.findElementById("benzradio").click();
		Thread.sleep(2000);
		
		ob.findElementById("hondaradio").click();
		Thread.sleep(2000);*/
		
		// method2
		// collecting all the radio buttons
		// storing it in a list
		//iterating it
		// clicking in it
		
		List<WebElement> r = ob.findElementsByXPath("//*[@name='cars' and @type='radio']");
		
		for(WebElement x:r)
		{
			x.click();
			Thread.sleep(2000);
		}
		
		ob.quit();
	}
}
