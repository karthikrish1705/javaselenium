package seleniumexe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//alert: popup/messagebox
		
		ob.executeScript("alert('Timeout')");
		
		// handle the alert
		// switch your control to the alert
		
		Thread.sleep(4000);
		
		Alert al = ob.switchTo().alert();
		al.accept();
		
		Thread.sleep(3000);
		ob.quit();
	}
}
