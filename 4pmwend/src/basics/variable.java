package basics;

public class variable {

	public static void main(String[] args) {
		
	/*       variable: name given to a memory location
	 *       syntax:  datatype variablename= value
	 *       
	 *       
	 *       word:     String 
	 *       letter:   char
	 *   true/false :  boolean
	 *   numbers    : int, float , double
	 *               
	 *               double: store upto 16 digits after decimal point
	 *               float : store upto 8 digits after decimal point, add f at the end* 
		 * 
		 * */
		
		// datatype variablename= value
		
		String name="dhivya";
		int age=30;
		double height=160.5;
		float weight=61.5f;
		char letter='d';
		boolean result=true;
		
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("Height is"+ height);
		System.out.println("Weight is"+ weight);
		System.out.println("Letter is "+ letter);
		System.out.println("Result is "+ result);
		
		// square : side*side
		// rectangle : l*b
		// triangle: 0.5*b*h
		
		int side=4;
		System.out.println("Area of square is "+ side*side);
		
		//mr => static, non static 
		System.out.println(mr.add());
		mr ob= new mr();
		System.out.println(ob.product());
		
	}
}
