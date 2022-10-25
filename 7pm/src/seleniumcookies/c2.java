package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2 {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		
		 Set<Cookie> c1 = ob.manage().getCookies();
			System.out.println("Number of cookies before deletion : "+ c1.size());
			
		
		ob.manage().deleteAllCookies();
		
		 Set<Cookie> c = ob.manage().getCookies();
			System.out.println("Number of cookies after deletion : "+ c.size());
			
	     ob.quit();
	}

}
