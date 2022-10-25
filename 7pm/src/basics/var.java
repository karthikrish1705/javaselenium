package basics;

public class var {
	
	public static void main(String[] args) {
		/*
		 * variable : name given to a memory location
		 * syntax for variable declaration :   datatype variablename=value;
		 * 
		 * datatype
		 * 
		 * word :    String
		 * letter:   cahr
		 * numbers:  int, float, double
		 *     
		 *          double : store upto 16 digits after decimal point
		 *          float  : store upto 8 digits after decimal point
		 *                 : add f at the end 
		 *                 
		 * true/false : boolean 
		 *  * */
		
		//datatype variablename=value;
		
		String name="dhivya";
		int age=30;
		double height=1.54;
		float weight=61.5f;
		char letter='d';
		boolean result=false;
		
		
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("Height is "+ height);
		System.out.println("Weight is "+ weight);
		System.out.println("Letter is "+ letter);
		System.out.println("Result is "+ result);
		
		//Area of square       : side*side
		//Area of rectangle    : length * breadth
		// area of circle      : 3.14*r*r
		
		int side=3;
		System.out.println("area of square is "+ side*side);
		
		
	}

}
