package basics;

public class m6 {
	
	public static void main(String[] args) {
		
		m6 ob= new m6();
		ob.addition(1.5, 5.6);
		System.out.println(ob.average(3.5, 5.8));
		
	}
	
	public void addition(double a, double b)
	{
		System.out.println("addition of two numbers : "+ (a+b));
	}
	
	
	public double average(double a, double b)
	{
		double av=(a+b)/2;
		return av;
	}

}
