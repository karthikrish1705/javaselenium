package seleniumget;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		//title 
		System.out.println("Title is "+ ob.getTitle());
		//url
		System.out.println("URL is :"+ ob.getCurrentUrl());
		
		// size of the window
		// size: height and weight 
		//Dimension
		
		Dimension d = ob.manage().window().getSize();
		System.out.println("Height is "+ d.getHeight());
		System.out.println("width is "+ d.getWidth());
		
		// position of the window
		// position: x and y value of the window
		// Point
		
		Point p = ob.manage().window().getPosition();
		System.out.println("X value is "+ p.getX());
		System.out.println("Y value is "+ p.getY());
		
		//getting browser details 
		
		// browser=> capabilties - builtin interface 
		Capabilities c = ob.getCapabilities();
		System.out.println("Browser name is "+ c.getBrowserName());
		System.out.println("Version is "+ c.getVersion());
		System.out.println("Os name is "+ c.getPlatform());
		
		ob.quit();
		
		
	}

}
