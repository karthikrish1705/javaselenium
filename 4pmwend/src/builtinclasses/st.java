package builtinclasses;

public class st {
	
	public static void main(String[] args) {
		//String => class /datatype
		String n="Welcome I";
		// n=> variable/object 
		// non static in nature ; objectname.methodname()
	     //  index    0    1    2     3    4    5    6  7   8
		//           W    e    l     c     o    m    e      I
		
		// number of characters present in n 
		System.out.println(n.length());
		// find index of particular character
		System.out.println(n.indexOf('l'));
		// find character present at a particular index
		System.out.println(n.charAt(4));
		
		//Replacement
		System.out.println(n.replace('l', 'c'));
		System.out.println(n.replace("come", "go"));
		
		//joining
		System.out.println(n+"hi");
		System.out.println(n.concat("hi"));
		
		// conversion
		System.out.println(n.toLowerCase());
		System.out.println(n.toUpperCase());
		
		//contains 
		System.out.println(n.contains("per"));
		System.out.println(n.startsWith("Wel"));  // prefix
		System.out.println(n.endsWith("come"));   //suffix
		
	}

}
