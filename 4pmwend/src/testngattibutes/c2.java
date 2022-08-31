package testngattibutes;

import org.testng.annotations.Test;

public class c2 {

	
	@Test(timeOut=2000)
	public void trans() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("hi");
	}
}
