package operators;

public class op1 {

	public static void main(String[] args) {
		
		/*arithmetic operators : +,-,*,/,//,++.--
		 *comparison operators : ,>,<=,>=,==,!=
		 *assignment operators :  +=,-=,*=,/=
		 *conditional operator :  condition ? true : false
		 * logical operator    :  and, or, not
		 * 
		 * * */
		
		int age=4;
		
		//                 cond   ?  true  :  false  
		System.out.println(age>18 ? "major": "minor");
		
		
		
		// post inc/dec
		
		//System.out.println(age--);  //age++ = age> age+1 , age=age-1
		//System.out.println(age);
		
		//pre inc/dec
		//System.out.println(--age);  //++age => age=1+age  , age=1-age
		
		//add 10 to age
		//age+=10;
		// sub age by 4
		//age-=4;
		//mul age by 3
		//age*=3;
		//div age by 2
		//age/=2;
		//System.out.println(age);
		/*
		 * 
		 * and => &&
		 * 
		 * condition1       condition2     output
		 * True               True           True
		 * True               False          False
		 * False              True           False
		 * False              False          False
		 * 
		 * 
		 *  or => ||
		 * 
		 * condition1       condition2     output
		 * True               True           True
		 * True               False          True
		 * False              True           True
		 * False              False          False
		 * 
		 * not=> !
		 * 
		 * true=> false
		 * false=> true
		* 
		 * */
		int a=40;
		int b=4;
		
		System.out.println(a>0 || b<5);
		System.out.println(a>0 || b==0);
		System.out.println(a==0 || b==4);
		System.out.println(a==0 || b==0);
		
		System.out.println(a==40);
		System.out.println(a!=40);
		
	}
}
