package testngdependency;

import org.testng.annotations.Test;

public class d1 {
	
	//depends on methods : create connection between the test cases 
	
	
	@Test(priority=0)
	public void visiting()
	{
		System.out.println("visiting");
	}
	
	@Test(priority=1,dependsOnMethods="visiting")
	public void login()
	{
		System.out.println("login");
	}

	
	// visiting : pass     login : run
	// visiting : fail     login : skipped 
}
