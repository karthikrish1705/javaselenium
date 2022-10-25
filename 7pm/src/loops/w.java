package loops;

public class w {
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
		  while(condition)
		  {
		  statement
		  inc/dec
		  }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 5 , 6,7,8,9,10
		 * 
		 * odd numbers  from 11 to 21    11,13,15,17,19,21
		 * 
		 * 40,36, 32....4
		 * */
		
		int i=5;
		while(i<=10)
		{
			System.out.println(i);
			i=i+1;
		}
		
		int a=11;
		while(a<=21)
		{
			System.out.println(a);
			a=a+2;
		}
		
		int b=40;
		while(b>=4)
		{
			System.out.println(b);
			b=b-4;
		}
	}

}
