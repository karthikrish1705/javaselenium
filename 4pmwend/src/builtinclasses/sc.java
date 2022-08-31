package builtinclasses;

import java.util.Scanner;

public class sc {
	
	public static void main(String[] args) {
		
		//Scan => read
		
		//Scanner :  get input from the user at run time
		//non static in nature
		// String => nextLine()
		//int => nextInt()
		//float=> nextFloat()
		//char=> nextChar()
		// double=> nextDouble()
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = s.nextLine();
		System.out.println("Enter your age : ");
		int age = s.nextInt();
		System.out.println("Enter your salary :");
		double sal = s.nextDouble();
		
		System.out.println("Details are :");
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("Salary is "+ sal);
	}

}
