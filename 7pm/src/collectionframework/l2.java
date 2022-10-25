package collectionframework;

import java.util.ArrayList;

public class l2 {
	public static void main(String[] args) {
		
		ArrayList<String>n= new ArrayList<>();
		n.add("apple");//0
		n.add("scale");//1
		n.add("owl");  //2
		n.add("banana");//3
		
		System.out.println(n);
		
		n.remove(2);
		System.out.println(n);
		
		System.out.println(n.get(1));
		
		System.out.println("elements are: ");
		
		//for(datatype tempvariable: nameofthecollection)
		
		for(String x: n)
		{
			System.out.println(x);
		}
	}

}
