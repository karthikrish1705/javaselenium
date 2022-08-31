package loops;

public class nested {

	public static void main(String[] args) {
		
		/*
		 * 
		 * if(cond1)
		 * {
		 * cond1 true
		 * }
		 * else if(cond2)
		 * {
		 * cond2 true
		 * }
		 * else if(cond3)
		 * {
		 * cond3 true
		 * }
		 * else
		 * {
		 * false
		 * }
		 ** 
		 * */
		
		int age=10;
		
		if(age>18)
		{
			System.out.println("major");
		}
		else if(age<18)
		{
			System.out.println("minor");
		}
		else
		{
			System.out.println("age is 18!!!!");
		}
	}
}
