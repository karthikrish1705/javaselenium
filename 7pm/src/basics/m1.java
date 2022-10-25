package basics;

public class m1 {
	public static void main(String[] args) {
		
		//classname.methodname();
		m1.area();
		m1.product();
		
	}
	
	// find area of rectangle using static method 
	// find addition of three number using static method : private 
	
	//accessmodifier static returntype name(){}
	
	//public : can call it anywhere inside that project 
	public static void area()
	{
		int side=4;
		System.out.println("area of square is "+ side*side);
	}

	//(a+b+c)
	
	private static void product()
	{
		int a=4;
		int b=40;
		System.out.println("product of two numbers : "+ a*b);
	}
	
}


/*method: block of code which perfrms certain action
 * 
 * methods should be created outside the main method, inside the class
 * methods should be called inside the main method
 * 
 * static and non static method
 * 
 * 
 * static :    fixed memory space
 * 
 * syntax for creation: accessmodifier static returntype name(){}
 * syntax for calling : classname.methodname()
 * 
 * accesmodifier: public, private, protected
 * returntype : int, float, double, boolean, string, void ,char
 * 
 * 
 * */
 