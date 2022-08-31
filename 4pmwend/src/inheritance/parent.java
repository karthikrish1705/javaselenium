package inheritance;

public class parent {
	
	/*inheritance : process in which one class acquires properties of other class 
	 * 
	 * parent/super/base : class whose properties are inherited
	 * child/sub/derived : class which inherits properties 
	 * 
	 * child is using parent class
	 * 
	 * create connection :  child class definition:   extends parentclassname 
	 * 
	 * aftr inheritance 
	 * 
	 * child is having full control on the parent
	 * child object=> can all the parent methods 
	 * 
     * 
	 * */
	
	public static void add()
	{
		int a=40;
		int b=30;
		System.out.println("addition of two numbers : "+ (a+b));
	}

	
	public void pn()
	{
		System.out.println("parent class non static method ");
	}
}
