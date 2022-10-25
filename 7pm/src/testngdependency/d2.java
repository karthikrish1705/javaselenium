package testngdependency;

import org.testng.annotations.Test;

public class d2 {
	
	//depends ob groups : create connection between test cases and group
	
	@Test(priority=0, groups="l")
	public void enteringusername()
	{
		System.out.println("entering username");
	}
	
	
	@Test(priority=1, groups="l")
	public void enteringpassword()
	{
		System.out.println("entering password");
	}
	
	@Test(priority=2, groups="l")
	public void login()
	{
		System.out.println("clicking on login ");
	}
	
	@Test(priority=3, dependsOnGroups="l")
	public void home()
	{
		System.out.println("home");
	}

	// groupl : 3        => pass              home=> pass
	// even if one fail                       home=> skipped
}
