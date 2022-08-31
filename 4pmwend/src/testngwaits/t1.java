package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class t1 {

	/*
	 * testng wait/ webdrivr synchronisation
	 * 
	 *        unconditional   :   implicit wait, thread.sleep()
	 *        conditional     :   explicit wait
	 * 
	 * 
	 * implicit wait:  once it is declared, code which is present after it will take the timelimit
	 * 
	 * code is correct:  executes within time limit, it wont wait for the completion of time limit, it will procceed further
	 * code is wrong:   wait for the completion of time limit, then it will throw up error
	  * 
	 * */
	
	@Test
	public void hard()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		ob.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//5
		System.out.println(ob.getCurrentUrl());//5
		ob.navigate().refresh();//5
		WebElement ele = ob.findElementByLinkText("Im");//5
		ele.click();//5
		
		ob.quit();//5
}}
