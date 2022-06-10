package akash.fileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo2 {

	public static void main(String[] args) {

		FileReader  reader = null;
		try {
			File file = new File("E:\\files\\file1.txt");
			reader = new FileReader(file);
			char[] data  = new char[(int)file.length()];
			reader.read(data);			
			System.out.println(data);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
