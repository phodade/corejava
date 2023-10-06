package file_operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile 
{
	public static void main(String[] args) throws IOException
	{
		File file =new File("C:\\Users\\Pratiksha\\eclipse-workspace\\CoreJava11Sep(fileOperation)\\src\\file_operations\\UserDB.txt");
		
		FileReader fr=new FileReader(file);
		
		BufferedReader br=new BufferedReader(fr);
		
		String line="";
		
		while((line=br.readLine())!=null) 
		{
			System.out.println(line);
		}
		
	}

}
