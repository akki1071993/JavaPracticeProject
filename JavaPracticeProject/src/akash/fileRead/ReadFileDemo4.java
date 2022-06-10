package akash.fileRead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo4 {

	public static void main(String[] args) {

		BufferedReader reader = null;
		try {
			FileReader file = new FileReader("E:\\files\\file1.txt");
			reader = new BufferedReader(file);

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
