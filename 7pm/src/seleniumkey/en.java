package seleniumkey;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class en {
	
	public static void main(String[] args) {
		
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	//classname objectname= new classname();
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	
	WebElement ele = ob.findElementByName("q");
	
	Actions ac= new Actions(ob);
	
	ac.click(ele).sendKeys("selenium").sendKeys(Keys.ENTER).build().perform();
	
	//single key=> send keys 
	
	
}
}