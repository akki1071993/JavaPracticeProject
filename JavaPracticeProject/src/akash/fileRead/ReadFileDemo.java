package akash.fileRead;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {

		FileInputStream reader = null;
		try {
			File file = new File("E:\\files\\file1.txt");
			reader = new FileInputStream(file);

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
