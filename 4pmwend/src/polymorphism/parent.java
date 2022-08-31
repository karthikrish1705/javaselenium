package polymorphism;

public class parent {

	/*
	 * 
	 * overriding :
	 *       follows inheritance
	 *       non static method
	 *       
	 *       same method name, differnt purpose, showing difference in location
	 *      
	 *      method=> parent : overriden method :  parent object
	 *      methd => child : overriding method : child object 
	  * 
	 * 
	 * */
	
	//overriden method
	public void area()
	{
		int s=40;
		System.out.println("area of square is "+ s*s);
	}
}
