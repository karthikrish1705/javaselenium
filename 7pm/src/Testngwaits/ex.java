package Testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ex {
	
	 /* 
	  * 
	  * 
	  * 
	  * explicit wait:
	  *         create an object for webdriver wait class
	  *         pass driver instance and time limit as input
	  *         call until method
	  *         call conditions
	  * 
	  * code is correct: executes within time limit, it will proceed further, it wont wait for the completion of time limit
	 * code is wrong : it will wait for the completion of time limt, then it will throw up error 
	 * * 
	 * */
	
	@Test
	public void imw()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		WebDriverWait w= new WebDriverWait(ob,4);
		
		// title
		
		//w.until(ExpectedConditions.titleIs("uahjgkj"));//4
		
		//w.until(ExpectedConditions.titleContains("oo")); //4
		
		// alert
		
		//w.until(ExpectedConditions.alertIsPresent());
		
		// visibility of an element/invisibility
		
		// find the element and check its visibility
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		
		
		// visibility of more elements
		// images-> visible or not
		
		// collect all the images, check its visibility
		
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		
		// element=> clickable r not
		
		//find the element and check whether it is clickable or not
		//w.until(ExpectedConditions.elementToBeClickable(By.linkText("Privacy"))); //4
		
		//Number of elements
		// images=> 2
		
		w.until(ExpectedConditions.numberOfElementsToBe(By.tagName("img"), 2));
		
		ob.quit();
	}

}
