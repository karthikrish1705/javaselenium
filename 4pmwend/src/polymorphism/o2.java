package polymorphism;

public class o2 {

	public static void main(String[] args) {
		
		o2 ob= new o2();
		ob.area();
		ob.area(3);
		ob.area(3.5);
		ob.area(30, 40.9);
		ob.area(30.98, 40);
		
		// addition :    2 number, 3 numbers, 4 numbers 
	}
	
	public  void area()//0
	{
		System.out.println("area method");
	}
	
	public  void area(int s)//1
	{
		System.out.println("area of square : "+ s*s);
	}
	
	public  void area(double s)//1//datatype
	{
		System.out.println("area of circle : "+ 3.14*s*s);
	}
	
	public  void area(int s, double b)//2
	{
		System.out.println("area of rectangle : "+ s*b);
	}

	
	public  void area(double b,int s)//2//order
	{
		System.out.println("area of triangle : "+ 0.5*s*b);
	}

}
