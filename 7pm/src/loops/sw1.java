package loops;

public class sw1 {
	public static void main(String[] args) {
		/*
		 * 
		 * switch(expression)
		 * 
		 * case :
		 *     statement
		 *     break;
		 *     
		 * case :
		 *     statement
		 *     break;
		 *     
		 *  case :
		 *      statement 
		 *      break
		 *      
		 *  default:
		 *      statement
		 *      break * 
		 * 
		 * */
		
		String fruits="pineapple";
		switch(fruits)
		{
		
		case "orange":
			System.out.println("orange is orange in color");
			break;
			
		case "apple":
			System.out.println("N APPLE A DAY");
			break;
			
		case "kiwi":
			System.out.println("its kiwwii!!!");
			break;
			
		default:
			System.out.println("doesnot match");
			break;
		
		
		}
	}

}
