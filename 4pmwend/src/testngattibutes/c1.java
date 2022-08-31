package testngattibutes;

import org.testng.annotations.Test;

public class c1 {
	
	/*TestNG=> TestNext Generation
	 * 
	 *      write test cases
	 *      reports will be generated 
	 *      annotations
	 *      assertion
	 *      parameterisation
	 *      suite execution
	 *      grouping 
	 *      
	 *      
	 *  test case 
	 *       non static in nature
	 *       it will have  @Test annotation before it
	 *       alphabetical order 
	 *       
	 *       
	 *    Attributes
	 *    
	 *       priority : arrange the test case in a particular order
	 *       description:  make a short note on the test case 
	 *       invocation count: run the same test case for multiple time 
	 *       groups:  group 
	 *       enabled=false ; disable the test case for the current run
	 *       timeout : fix timelimit for the test case 
	  * 
	 * */
	@Test(priority=0,description="ONE",invocationCount=3,groups="W",enabled=false)
	public void t1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=1,description="TWO",groups="W")
	public void ab()
	{
		System.out.println("Test case 2");
	}
	
	
	@Test(priority=2,description="THREE",groups="P")
	public void cd()
	{
		System.out.println("Test case 3");
	}

}
