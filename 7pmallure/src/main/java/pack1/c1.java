package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class c1 {

	@Description("thi is first")
	@Feature("implicit wait")
	@Severity(SeverityLevel.NORMAL)

	@Test
	public void t1() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		
		ob.get("http://www.google.com");
		ob.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		ob.navigate().refresh();  //5
		
		System.out.println(ob.getTitle()); //5
		
		System.out.println(ob.getCurrentUrl());//5
		
		WebElement ele = ob.findElementByLinkText("jikj"); //5
		
		ele.click(); //5
		Thread.sleep(3000);
		ob.quit(); //5
	}
}
