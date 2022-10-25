package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		// facebook => number of images, links, div 
		
		// tagname: cannot be used to find a single element
		
		// images=> img
		// links => a
		// elements=> div, input, select, li
		
		// webdriver: interface : create communication between pages
		//webelement: interface : create communication between element
		
		List<WebElement> i = ob.findElementsByTagName("img");
		System.out.println("Number of images "+ i.size());
		
		List<WebElement> i1 = ob.findElementsByTagName("a");
		System.out.println("Number of links "+ i1.size());
		
		List<WebElement> i2 = ob.findElementsByTagName("input");
		System.out.println("Number of elements with input tag "+ i2.size());
		
		ob.quit();
	}

}
