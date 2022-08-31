package seleniubuttons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderr {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * horizontal slider: along x axis, y value will be 0
		 * vertical slider : along y axis, x value will be 0
		 * 
		 * 
		 * 
		 * */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/slider/");
		
		ob.switchTo().frame(0);
		Actions ac= new Actions(ob);
		
		WebElement ele = ob.findElementById("slider");
		
		ac.dragAndDropBy(ele, 30, 0).build().perform();
		
		//Thread.sleep(3000);
		TimeUnit.SECONDS.sleep(3);
		
		ob.quit();
	}
}
