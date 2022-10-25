package builtins;

public class m {
	public static void main(String[] args) {
		
		//Math : builtin class
		//  static in nature 
		
		System.out.println(Math.PI);
		
		System.out.println(Math.addExact(30, 40));
		System.out.println(Math.subtractExact(3, 1));
		System.out.println(Math.multiplyExact(30, 3));
		System.out.println(Math.floorDiv(30, 2));   // quotient 
		System.out.println(Math.floorMod(15, 2));   //remainder
		
		System.out.println(Math.sqrt(30));
		System.out.println(Math.cbrt(30));
		System.out.println(Math.pow(32, 3));
		
		System.out.println(Math.sin(30));
		System.out.println(Math.cos(30));
		System.out.println(Math.tan(30));
		System.out.println(Math.log(10));
		
		System.out.println(Math.min(30, 2));
		System.out.println(Math.max(30, 2));
		
		System.out.println(Math.round(3.98));
	}

}
