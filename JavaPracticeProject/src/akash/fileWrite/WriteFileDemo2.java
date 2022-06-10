package akash.fileWrite;

import java.io.FileOutputStream;

import java.io.IOException;

// write message in file demo with  FileOutputStream 
//means  we store  data in bytes format. 


public class WriteFileDemo2 {

	public static void main(String[] args) throws IOException {

		/*
		 * Open file , create object of file and create file if file is not exist
		 * Parameters:file the file to be opened for writing.append if
		 * true, then bytes will be write into the end of the file rather than the
		 * beginning
		 */		
		FileOutputStream file = new FileOutputStream("E:\\files\\file1.txt",true);  

		String msg = "Akash Mahant";
		file.write(msg.getBytes());
		System.out.println("File written successfully");

		
		file.close(); // Close file

	}

}
