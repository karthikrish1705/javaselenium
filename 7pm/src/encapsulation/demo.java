package encapsulation;

public class demo {
	
	/*encapsulation:  data hiding
	 * 
	 * declare the variable as private
	 * must not assign value straightly to the variable 
	 * 
	 * use public setters and getters to wrk with variable
	 * 
	 * setters: assign value to the variable
	 * getter: view value stored in the variable
	 * 
	 * non static in nature
	 * 
	 * */
	
	private String password;
	
	//setters
	//assign value to the variable 
	public void setp(String p)
	{
		password=p;
	}
	
	//getters
	// view the value stored in the variable
	
	public void getp()
	{
		System.out.println(password);
	}

}
