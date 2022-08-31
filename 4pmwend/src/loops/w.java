package loops;

public class w {
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
	 *
	 *while(condition)
	 *{
	 *statement
	 *inc/dec
	 *}
	 *
	 *even numbers from 30 to 40      30,32,34,36,38,40 
	 * 
	 * 9th table   90,81,...0
	 * 
	 * 8th table  0,8,16...80 
	 * */
	
	int i=30;
	while(i<=40)
	{
		System.out.println(i);
		i+=2;
	}
	
	int a=90;
	while(a>=0)
	{
		System.out.println(a);
		a=a-9;
	}
}
}
