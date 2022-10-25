package seleniumkey;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class controlandtab {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	//classname objectname= new classname();
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.mycontactform.com");
	
	WebElement ele = ob.findElementByName("user");
	
	//control+ a  => selecting all
	// control+c =>  copying
	// control+v => pasting
	//tab        => move cursor to the next element
	
	Actions ac= new Actions(ob);
	
	ac.click(ele).sendKeys("hello").build().perform();
	
	// control+a
	
	ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
	
	// control+c
	
   ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
   
   // move cursor to the password text box => tab key
   
   ac.sendKeys(Keys.TAB).build().perform();
   
   
// control+v
	
   ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
   
// move cursor to the login => tab key
   
   ac.sendKeys(Keys.TAB).build().perform();
   
   // click on login button 
   ac.sendKeys(Keys.ENTER).build().perform();
   
}
}
