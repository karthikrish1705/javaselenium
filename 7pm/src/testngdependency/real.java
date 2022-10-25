package testngdependency;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class real {

	ChromeDriver ob;
	@Test(priority=0, description="website visiting", groups="p")
	public void visiting()
	{

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		 ob= new ChromeDriver();
		
		ob.get("http://www.google.com");
	}
	
	@Test(priority=1, description="max", groups="p")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2, description="refreshing", invocationCount=3, groups="p")
	public void refresh()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3, description="clicking on element", dependsOnGroups="p")
	public void click()
	{
		WebElement ele = ob.findElementByLinkText("Images");
		if(ele.isDisplayed())
		{
			ele.click();
		}
	}
	
	@Test(priority=4, description="quitting", timeOut=4000, dependsOnGroups="p")
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}
}
