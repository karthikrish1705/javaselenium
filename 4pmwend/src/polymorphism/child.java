package polymorphism;

public class child  extends parent{

	public static void main(String[] args) {
		// call parent class overriden method:  parent object 
		
		parent ob= new parent();
		ob.area();
		
		// call child class overriding method: child object
		
		child o= new child();
		o.area();
		
		
		// average of two numbers, three numbers : non static method 
	}
	
	// overriding method
	public void area()
	{
		System.out.println("area method");
	}
}
