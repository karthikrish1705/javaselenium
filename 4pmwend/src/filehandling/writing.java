package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writing {
	public static void main(String[] args) throws IOException {
		
		//File :  reach the path :   pass path of the file as input
		//FileWriter: create a file: pass file object as input
		//BufferedWriter: write    : pass file wrter object as input
		
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\4pmwend\\src\\siva.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("hi");
		bw.newLine();
		bw.write("hello");
		bw.newLine();
		bw.write("welcome");
		bw.close();
	}

}
