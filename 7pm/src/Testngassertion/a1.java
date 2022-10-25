package Testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class a1 {
	
	/*
	 * assertion: technique where we will be comparing actual result with the obtained result
	 * 
	 * hard assert
	 * soft asserts
	 * 
	 * Hard asserts
	 *         provided by Assert builtin class 
	 *         static in nature 
	 *         if assertion fails, it wont proceed further , it will stop the execution
	 *           make it fail 
	 *           
	 *           
	 *SoftAsserts 
	 *     
	 *          provided by SoftAssert builtin class
	 *          non static in nature 
	 *          even if assertion fails, it will proceed further 
	 *          know the actual result of assertion=> invoke assertAll method
	 *          
	 * assertEquals(actual, expected)
	 * assertNotEquals(actual, expected)
	 * assertTrue(condition)
	 * assertFalse(condition)         
	 * * 
	 * */

	@Test
	public void imw()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		
		ob.get("http://www.google.com");
		Assert.assertEquals(ob.getTitle(), "Google");//pass
		
		//Assert.assertNotEquals(ob.getTitle(),"Google");//fail
		
		WebElement ele = ob.findElementByLinkText("Gmail");
		
		Assert.assertTrue(ele.isDisplayed());//pass
		
		Assert.assertFalse(ele.isSelected());//pass
		
		ob.quit();
		
		
	}

}
