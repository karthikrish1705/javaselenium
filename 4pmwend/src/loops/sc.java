package loops;

public class sc {
	public static void main(String[] args) {
		
		
		/*
		 * dependng upon the datatype of expression: name the cases
		 * switch(expression)
		 * {
		 * case :
		 *     statement
		 *     break;
		 *     
		 *case :
		 *    Statement
		 *     break;
		 *     
		 *default:
		 *    statemnt
		 *    break;
		 * * */
		
		int age=20;
		switch(age)
		{
		
		case 0:
			System.out.println("not born");
			break;
			
		case 2:
			System.out.println("toddler");
			break;
			
		case 28:
			System.out.println("adult");
			break;
			
		default:
			System.out.println("doesnot match");
			break;
	}

}}
