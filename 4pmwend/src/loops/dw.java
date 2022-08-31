package loops;

public class dw {

	public static void main(String[] args) {
		/*
		 * for/while/do while
		 * 
		 * initialisation :   where to start 
		 * 
		 * condition checking : where to stop
		 *                forward :   <=end value
		 *                backward:   >=end value
		 *                
		 *inc/dec     :   diff betbween 2 consecutive numbers 
		 *
		 *
		 *initialisation
		 *do
		 *{
		 *statement
		 *inc/dec
		 *}
		 *while(condition);
		 *
		 *
		 *odd numbers from 13 to 1     13,11,9,7,5,3,1
		 *
		 *1,3,5,7...13
		 */
		
		
		int i=13;
		do
		{
			System.out.println(i);
			i-=2;
		}
		while(i>=1);
	}
}
