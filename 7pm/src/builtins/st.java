package builtins;

public class st {
	public static void main(String[] args) {
		
		String n="welcome";
		//String => datatype and class
		// n=> variable and object
		//0    1    2     3    4    5   6    
		//w    e    l     c    o    m   e
		System.out.println(n.length());// number of characters present in this strng
		// find index of a particular index
		System.out.println(n.indexOf('m'));
		
		// find character present at particular index
		System.out.println(n.charAt(1));
		System.out.println(n.toLowerCase());
		System.out.println(n.toUpperCase());
		
		System.out.println(n+"hi");
		System.out.println(n.concat("hi"));
		
		System.out.println(n.replace('m', 'n'));
		System.out.println(n.replace("come", "go"));
		
		System.out.println(n.contains("come"));
		System.out.println(n.contains("hi"));
	}

}
