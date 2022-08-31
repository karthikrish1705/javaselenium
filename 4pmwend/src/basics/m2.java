package basics;

public class m2 {

	public static void main(String[] args) {
		
		//classname objectname= new classname();
		// objnme.methodname();
		
		m2 ob=new m2();
		ob.average();
		ob.prit();
		// product of two numbers: public
		// addition of two decimal value: private 
		
	}
	
	public void average()
	{
		int a=40;
		int b=3;
		System.out.println("average: "+ (a+b)/2);
	}
	
	
	private void prit()
	{
		System.out.println("hi");
	}
}


/*
 * non static : no fixed memory space :
 *              we need to allocate separate memory space for calling it
 *              
 *              
 *     creation: outside the main method
 *     calling:  inside the main method
 *     
 *     
 *     syntax for creation:   accessmodifier returntype name(){}
 *     syntax for callng:
 *            step1: creating and naming object : classname objectname= new classname();
 *            step2: calling                    : objectname.methodname();
 * 
 * 
 * 
 * 
 * */
 