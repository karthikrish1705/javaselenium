package basics;

public class m4 {
	
	public static void main(String[] args) {
		
		// datatype variablename=value
		
		//parameter: variable passed to a function definition
		// argument: value assigned to the parameter while calling it 
		
		m4.area(3);// 3=> argument     s=3
		m4.area(2);// 2=> argument     s=2
		
		System.out.println(m4.add(3, 5));   // a=3, b=5
	}
	
	
	public static void area(int s)   // s=> parameter 
	{
		System.out.println("Area of square is "+ s*s);
	}

	
	public static int add(int a, int b)
	{
		return a+b;
	}
	
}
