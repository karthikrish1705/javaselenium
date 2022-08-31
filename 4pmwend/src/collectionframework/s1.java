package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s1 {

	public static void main(String[] args) {
		/*set
		 *  not indexed
		 *  add
		 *  remove
		 *  retrival is not possible
		 *  accept only unique values 
		 *  
		 *  TreeSet          :  natural order -  alphabetical/ascending order 
		 *  LinkedHashSet    :  insertion order 
		 *  HashSet          :  unpredictable order 
	* 
		 * */
		
		TreeSet<Integer>t= new TreeSet<>();
		t.add(900);
		t.add(0);
		t.add(1000);
		t.add(30);
		System.out.println(t);
		
		
		LinkedHashSet<Integer>t1= new LinkedHashSet<>();
		t1.add(900);
		t1.add(0);
		t1.add(1000);
		t1.add(30);
		System.out.println(t1);
		
		
		HashSet<Integer>t11= new HashSet<>();
		t11.add(900);
		t11.add(0);
		t11.add(1000);
		t11.add(30);
		System.out.println(t11);
	}
}
