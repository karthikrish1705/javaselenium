package testngdepemdency;

import org.testng.annotations.Test;

public class d2 {
	
	@Test(priority=0, groups="o")
	public void user()
	{
		System.out.println("entering username");
	}
	
	@Test(priority=1, groups="o")
	public void pass()
	{
		System.out.println("Entering password");
	}
	
	@Test(priority=2, groups="o")
	public void login()
	{
		System.out.println("performing login");
	}
	
	@Test(priority=3, dependsOnGroups="o")
	public void home()
	{
		System.out.println("home");
	}
	
	//group0: user, pass, login :  3 pass=> home pass
	//      even 1 fail                  => home skipped 

}
