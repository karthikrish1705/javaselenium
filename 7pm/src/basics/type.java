package basics;

public class type {

	//type casting : converting variable of one datatype to another datatype
	// syntax:  (desired datatype) variable to be converted
	
	public static void main(String[] args) {
		
		int age=30;
		System.out.println(age);
		
		// int => double 
		
		double r = (double)age;
		System.out.println(r);
		
		float aver=34.89f;
		System.out.println(aver);
		
		// float => int
		
		int r1 = (int)aver;
		System.out.println(r1);
	}
}
