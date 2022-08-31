package generalisationandspecial;

public class child extends parent{

	public static void main(String[] args) {
		
		
		//generalisation:  child=> parent 
		
		//parent p = (parent)new child();
		//p.pn();
		//p.cn();cannot call child class methods 
		
		// specialisation: parent=> child
		
		child c=(child)new parent();
		c.cn();
		c.pn();
		
		
		/*inheritance :   is a relationship
		 * 
		 * generalisation:   converting child object to a parent object
		 *                   has a relationship
		 *                   after conversion: can call only parent mthods, cannot call child methods
		 *                   
		 *sepcialisation:    converting parent object to child object
		 *                   we cannt call both the methods 
		 *                   
		 *                   
		 *          syntax:   (desired)  to be converted
		 *          
		 *          follows inheritance 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
	}
	
	public void cn()
	{
		System.out.println("child class non static method");
	}
}
