package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	ChromeDriver ob;
	/*
	 *before test:  run only once before all the test cases started its execution
	 *after test :  run only once after all the test cases finished its execution
	 *
	 *before class: run only once, after before test
	 *after class:  run only once before after test 
	 * 
	 *before method:  run before each test case
	 *after method : run after each test case 
	 * 
	 * before test: visiting website 
	 *   before class: maximising
	 *   
	 *      before method(refres)   test case1 title    aftermethod deleting cookies
	 *      before method (refres)  test case 2 click    aftermethod  deleting cookies 
	 *     
	 *    
	 *   after class : getting url
	 * after test :  close
	 * 
	 * * 
	 * */
	
	@BeforeMethod
	public void beach()
	{
		System.out.println("before each");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void aeach()
	{
		System.out.println("after each");
		ob.manage().deleteAllCookies();
	}
	
	@Test(priority=0)
	public void t1()
	{
		System.out.println("Test case 1");
		System.out.println("title is "+ ob.getTitle());
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class");
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class");
		System.out.println(ob.getCurrentUrl());
	}
	
	@Test(priority=1)
	public void t2()
	{
		System.out.println("Test case 2");
		ob.findElementByLinkText("Images").click();
	}
	
	@BeforeTest
	public void bt()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");
		System.out.println("before Test");
	}
	
	@AfterTest
	public void at() throws InterruptedException
	{
		System.out.println("after test");
		Thread.sleep(3000);
		ob.quit();
	}
	
	

}
