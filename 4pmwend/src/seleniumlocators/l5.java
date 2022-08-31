package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//xpath : xml path language
		
		//Relative xpath
		// absolute xpath
		
		// absolute xpath : from the root to the desired destination
		//      copy=> copy full xpath : /html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input
	
		 
		// realtive xpath : 
		
		// syntax  : //*[@locator/attribute='value']
		// shortcut : copy=> copy xpath
		
		//id=user
		ob.findElementByXPath("//*[@id='user']").sendKeys("Dhivyakarthi123");
		
		//type=password
		ob.findElementByXPath("//*[@type='password']").sendKeys("12345");
	
	
		// copy=> copy xpath
		
		ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
	}
}
