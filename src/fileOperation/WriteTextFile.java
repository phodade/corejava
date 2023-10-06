package fileOperation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile 
{
	public static void main(String[] args) throws IOException
	{
		File file=new File("C:\\Users\\Pratiksha\\eclipse-workspace\\CoreJava15SepWriteOperation)\\src\\fileOperation\\UserDB.txt");
		FileWriter fileWriter=new FileWriter(file,true);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		String contentToWrite="\nThis is a new line added to the file.";
		bufferedWriter.write(contentToWrite);
		
		bufferedWriter.close();
		fileWriter.close();
		file=null;
	}

}
