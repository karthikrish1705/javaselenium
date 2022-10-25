package testngannotations;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 extends a2{

	
	/*
	 before test :   once before all the test cases started its execution
	 after test:     once after all the test cases finished its execution
	 * 
	 *before class : once, after before test 
	 *after class:   once, before after test
	 *
	 *before method: run before each test case 
	 *after method:  run after each test case 
	 
	 * before test : website visisting
	 *    before class: maximising
	 *         
	 *          before method: refresh   tc1  : getting title   aftermethod : cookie deletion
	 *          before method: refresh   tc2  : click           aftermethod  : cookie deletion
	 *         
	 *          
	 *    after class : get size of the window
	 * after test : quit 
	 * 
* */
	
	@Test(priority=0)
	public void t1()
	{
		System.out.println("Test case 1 : getting title");
		System.out.println(ob.getTitle());
	}
	
	
	
	@Test(priority=1)
	public void t2()
	{
		System.out.println("Test case 2: clicking on privacy");
		ob.findElementByLinkText("Privacy").click();
	}
	
	ChromeDriver ob;
	@BeforeTest
	public void bt()
	{

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ob= new ChromeDriver();
		ob.get("http://www.google.com"); 
		System.out.println("before all : visiting the site ");
	}
	
	
	@AfterTest
	public void at() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("after all- quitting");
		ob.quit();
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class - maximising");
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class : getting sizze ");
		Dimension d = ob.manage().window().getSize();
		System.out.println("Height is "+ d.getHeight());
		System.out.println("Width is "+ d.getWidth());
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("before each test case : rrefreshing");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("after each test case : cookie deletion");
		ob.manage().deleteAllCookies();
	}
	
}
