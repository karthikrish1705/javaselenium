package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//cookies=> temporary information stored  by the browser
		
		 Set<Cookie> c = ob.manage().getCookies();
		System.out.println("Number of cookies : "+ c.size());
		
		// iterate through the set
		// enhanced for loop:   for(datatype tempvariable: name)
		
		for(Cookie x:c)
		{
			System.out.println("Name : "+ x.getName());
			System.out.println("value : "+ x.getValue());
			System.out.println("Expiry date : "+ x.getExpiry());
			System.out.println();
		}
		
		Thread.sleep(3000);
		
		ob.quit();
	}
}
