package ops;

public class o1 {
	
	public static void main(String[] args) {
		
		/*arithmetic operators :   +,-,*,/
		 *comparison operators :   <,>,<=,>=,==,!=
		 *assignment operators :   +=,-=,*=,/=
		 *conditional operators:   condition ? true : false
		 *logical operators    :   and, or, not 
		 * */
		
		int age=100;
		//System.out.println(age);
		
		// add 2 to age
		//age+=2;
		
		//sub 4 from age
		//age-=4;
		
		//mul age by 7
		//age*=7;
		
		// div age by 2
		//age/=2;
		//System.out.println(age);
		
		//               condition?  true  :  false
		System.out.println(age>18 ? "major": "minor");
		
		/*and     : &&  
		 * 
		 * con1     cond2     output
		 * true     true        true
		 * true     false       false
		 * false    true        false
		 * false    false       false
		 *
		 * or :    ||
		 * 
		 * con1     cond2     output
		 * true     true        true
		 * true     false       true
		 * false    true        true
		 * false    false       false
		 * 
		 * 
		 * not  : !
		 * 
		 * true=> false
		 * false=> true
		 * */
		
		int a=90;
		int b=40;
		
		System.out.println(a==90 || b<50);
		System.out.println(a==90 || b==50);
		System.out.println(a==0 || b<50);
		System.out.println(a==0 || b==0);
		
		System.out.println(a==90);
		System.out.println(a!=90);
		
	}

}
