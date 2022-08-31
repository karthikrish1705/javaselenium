package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		//images=> img
		// link=> a
		// elements=> div, input, select, li...
		
		// number of images, elemnts with div, input
		
		// number of images, links, div, li , input 
		
		List<WebElement> l1 = ob.findElementsByTagName("img");
		System.out.println("Number of images : "+ l1.size());
		
		
		List<WebElement> l2 = ob.findElementsByTagName("a");
		System.out.println("Number of links : "+ l2.size());
		
		
		List<WebElement> l3 = ob.findElementsByTagName("input");
		System.out.println("Number of elements with input : "+ l3.size());
		
		ob.quit();
	}
}
