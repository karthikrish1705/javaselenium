package seleniumouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");
		// webelements=> present inside a frame=> switch your control to that frame
		
		// frame=> id, name or index 
		
		//index=0
		ob.switchTo().frame(0);
		
		Actions ac= new Actions(ob);
		
		WebElement ele = ob.findElementById("draggable");
		
		WebElement ele1 = ob.findElementById("droppable");
		
		ac.dragAndDrop(ele, ele1).build().perform();
		
		Thread.sleep(3000);
		
		ob.quit();
	}

}
