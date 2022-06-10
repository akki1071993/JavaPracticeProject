package akash.fileRead;

import java.io.BufferedInputStream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo3 {

	public static void main(String[] args) {

		BufferedInputStream reader = null;
		try {
			FileInputStream file = new FileInputStream("E:\\files\\file1.txt");
			reader = new BufferedInputStream(file);

			int ch = 0;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
