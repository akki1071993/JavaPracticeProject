package akash.fileWrite;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {

	public static void  modifyFile(String filename, String oldString, String newString)
	{
		
		File filetoModify= new File(filename);
		String oldContent=""; //files old content
		BufferedReader reader=null;
		FileWriter writer=null;
		
		try {
			reader = new BufferedReader(new FileReader(filetoModify));
			String line= reader.readLine();
			while(line!=null)
			{
				oldContent= oldContent+ line+ System.lineSeparator();
				line=reader.readLine();
			}
		
			//lets update old content with new
			String newContent= oldContent.replaceAll(oldString, newString);
			
			//let's write this updated data to file
			writer= new FileWriter(filetoModify);
			writer.write(newContent);
			
			System.out.println("File Updated Successfully");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		modifyFile("E:\\files\\file5.txt", "line", "record");
	}
}
