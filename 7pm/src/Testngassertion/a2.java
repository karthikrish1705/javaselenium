package Testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a2 {
	
	/*
	 * SoftAsserts 
	 *     
	 *          provided by SoftAssert builtin class
	 *          non static in nature 
	 *          even if assertion fails, it will proceed further 
	 *          know the actual result of assertion=> invoke assertAll method
	 * 
	 * 
	 * 
	 * */
	
	@Test
	public void imw()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		
		ob.get("http://www.google.com");
		
		SoftAssert s= new SoftAssert();
		s.assertEquals(ob.getTitle(), "Google");//pass
		
		s.assertNotEquals(ob.getTitle(),"Google");//fail
		
		WebElement ele = ob.findElementByLinkText("Gmail");
		
		s.assertTrue(ele.isDisplayed());//pass
		
		s.assertFalse(ele.isSelected());//pass
		
		ob.quit();

		 s.assertAll();// know the actual result of asserts 
}
}