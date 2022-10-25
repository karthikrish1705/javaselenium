package builtins;

import java.util.Scanner;

public class s1 {
	public static void main(String[] args) {
		
		/*scanner :   get input from the user at run time
		 *        :   non static in nature
		 *        :   int => nextInt()
		 *        :   float=> nextFloat()
		 *        :   double => nextDouble()
		 *        :   String => nextLine()
		 * 
		 * 
		 * */
		
		//classname objectname= new classname();
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter ur name :");
		String name = s.nextLine();
		
		System.out.println("Enter ur age : ");
		int age=s.nextInt();
		
		System.out.println("Enter your salary : ");
		double sal = s.nextDouble();
		
		System.out.println("details are : ");
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("Salary is "+ sal);
	}

}
