package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l4 {
	public static void main(String[] args) {
		
		//xpath : xml path language
		
		// relative xpath
		// absolute xpath
		
		// absolute xpath: from the root to the desired element 
		
		//               : copy=> copy full xpath 
		
		//               /html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input
		
		
		//relative xpath : 
		
		//        syntax:    //*[@locator/attribute='value']      or    //tagname[@locator/attribute='value']
		
		//       shortcut :   copy=> copy xpath 
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//locator
		ob.findElementByXPath("//input[@id='user']").sendKeys("Dhivyakarthi123");
		
		//type=password
		ob.findElementByXPath("//*[@type='password']").sendKeys("12345");
		
		// shortcut : copy=> copy xpath
		ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
	}

}
