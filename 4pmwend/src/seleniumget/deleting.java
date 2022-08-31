package seleniumget;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		
		Set<Cookie> c = ob.manage().getCookies();
		
		// count its number
		
		System.out.println("Number of cookies  before deletion"+ c.size());
		
		ob.manage().deleteAllCookies();
		
		Set<Cookie> c1 = ob.manage().getCookies();
		
		// count its number
		
		System.out.println("Number of cookies after deletion "+ c1.size());
		
		ob.quit();
	}
}
