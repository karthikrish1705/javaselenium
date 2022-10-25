package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		
		/*click
		 *double click
		 *context click(right click)
		 *mouse hovering
		 *click, hold and release
		 *drag and drop
		 *drag and drop by
		 *
		 *create an object for actions class
		 *pass your driver instance 
		 *
		 * */
		WebElement ele = ob.findElementByName("btnSubmit");
		
		Actions ac= new Actions(ob);
		//ac.click(ele).build().perform();
		//ac.doubleClick(ele).build().perform();
		//ac.contextClick(ele).build().perform();
		//ac.moveToElement(ele).click().build().perform();
		ac.clickAndHold(ele).build().perform();
		Thread.sleep(3000);
		ac.release(ele).build().perform();
		
		Thread.sleep(3000);
		ob.quit();
	}

}
