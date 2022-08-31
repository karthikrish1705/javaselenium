package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class a1 {
//assertion: technique : where we will be comparing actual result with obtained result
	//assertEquals(actual,expected)
	//assertnotEquals(actual,expected)
	//assertTrue(condition)
	//assert False(condition)
	
	/*hard asserts
	 *         provided by Assert builtin class
	 *         static in nature
	 *         assertion fails, it wont proceed further
	 *         assertion pass, it will procceeed further 
	 *         
	 *         
	 soft Assert
	 
	          provided by softassert builtin class
	          non static in nature
	          assertion fail=> it will procceed further
	          original => asseertAll() * 
	 * 
	 * */
	
	@Test
	public void hard()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(), "yahoo");//fail
		Assert.assertNotEquals(ob.getTitle(),"yahoo");//pass
		WebElement ele = ob.findElementByLinkText("Images");
		Assert.assertTrue(ele.isDisplayed());//pass
		Assert.assertFalse(ele.isSelected());//pass
		ob.quit();
	}
	
	
}
