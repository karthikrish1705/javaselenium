package Testngattributes;

import org.testng.annotations.Test;

public class t1 {
	
	/*TestNG => Test Next Generation
	 * 
	 *    create test cases
	 *    automatically reports got generated 
	 *    supports annotation
	 *    parameterisation
	 *    parallel execution
	 *    
	 *    Test case 
	 *                non static 
	 *                @Test 
	 *                default order: alphabetical order
	 *     
	 *                priority:  arrange the test case in a particular ordr
	 *                description:  short note on the test case 
	 *                groups : grouping the test case  
	 *                invocationcount:  run the same test case for multiple time 
	 *                enabled=false : ignore/disable the test case 
	 *                 
	 * */
	
	@Test(priority=0,description="This is first one",groups="ONE",invocationCount=3)
	public void t1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=1,description="this is second one",groups="ONE")
	public void ab()
	{
		System.out.println("Test case 2");
		
		
	}
	
	@Test(priority=2, description="this is third one",groups="TWO",enabled=false)
	public void t2()
	{
		System.out.println("Test case 3");
	}

}
