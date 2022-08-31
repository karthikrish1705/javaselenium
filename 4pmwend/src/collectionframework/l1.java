package collectionframework;

import java.util.ArrayList;

public class l1 {

	public static void main(String[] args) {
		
		// store large amount of data under a single name
		// list, map, set and quue
		
		// list
		//   index based
		//   add elements
		//   remove elements
		//   retrieve elements
		//   iterate through the elements
		// will accept duplicates
		
		//syntax : ArrayList<Datatype> name= new ArrayList<>();
		// int=> Integer 
		// float=> Float
		// char => Character
		// boolean=> Boolean 
		
		ArrayList<Integer>l= new ArrayList<>();
		l.add(30);
		l.add(90);
		l.add(80);
		l.add(30);
		l.add(3);
		
		// index    0    1    2    3    4
		//          30   90  80   30    3
		
		// index    0    1    2     3    
	    //          30   80   30    3
		
		System.out.println(l);
		
		// remova=> know the index
		l.remove(1);
		System.out.println(l);
		
		// retrieval => know the index 
		System.out.println(l.get(2));
		
		//iteration 
		//for-each /enhanced for loop
		//syntax:  for(datatype tempvariable: nameofthecollection)
		
		for(int x:l)//
		{
			System.out.println(x);
		}
		
		/*starts at first element 
		 * ends at last element 
		 * automatically it will move to the next elements 
		 * first iteration  x=30   =>   print 30
		 * second iteration x=80   =>   print 80
		 * third iteration  x=30   =>   print 30
		 * fourth iteration  x=3    =>  print 3
		 * 
		 * 
		 * 
		 * 
		 * */
		
	
		
	}
}
