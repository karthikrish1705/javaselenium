package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class m1 {

	public static void main(String[] args) {
		
		//map: container : elements will be stored along with its key
		
		// element: any datatype
		//  key   : any datatype
		
		//add
		//remove
		//retrieve
		
		//Treemap   :   keys will be sorted in alphabetcl/ascending order
		//linkedhashmap: keys will be sorted in insertion order
		// hash map: keys will be sorted in unpredictable order
		
		//TreeMap<datypeofkey, datatypefelement> name= new TreeMap<>();
		//key: String
		//Element: Integer
		
		TreeMap<String,Integer>t= new TreeMap<>();
		t.put("zebra", 0);
		t.put("cat", 30);
		t.put("apple", 3);
		t.put("dog", 40);
		System.out.println(t);
		
		
		LinkedHashMap<String,Integer>t1= new LinkedHashMap<>();
		t1.put("zebra", 0);
		t1.put("cat", 30);
		t1.put("apple", 3);
		t1.put("dog", 40);
		System.out.println(t1);
		
		HashMap<String,Integer>t11= new HashMap<>();
		t11.put("zebra", 0);
		t11.put("cat", 30);
		t11.put("apple", 3);
		t11.put("dog", 40);
		System.out.println(t11);
		
	}
}
