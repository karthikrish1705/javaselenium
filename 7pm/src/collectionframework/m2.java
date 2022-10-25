package collectionframework;

import java.util.LinkedHashMap;

public class m2 {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer>t1= new LinkedHashMap<>();
		t1.put("zebra", 0);
		t1.put("cat", 30);
		t1.put("apple", 3);
		t1.put("dog", 40);
		System.out.println(t1);
		
		//remove=> key
		
		t1.remove("zebra");
		System.out.println(t1);
		
		//retrival=> key
		
		System.out.println(t1.get("cat"));
		
		
	}
}
