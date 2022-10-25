package polymorphism;

public class parent {
	
	/*
	 * overriding : using same methodname for different purpose
	 *              showing difference in location
	 *              
	 *              method: parent: overridden method :   parent object
	 *              method: child: overriding method  : child object
	 *              
	 *              follows inheritance
	 *              non static
	 * * */
	
	//overriden method
	public void area()
	{
		int s=4;
		System.out.println("area of square is "+ s*s);
	}

}
