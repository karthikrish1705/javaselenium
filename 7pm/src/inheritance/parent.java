package inheritance;

public class parent {

	/*
	 * inheritance : process in which one class qcquires properties of other class
	 * 
	 * parent/base/super :  whose properties are inherited
	 * 
	 * child/derived/sub :  which uses properties of parent class
	 * 
	 * child is using parent class
	 * 
	 * to achieve:  
	 * 
	 * in your child class definition:    extends parentclass name
	 * 
	 * 
	 * after inheritance 
	 * 
	 *  child is having full control on the parent class
	  * 
	 * */
	public void pn()
	{
		System.out.println("parent class non static");
	}
	
	public static void ps()
	{
		System.out.println("parent class static method");
	}
	
}
