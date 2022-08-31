package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class q1 {

	public static void main(String[] args) {
		
		//Queue => not index based
		// add elements
		// remove
		// retrieve only head of the queue
		// iteration
		// accept duplicates
		// size limitation
		// syntax: ArrayBlockingQueue<Datatype> name= new ArrayBlockingQueue<>(size);
		
		ArrayBlockingQueue<Double>s= new ArrayBlockingQueue<>(4);
		s.add(39.02);
		s.add(8.2);
		s.add(7.4);
		s.add(1.4);
		System.out.println(s);
		
		s.remove(7.4);
		System.out.println(s);
		
		System.out.println(s.peek());
		
		for(double a: s)
		{
			System.out.println(a);
		}
		
	}
}
