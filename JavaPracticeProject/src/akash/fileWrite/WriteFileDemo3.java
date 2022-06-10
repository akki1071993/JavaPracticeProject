package akash.fileWrite;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;

import java.io.FileOutputStream;
import java.io.FileWriter;

import java.io.IOException;

// write message in file demo with BufferedWriter synchronized method 

public class WriteFileDemo3 {

	public static void main(String[] args) throws IOException {

		/*
		 * Open file , create object of file and create file if file is not exist
		 * Parameters:file the file to be opened for writing.append if true, then bytes
		 * will be write into the end of the file rather than the beginning
		 */
		BufferedWriter file = new BufferedWriter(new FileWriter("E:\\files\\file1.txt", true));

		String msg = "Uche log uchi pasand : RMD";
		file.append(msg);
		System.out.println("File written successfully");

		file.close(); // Close file

		BufferedOutputStream f = new BufferedOutputStream(new FileOutputStream("E:\\files\\file3.txt", true));
		String msg2 = "Bolo zubaan kesari: Vimal";
		f.write(msg2.getBytes());
		System.out.println("File written successfully");

		f.close(); // Close file

	}

}
