package collectionframework;

import java.util.TreeMap;

public class m2 {
	
	public static void main(String[] args) {
		// key: integer
		// element: float 
		TreeMap<String,Double>t= new TreeMap<>();
		t.put("zebra", 10.5);
		t.put("apple", 1000.45);
		t.put("tiger", 30.23);
		t.put("cat", 50000.90);
		System.out.println(t);
		
		//remove=> key
		t.remove("tiger");
		System.out.println(t);
		
		//retrival => key
		System.out.println(t.get("zebra"));
		
		//Keyset=> ordered keys
		System.out.println(t.keySet());//apple cat zebra
		
		// iterating through keyset , during iteration , we can fetch the element 
		
		for(String x: t.keySet())
		{
			System.out.println(x+":"+ t.get(x));
		}
		
		/*
		 * 
		 * first    x= apple       x: t.get(x)      apple: 1000.45
		 * second   x=cat          x: t.get(x)      cat  : 5000.90
		 * third    x=zebra        x: t.get(x)      zebra:  10.5        
		 *  
		 * 
		 * 
		 * 
		 * 
		 * */
	}

}
