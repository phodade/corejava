package String_Functions;
import java.util.Scanner;

public class StringLearning2 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
        String[] strings = new String[5];
        
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter string:");
            strings[i] = scanner.nextLine();
        }
        String joinedString = String.join(", ", strings);
        
        System.out.println("Joined string: " + joinedString);
    }
}




	 