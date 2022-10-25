package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		
		//horizontal slider: move along x axis , y value will be 0
		// vertical slider : move along y axis, x value will be 0
		
		ob.get("https://jqueryui.com/slider/");
		ob.switchTo().frame(0);
		
		Actions ac= new Actions(ob);
		WebElement ele = ob.findElementById("slider");
		
		ac.dragAndDropBy(ele, 40, 0).build().perform();
		
		Thread.sleep(3000);
		ob.quit();
	}
}
