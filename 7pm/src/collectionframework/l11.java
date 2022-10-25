package collectionframework;

import java.util.ArrayList;

public class l11 {

	/*collectionframework:   list, queue, set, map
	 * 
	 * list 
	 * 
	 *     index based
	 *     add 
	 *     remove
	 *     retrieve
	 *     iterate through the elements
	 *     
	 *     syntax: ArrayList<Datatype> name= new ArrayList<>();
	 * 
	 *     int=> Integer
	 *     float=> Float
	 *     char=> Character
	 *     String=> String 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		ArrayList<Integer>l= new ArrayList<>();
		l.add(30);
		l.add(20);
		l.add(10);
		l.add(30);
		System.out.println(l);
		//0     1      2       3       
		//30    20     10     30
		
		// remove an element : know the index
		
		l.remove(2);
		System.out.println(l);
		
		//retrival : know the index
		System.out.println(l.get(0));
		
		System.out.println("values present in list are : ");
		
		//enhanced for loop: for each loop
		//for(datatype tempvariable: nameofthecollection)
		
		for(int x: l)
		{
			System.out.println(x);
		}
	}
}
