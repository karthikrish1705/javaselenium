package interf;

public class c1 implements intro {

	public static void main(String[] args) {
		
		c1 ob=new c1();
		ob.ab();
		ob.area();
		
		
	}

	@Override
	public void ab() {
		System.out.println("abstract method");
		
	}
}
