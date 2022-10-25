package basics;

public class Intro {

	// main : hold on control and click on space bar 
	public static void main(String[] args) {
		
		System.out.println("hello");
		System.out.println('h');
		System.out.println(30);
		System.out.println(34.56);
		
		// classname.methodname();
		// area=> m1.java
		
		m1.area();
		//m1.product();
		
		m2 ob= new m2();
		ob.area();
		//ob.add();
		
		m6 ob1= new m6();
		ob1.addition(1.5, 5.6);
		System.out.println(ob1.average(3.5, 5.8));
		
		cons ob4= new cons();
		cons ob6= new cons(4);
	}
	
	
	
	
	
}

/*
 * Jdk : java development kit
 *     : creates an envrnment
 *       Jdk=devlopment tools + JRE 
 *       
 *eclipse : Integrated Development Environment
 *          code easily
 *          eg: netbeans, intellij
 *          
 *File=> new=> project=> java project=> name=> fnsh
 *
 *JRE : Java run time environment 
 *    : Java library files 
 *    : library files+ JVM 
 *    
 *JVM : Java virtual machine 
 *
 *right clicked on src => new=> package=> name=> fnsh
 *
 *package:   folder structure that will help u to store similar kind of code
 *       :   code retrival is easy
 *       :   naming convention: should starts with lower case letter 
 *       
 *right clicked on package=> new => class=< name => finish
 *
 *class : template for creating and defining objects
 *
 *syntax for creating class :     public class classname{}
 *
 *accessmodifiers
 *
 *public       : use it anywhere inside the project       eg: telephonebooth
 *private      : use it only within the class             eg: phone 
 *protected    : use it within the class and its related  eg: tv
 * * 
 * 
 * main method
 * 
 *     makes the class runnable
 *     configuration=> java application
 *     whenever u run the class : compiler will always look for main method; code present in it will be executed 
 *     
 *     
 * public
 * static: type of method
 * void : one of the returntypes
 * main- name
 * 
 *  
 *  word   :   enclose that with double quote
 *  letter :   enclose that with single quote
 *  number :   no need for quotes 
 * 
 * */
 