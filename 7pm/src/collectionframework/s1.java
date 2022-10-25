package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s1 {
	public static void main(String[] args) {
		
		/*set
		 * 
		 *    not indexed
		 *    add
		 *    remove
		 *    retrival is not possible
		 *    iteration
		 *    no size limitation
		 *    
		 *    
		 * TreeSet                : natural orderining - alphabeticl/ascending order 
		 * LinkedHashset          : insertion order
		 * HashSet                : unpredictable order 
		 * 
		 * 
		  * */
		
		TreeSet<Double>t= new TreeSet<>();
		t.add(3.5);
		t.add(1.4);
		t.add(9.3);
		t.add(0.5);
		System.out.println(t);
		
		
		
		LinkedHashSet<Double>t1= new LinkedHashSet<>();
		t1.add(3.5);
		t1.add(1.4);
		t1.add(9.3);
		t1.add(0.5);
		System.out.println(t1);
		
		
		HashSet<Double>t11= new HashSet<>();
		t11.add(3.5);
		t11.add(1.4);
		t11.add(9.3);
		t11.add(0.5);
		System.out.println(t11);
	}

}
