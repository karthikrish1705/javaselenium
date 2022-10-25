package basics;

public class cons {

	public static void main(String[] args) {
		/*
		 * constructor- special method
		 *              will take classname as its name
		 *              created outside the main methd
		 *              called inside the main method
		 *              automatically called whenenever an object is created 
		 *              
		 *              syntax for creation:   accessmodifier classname()
		 *              syntax for calling :   classname objectnme= new classname()
		 * 
		 *default constructor: addition of two number
		 *parameterised : find area of circle 
		 * 
		 * 
		 * */
		cons ob= new cons();
		cons ob1= new cons(4);
		}
	
	public cons()
	{
		System.out.println(" default constructor");
	}

	// parameterised constructor
	public cons(int s)
	{
		System.out.println("area of square is "+ s*s);
	}
	
	
}
