package akash.fileWrite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import akash.finalproject.FileOperations;

// File Creation demo with FileOutputStream

public class CreateFileDemo2 {

	public static void main(String[] args) throws IOException {

		CreateFileDemo2 cd = new CreateFileDemo2();
		
		FileOutputStream obj = new FileOutputStream("E:\\files\\akash"); // Create file object an file

		
		List<String> filesListNames = FileOperations.listFilesInDirectory("E:\\files", 0, new ArrayList<String>());

		System.out.println("Displaying all files in ascending order\n");
		Collections.sort(filesListNames);

		filesListNames.stream().forEach(System.out::println);
		
		obj.close();
	}

	// get File name with Date and Time
	public String getFileName() {

		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
		Date date = new Date(System.currentTimeMillis());
		String fileName = formatter.format(date) + ".txt";
		return fileName;

	}

}
