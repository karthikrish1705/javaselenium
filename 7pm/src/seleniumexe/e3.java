package seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class e3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		
		ob.get("http://www.seleniumeasy.com");
		
		/*horizontal scroller:   move alomg x axis, y value wll be 0
		 *               right side:   +x value
		 *               left side :   -x value
		 *               
		 *vertical scroller : move along y axis, x value will be 0
		 *              down: +y
		 *              up  : -y * 
		 * 
		 * */
		
		// method1 : 
		
		/*ob.executeScript("window.scrollBy(0,500)");// scroll down
		
		Thread.sleep(3000);
		
ob.executeScript("window.scrollBy(0,-500)");// scroll up
		
		Thread.sleep(3000);*/
		
		
		//method2:
		
ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");// page down
		
		Thread.sleep(3000);
		
ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");// page up
		
		Thread.sleep(3000);
		
		ob.quit();
	}
}
