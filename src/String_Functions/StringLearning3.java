package String_Functions;
import java.util.Scanner;

public class StringLearning3 {
	
  public static void main(String[] args) 
  {
	  Scanner scanner = new Scanner(System.in);
	  
      System.out.print("Enter a string: ");
      
      String input = scanner.nextLine();
      
      String cleanInput = input.replaceAll("\\s", "").toLowerCase();
      
      String reversedInput = new StringBuilder(cleanInput).reverse().toString();
      
      if (cleanInput.equals(reversedInput))
      {
          System.out.println("String is a palindrome.");
      } 
      else 
      {
          System.out.println("String is not a palindrome.");
      }
  }
  }
  
	   
	       


