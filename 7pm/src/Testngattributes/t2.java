package Testngattributes;

import org.testng.annotations.Test;

public class t2 {

	// timeout -> fix a time limit for test case 
	
	@Test(timeOut=3000)
	public void gr() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("Test case ");
	}
}
