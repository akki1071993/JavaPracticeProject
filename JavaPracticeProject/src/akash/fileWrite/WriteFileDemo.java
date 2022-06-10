package akash.fileWrite;

import java.io.FileWriter;
import java.io.IOException;

// write message in file demo with FileWriter


public class WriteFileDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * Open file , create object of file and create file if file is not exist
		 * Parameters:file the file to be opened for writing.append if
		 * true, then bytes will be write into the end of the file rather than the
		 * beginning
		 */	
		FileWriter file = new FileWriter("E:\\files\\file1.txt",true); 

		String msg = "Akash Mahant";
		file.append(msg);
		System.out.println("File written successfully");

		
		file.close(); // Close file
		


	}

}
