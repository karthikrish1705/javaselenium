package collectionframework;

import java.util.ArrayList;

public class l2 {
	public static void main(String[] args) {
		ArrayList<String>l= new ArrayList<>();
		l.add("apple");
		l.add("orange");
		l.add("kiwi");
		l.add("pineapple");
		l.add("papaya");
		
		//   0    1        2       3         4    
		// apple  orange  kiwi   pineapple  papaya
		System.out.println(l);
		
		// removal => know the index
		l.remove(1);
		System.out.println(l);
		
		//retrival 
		System.out.println(l.get(0));
		
		// iteration 
		
		for(String x: l)
		{
			System.out.println(x);
		}
	}

}
