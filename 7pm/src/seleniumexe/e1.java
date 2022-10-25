package seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class e1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		
		// getTitle(), getcurrentUrl()
		//title and url
		
		System.out.println(ob.executeScript("return document.title"));
		

		System.out.println(ob.executeScript("return document.URL"));
		
		ob.quit();
		
		
	}

}
