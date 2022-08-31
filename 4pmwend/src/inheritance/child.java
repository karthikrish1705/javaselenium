package inheritance;

public class child  extends parent{
	
	public static void main(String[] args) {
		
		// calling its own methods
		child.cs();
		child c= new child();
		c.cn();
		
		// after inheritance 
		c.add();// calling parent static method
		c.pn();//  calling parent non static method
	}
	
	public static void cs()
	{
		System.out.println("child class static method");
	}
	
	public void cn()
	{
		System.out.println("child class non static method");
	}

}
