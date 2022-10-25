package interf;

public interface intro {
	
	/*doesnot contain main method
	 * doesnot contain static method
	 * will have non static method with default method
	 * will have abstract method
	 * 
	 * 
	 * abstract methd
	 *         non static
	 *         doesnot contain abstract keyword
	 *         it will empty in its own place 
	 *         it will be redefined in the class to which interface connects to
	 *         
	 *         
	 *         
	 * class<=> class : extends
	 * class<=> interface: implements
	 * 
	 * class definition=> implements interface name 
	 *  * 
	 * */
	
	default public void area()
	{
		
		int side=4;
		System.out.println("area of square is "+ side*side);
	}
	
	
	public void ab();

}
