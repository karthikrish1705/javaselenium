package seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		// getElementById
		
		//getElementsByName
		
		//getElementsByTagname
		
		// find, send, click
		
		ob.executeScript("document.getElementById('user').value='Dhivyakarthi123'");
		
		ob.executeScript("document.getElementById('pass').value='12345'");
		
		ob.executeScript("document.getElementsByName('btnSubmit')[0].click()");
	}

}
