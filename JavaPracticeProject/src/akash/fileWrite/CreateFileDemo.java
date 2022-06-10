package akash.fileWrite;

import java.io.File;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;


/*File Creation demo
with current date and time naming */

public class CreateFileDemo {

	public static void main(String[] args) throws IOException {
		
		//Date and Time
		SimpleDateFormat formatter= new SimpleDateFormat("ddMMyyyyHHmmss");
		Date date = new Date(System.currentTimeMillis());		
		String fileName = formatter.format(date)+".txt";
		
		
		File obj = new File("E:\\files\\"+fileName); // Create file object

		if (obj.createNewFile()) { // If file is not in current folder. Create a new file
			System.out.println("File created successfuly: " + obj.getName());
		} else { // If file already exist in current folder 
			System.out.println("File already exiest");
		}

	}

}
