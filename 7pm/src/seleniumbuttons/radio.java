package seleniumbuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	//classname objectname= new classname();
	ChromeDriver ob= new ChromeDriver();
	ob.get("https://courses.letskodeit.com/practice");
	
	//method1
	/*ob.findElementById("bmwradio").click();
	Thread.sleep(2000);
	
	ob.findElementById("benzradio").click();
	Thread.sleep(2000);
	
	ob.findElementById("hondaradio").click();
	Thread.sleep(2000);*/
	
	
	//method2
	//collect all the radio buttons
	// iterate through it
	// click on it 
	
	//   xpath => //*[@locator/attribute='value']
	
	// name=cars  type=radio
	
	List<WebElement> l = ob.findElementsByXPath("//*[@name='cars' and @type='radio']");
	
	// for(datatype tempvariable: nameofthecollection)
	for(WebElement x: l)
	{
		x.click();
		Thread.sleep(2000);
	}
	
	ob.quit();
	
}
}
