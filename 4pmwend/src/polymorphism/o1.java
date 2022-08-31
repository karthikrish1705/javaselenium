package polymorphism;

public class o1 {
	public static void main(String[] args) {
		
		/*polymorphism - many forms 
		 * 
		 * overloading and overriding 
		 * 
		 * overloading 
		 *          static and non static
		 *          doesnot follow inheritance
		 *          using same methodname for different purpose, showing difference in 
		 *          number of parameter/datatype/sequence  * 
		 * 
		 * */
		o1.area();
		o1.area(3);//s=3
		o1.area(3.5);//s=3.5
		o1.area(3, 4.5);// s=3 b=4.5
		o1.area(3.5, 40);// b=3.5 , s=40
	}
	
	public static void area()//0
	{
		System.out.println("area method");
	}
	
	public static void area(int s)//1
	{
		System.out.println("area of square : "+ s*s);
	}
	
	public static void area(double s)//1//datatype
	{
		System.out.println("area of circle : "+ 3.14*s*s);
	}
	
	public static void area(int s, double b)//2
	{
		System.out.println("area of rectangle : "+ s*b);
	}

	
	public static void area(double b,int s)//2//order
	{
		System.out.println("area of triangle : "+ 0.5*s*b);
	}


}
