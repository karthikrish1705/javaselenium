package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class getting {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	
	
	// cookies-> temporary information stored by the browser
	// set 
	
	Set<Cookie> c = ob.manage().getCookies();
	
	// count its number
	
	System.out.println("Number of cookies "+ c.size());
	
	// itearete through the set
	// for(datatype tempvariable: name of the collection)
	
	for(Cookie x:c)
	{
		System.out.println("Name : "+ x.getName());
		System.out.println("Value : "+ x.getValue());
		System.out.println("Path : "+ x.getPath());
		System.out.println("Expiry date : "+ x.getExpiry());
		System.out.println();
	}
	
	
	ob.quit();
}
}
