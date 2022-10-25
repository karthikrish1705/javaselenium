package inheritance;

public class child extends parent {
	
	public static void main(String[] args) {
		
		// calling its own methods
		child.cs();
		child ob= new child();
		ob.cn();
		
		//after inheritance : child is having full control on the parent
		ob.ps();
		ob.pn();
		
	}

	
	public void cn()
	{
		System.out.println("child class non static method");
	}
	
	
	public static void cs()
	{
		System.out.println("child class static method");
		
	}
}
