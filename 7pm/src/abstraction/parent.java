package abstraction;

abstract public class parent {
	
	//nrml methd
	public void nm()
	{
		System.out.println("nrml method");
	}
	
	//abstract method
	abstract public void ab();
	
	/*
	 * abstraction: hiding implementation details
	 * 
	 * follows inheritance
	 * 
	 * achieve it through abstract class and abstract method
	 * 
	 * class=> abstract class :  by adding abstract keyword before it 
	 * 
	 * abstract class can have nrml method as well as abstract method
	 * 
	 * abstract method
	 *           non static in nature
	 *           will be having abstract keyword
	 *           will be empty in its own class
	 *           will be redefined in the child class
	 *           
	 * cannot create an object for abstract class 
	 * 
	 * */

}
