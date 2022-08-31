package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class m1 {
	public static void main(String[] args) {
		
		/*map- container where elements will be stored along with its key
		 * 
		 * add
		 * remove
		 * retrieve
		 * 
		 * TreeMap         : keys => natural order 
		 * LinkedHashMap   : keys => insertion order
		 * Hashmap         : keys=> unpredictable orderm
		 * 
		 * 
		 * TreeMap<Dtypeofkey, Dtypeofelement> name= new TreeMap<>();
		 * 
		 * 
		 * keys; String
		 * element: Double
		 * 
		* */
		TreeMap<String,Double>t= new TreeMap<>();
		t.put("zebra", 10.5);
		t.put("apple", 1000.45);
		t.put("tiger", 30.23);
		t.put("cat", 50000.90);
		System.out.println(t);
		
		
	LinkedHashMap<String,Double>t1= new LinkedHashMap<>();
		t1.put("zebra", 10.5);
		t1.put("apple", 1000.45);
		t1.put("tiger", 30.23);
		t1.put("cat", 50000.90);
		System.out.println(t1);
		
		
		HashMap<String,Double>t11= new HashMap<>();
		t11.put("zebra", 10.5);
		t11.put("apple", 1000.45);
		t11.put("tiger", 30.23);
		t11.put("cat", 50000.90);
		System.out.println(t11);
	}

}
