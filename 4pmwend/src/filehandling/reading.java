package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reading {
	
	public static void main(String[] args) throws IOException {
		
		//File                : reach that file     : pass path f the file as inpt
		//FileReader          : fetch that file     : pass file object as input
		//BufferedReader      : read the content    : pass file reader object as input
		
		// JRE 
		
		// non static in nature 
		
		File f= new File("C:\\Users\\hp\\Desktop\\10am.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		/*br.readline will read hi   line=hi         line!=null  print hi
		 *br.readline will read hello line=hello     line!=null  print hello
		 *br.readline will read nothing   line=null  line!=null// loop terminate 
		 * 
		 * 
		 * 
		 * */
		
	}

}
