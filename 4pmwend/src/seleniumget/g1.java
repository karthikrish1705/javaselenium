package seleniumget;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		//title
		System.out.println(ob.getTitle());
		
		//url
		System.out.println(ob.getCurrentUrl());
		
		// size => height and width of the window
		//Dimension
		
		Dimension d = ob.manage().window().getSize();
		System.out.println("Height is "+ d.getHeight());
		System.out.println("width is " + d.getWidth());
		
		//position => x and y value  
		// Point 
		
		Point pt = ob.manage().window().getPosition();
		System.out.println(" x value is "+ pt.getX());
		System.out.println("Y value is "+ pt.getY());
		
		// getting browser details => capabilities 
		
		Capabilities c = ob.getCapabilities();
		System.out.println("Name is "+ c.getBrowserName());
		System.out.println("version is "+ c.getVersion());
		System.out.println("os name is "+ c.getPlatform());
		
		ob.quit();
	}
}
