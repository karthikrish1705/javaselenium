package seleniumkey;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class controlandtab {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//control+ a=> selection
		//control+c=> copying
		// control+v => pasting
		//tab:   move cursor to the next element 
		
		
		Actions ac= new Actions(ob);
		WebElement ele = ob.findElementById("user");
		ac.click(ele).sendKeys("hi").build().perform();
		
		//control+a
		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//control+c
		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//tab
		
		ac.sendKeys(Keys.TAB).build().perform();
		
		//control+v
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//tab
		ac.sendKeys(Keys.TAB).build().perform();
		
		//click on login
		
		ac.sendKeys(Keys.ENTER).build().perform();
		
	}

}
