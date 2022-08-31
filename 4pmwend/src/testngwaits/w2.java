package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class w2 {
	
	/*
	 * explicit wait - time limit is applicable for certain builtin conditions
	 * 
	 *       create an object for webdriverwait class
	 *       pass your driver instance and time limit as input
	 *       call untill method
	 *       inside untill method call methods from Expectedconditions class
	 *  * 
	 * code is correct:  executes within time limit, it wont wait for the completion of time limit, it will procceed further
	 * code is wrong:   wait for the completion of time limit, then it will throw up error
	  ** 
	 * */

	@Test
	public void hard()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		WebDriverWait w= new WebDriverWait(ob,5);
		//title
		//w.until(ExpectedConditions.titleIs("yahoo"));//5 
		//w.until(ExpectedConditions.titleContains("oo")); //5
		
		//presence of alert
		//w.until(ExpectedConditions.alertIsPresent());//5
		
		//visibility of an element
		// find the element and check its visibility
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));//5
		
		// element is clickable or not
		// finding the element andchecking whether it is clickable
		
		//w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));//5
		
		//visibility of more than one element
		// images=> visible or not
		// collecting all the images, checking visibility
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		
		// number of elements
		w.until(ExpectedConditions.numberOfElementsToBe(By.tagName("img"), 1));
		
		ob.quit();

}}
