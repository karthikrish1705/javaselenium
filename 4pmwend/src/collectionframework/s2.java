package collectionframework;

import java.util.TreeSet;

public class s2 {
	public static void main(String[] args) {
		
		//LinkedHashSet=> Double 
		TreeSet<String>t= new TreeSet<>();
		t.add("zebra");
		t.add("cat");
		t.add("onion");
		t.add("apple");
		System.out.println(t);
		
		t.remove("onion");
		System.out.println(t);
		
		for(String x: t)
		{
			System.out.println(x);
		}
	}

}
