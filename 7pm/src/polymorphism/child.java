package polymorphism;

public class child extends parent{
	public static void main(String[] args) {
		
		// call overriding method of child class=> child object
		
		child c= new child();
		c.area();
		
		//call overriden method of parent class=> parent object
		
		parent p= new parent();
		p.area();
	}

	//overriding method
	public void area()
	{
		int l=40;
		int b=40;
		System.out.println("area of rectangle is "+ l*b);
	}
}
