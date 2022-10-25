package polymorphism;

public class o2 {

	public static void main(String[] args) {
		
		o2 ob= new o2();
		ob.area();
		ob.area(3);
		ob.area(3.9);
		ob.area(30, 40.9);
		ob.area(3.4, 10);
	}
	
	public  void area()//0
	{
		System.out.println("im area methd");
	}
	
	public  void area(int s)//1
	{
		System.out.println("Area of square : "+ s*s);
		
	}
	public  void area(double s)//1//datatype
	{
		System.out.println("Area of circle : "+ 3.14*s*s);
		}
	
	public static void area(int l, double b)//2
	{
		System.out.println("Area of rectangle is  : "+ l*b);
		
	}
	
	
	public  void area(double b, int l)//2//order
	{
		System.out.println("Area of triangle  is  : "+0.5* l*b);
		
	}
}
