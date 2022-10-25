package generalisationandspec;

public class child extends parent{

	public static void main(String[] args) {
		
		// generalisation: converting child object => parent object
		//               : can call parent method, cannot call child methods 
		
		//specialisation: converting parent object=> child object
		              // : canot call both methods 
		
		// syntax: (desired) to be converted 
		
	                   // child=> parent
		
		//parent p = (parent)new child();
		//p.pn();
		//p.cn();   cannot call child methods 
		
		
		// parent=> child
		
		child c = (child)new parent();
		c.cn();
		c.pn();
		
		
	}
	
	public void cn()
	{
		System.out.println("child class non static method");
	}
}
