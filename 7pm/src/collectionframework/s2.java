package collectionframework;

import java.util.TreeSet;

public class s2 {
	public static void main(String[] args) {
		
		TreeSet<String>t= new TreeSet<>();
		t.add("zebra");
		t.add("goa");
		t.add("apple");
		t.add("kite");
		System.out.println(t);
		
		//removal 
		
		t.remove("kite");
		System.out.println(t);
		
		//for(datatype tempvariable : nmeofthecollection)
		
		for(String x:t)
		{
			System.out.println(x);
		}
	}

}
