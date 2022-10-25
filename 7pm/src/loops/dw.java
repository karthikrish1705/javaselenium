package loops;

public class dw {

	public static void main(String[] args) {
		/*
		 *while/dowhile/for
		 *
		 * initialisation   :    where to start 
		 * 
		 * condition checking:   where to stop
		 * 
		 *                       forward :  <=end value
		 *                       backward:  >=end value
		 *                       
		  inc/dec            : diff between 2 consecutive numbers
		  
		  syntax:
		  
		  initialisation
		  do
		  {
		  statement
		  inc/dec
		  }
		  while(condition);
		  
		  */
		
		//print 5th table   50,45,40,35,30....0
		
		// print even numbers from 30 to 50    30,32,34,36...50
		
		int i=50;
		do
		{
			System.out.println(i);
			i=i-5;
		}
		while(i>=0);
	}
}
