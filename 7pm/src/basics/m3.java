package basics;

public class m3 {
	
	public static void main(String[] args) {
		// void
		// int, float, double, char, string, boolean 
		// add return statement at the end  in definition
		// while calling the method: within sysout 
		
		System.out.println(m3.addition());
		m3 o= new m3();
		System.out.println(o.area());
		System.out.println(o.wish());
	}
	
	// find area of square using static method, return its result
	//find product of two numbers using non static method, return its result 
	public static int addition()
	{
		int m=40;
		int n=4;
		int a=m+n;
		return a;
	}
	
	public double area()
	{
		int a=40;
		int b=30;
		double ar=0.5*40*30;
		return ar;
	}
	
	public String wish()
	{
		String w="hi";
		return w+"  sindhu";
	}

}

// double, float  => int
// int=> double, float 
