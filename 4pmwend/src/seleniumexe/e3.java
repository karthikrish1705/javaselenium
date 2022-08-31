package seleniumexe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e3 {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//alert: popup/messagebox
		
		ob.executeScript("alert('TimeOut')");
		
		// switch your control to that alert
		// handle it
		
		Alert al = ob.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		
		Thread.sleep(3000);
		ob.quit();
	}

}
