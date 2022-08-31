package basics;

public class m1 {
	//accessmodifier static returntype name(){}
	
		public static void area()
		{
			int s=3;
			//Sysout => hold on contrl and click on space bar 
			System.out.println("area of square is "+ s*s);
		}
		
		private static void addition()
		{
			int a=40;
			int b=4;
			System.out.println("addition of two numbers : "+ (a+b));
		}
	
	public static void main(String[] args) {
		
		//classname.methodname();
		
		m1.area();
		m1.addition();
		
		//private: find average of two numbers 
	}
	
	
	

}

/*method: block of code which performs certain action
 * 
 * static
 * non static 
 * 
 * methods should be created outside the main method, inside the class
 * methods should be called inside the main method
 * 
 * static methd: fixed memry space
 * 
 * syntax for creation:   accessmodifier static returntype name(){}
 * syntax for calling :   classname.methodname()
 * 
 * accesmodifiers:  public, private, protected 
 * returntype :     void, int, float, double, string, char
 * 
 * 
 * 
 * */
 