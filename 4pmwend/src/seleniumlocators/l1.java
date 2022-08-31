package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//id=user
		ob.findElementById("user").sendKeys("Dhivyakarthi123");
		
		//name=pass
		ob.findElementByName("pass").sendKeys("12345");
		
		//classname=btn_log
		
		ob.findElementByClassName("btn_log").click();
		
		/*
		 * locators : locate web elements
		 * 
		 * 8 locators
		 * 
		 *    id
		 *    name
		 *    classname: not recommended 
		 *    
		 *    linktext
		 *    partial linktext
		 *    
		 *    tagname
		 *    xpath
		 *    css
	 * */
	}

}
