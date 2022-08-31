package encapsulation;

public class e1 {

	/*
	 * encapsulation : data hiding 
	 * 
	 *    declare the variable as private 
	 *    u must not assign value straightly to the variable
	 *    
	 *    setter and getter= work with variable
	 *    
	 *    setter:  assign value to the variable
	 *    
	 *    getter:  view the value stored in the variable
	 *     public, non static in nature 
	 *    
	 *    doesnot follow inheritance 
	 * * 
	 * */
	
	private String password;
	
	//setter: assign value to the password variable
	public void setp(String p)
	{
		password=p;
	}
	
	
	//getter: view the value stored in the password variable 
	public void getp()
	{
		System.out.println(password);
	}
}
