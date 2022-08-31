package seleniubuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class scrollers {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.seleniumeasy.com");
		/*horizontal scrollers :  move along x axis, y value will be 0
		 *    
		 *                       right: +x
		 *                       left : -x
		 *                       
		 *vertical scrollers:    move along y axis, x value will be 0
		 *
		 *                      down : +y
		 *                      up   : -y
		* 
		 * */
		//page down and page up
		/*ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");//page down
		
		Thread.sleep(3000);
		
ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//page up
		
		Thread.sleep(3000);*/
		
		
ob.executeScript("window.scrollBy(0,400)");//scroll down
		
		Thread.sleep(3000);
		
ob.executeScript("window.scrollBy(0,-400)");//scroll up
		
		Thread.sleep(3000);
	}

}
