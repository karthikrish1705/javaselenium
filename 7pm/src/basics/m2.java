package basics;

public class m2 {

	public static void main(String[] args) {
		
		// classname objectname= new classname(); 
		// objectname.methodname();
		
		m2 ob= new m2();
		ob.area();
		ob.add();
		
	}
	
	// find average of two numbers : public - non static method
	// find product of three numbers: private- non static method
	
	public void area()
	{
		int s=3;
		System.out.println("area of square is "+ s*s);
	}
	
	
	private void add()
	{
		double a=9.8;
		double b=3.4;
		System.out.println("addition of two numbers : "+ (a+b));
	}
}


/*non static method
 *    doesnot have fixed memory space
 *    we need to allocate separate memory space for calling it
 *    
 *    method should be created outside the main methd
 *    method should be called inside the main method
 *    
 *    
 *    syntax for creation: accessmodifier returntype name(){}
 *    syntax for calling :
 *                     step1:   creation and naming of object   :    classname objectname= new classname();
 *                     step2:   call non static method          :    objectname.methodname();
 *    
 *   
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 