package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/draggable/");
		
		ob.switchTo().frame(0);
		
		Actions ac= new Actions(ob);
		
		WebElement ele = ob.findElementById("draggable");
		
		System.out.println(ele.getLocation());//8,8
		
		ac.dragAndDropBy(ele, 20, 20).build().perform();
	}
}
