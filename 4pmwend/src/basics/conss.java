package basics;

public class conss {
	public static void main(String[] args) {
		// new classname();
	 new conss();
		
	 new conss(3);
		 
		 //default : print your details, name and age
		 // parametersied: addition of two float numbers 
		
	}
	
	public conss()
	{
		System.out.println("default constructor");
	}
	
	public conss(int s)
	{
		System.out.println("area of square "+ s*s);
	}

}

/*constructor
 * 
 *           it will take classname as its name 
 *           should be created outside the main method
 *           should be called inside the main method
 *           automatically constructor will be called whenever an object is created
 *           does not not contain return type
 *           
 *            syntax for creation:  accessmodifier classname(){}
 *            syntax fr calling :   classname objectname= new classname();
 *            
 *           
 *            default constructor
 *            parameterised constructor 
 * * 
 * */
