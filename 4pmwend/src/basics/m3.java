package basics;

public class m3 {
	
	public static void main(String[] args) {
		
		// datatype variablename=value
		
		//parameter: variable passed to a function definition
		// argument : value assigned to the parameter while calling it 
		// find area of square using static method
		// find average of two double values using non static method 
		
		m3.area(30, 40);   // l=30   b=40
		
		m3.area(3, 2);//l=3, b=2
		
		m3 o= new m3();
		o.details("dhivya", 30);
		o.details("java",70);
	}
	
	public static void area(int l, int b)
	{
		System.out.println("area : "+ l*b);
	}
	
	public void details(String name , int age)
	{
		System.out.println("Name is "+ name);
		System.out.println("age is "+ age);
	}

}
