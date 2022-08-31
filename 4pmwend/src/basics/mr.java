package basics;

public class mr {

	public static void main(String[] args) {
		
		//void : doesnot return anything 
		// int, float, double, string, char, boolean
		// creation: add return statement at the end 
		//calling :  call it within sysout 
		
		System.out.println(mr.add());
		mr ob1= new mr();
		System.out.println(ob1.product());
		
	}
	public static int add()
	{
		int m=9;
		int n=7;
		int a=m+n;
		return a;
	}
	
	public double product()
	{
		double m=9.7;
		double n=3.2;
		return m*n;
	}
}
