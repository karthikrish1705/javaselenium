package polymorphism;

public class o1 {

	public static void main(String[] args) {
		
		/*polymorphism    :   overloading and overriding
		 * 
		 * overloading :  using same methodname for different purpose
		 *                showing difference in number of parameter/datatype/ ssequqnce of parameter
		 *                
		 *                static and non static method * 
		 * */
		o1.area();
		o1.area(5);
		o1.area(3.5);
		o1.area(9, 4.5);
		o1.area(3.5, 4);
		//find addition of two number, addition of three number 
	}
	
	
	public static void area()//0
	{
		System.out.println("im area methd");
	}
	
	public static void area(int s)//1
	{
		System.out.println("Area of square : "+ s*s);
		
	}
	public static void area(double s)//1//datatype
	{
		System.out.println("Area of circle : "+ 3.14*s*s);
		}
	
	public static void area(int l, double b)//2
	{
		System.out.println("Area of rectangle is  : "+ l*b);
		
	}
	
	
	public static void area(double b, int l)//2//order
	{
		System.out.println("Area of triangle  is  : "+0.5* l*b);
		
	}
}
