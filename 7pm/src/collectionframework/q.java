package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class q {
	
	public static void main(String[] args) {
		
		/*queue
		 *  
		 *    not indexed 
		 *    add 
		 *    remove elements
		 *    retrieve only head of the element 
		 *    iterate through the elements
		 *    size limitation
		 *    
		 *    syntax:
		 *     
		 *     ArrayBlockingQueue<Datatype> name= new ArrayBlockingQueue<>(size); * 
		 * */
		
		ArrayBlockingQueue<Integer>s= new ArrayBlockingQueue<>(4);
		s.add(20);
		s.add(10);
		s.add(80);
		s.add(40);
		System.out.println(s);
		// remove
		
		s.remove(40);
		System.out.println(s);
		
		//retrieval
		
		System.out.println(s.peek());
		
		//iteration
		System.out.println("Elements present in queue area : ");
		
		//for(datatype tempvariable: namefthecollection)
		
		for(int x:s)
		{
			System.out.println(x);
		}
		}
	

}
