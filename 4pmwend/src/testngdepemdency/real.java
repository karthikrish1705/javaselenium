package testngdepemdency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class real {
	
	ChromeDriver ob;
	@Test(priority=0, description="visiting website", groups="R")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");
	}
	
	@Test(priority=1, description="maximising website", groups="R")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2, description="refreshing website", invocationCount=3, groups="R")
	public void refresh()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3, description="clicking on an element ", dependsOnGroups="R")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4, description="closing ", dependsOnGroups="R",timeOut=3000)
	public void quit() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}

}
