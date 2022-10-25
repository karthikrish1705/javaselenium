package Testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class im {
	
	/*testngwait/testng synchronisation
	 * 
	 * conditional synchronisation:  explicit wait
	 * unconditional synchronisation: implicit wait, thread.sleep()
	 * 
	 * 
	 * implicit wait: once it is declared, code which is present after it will take the time limit
	 * 
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
		ob.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		ob.navigate().refresh();  //5
		
		System.out.println(ob.getTitle()); //5
		
		System.out.println(ob.getCurrentUrl());//5
		
		WebElement ele = ob.findElementByLinkText("jikj"); //5
		
		ele.click(); //5
		ob.quit(); //5
		
	}

}
