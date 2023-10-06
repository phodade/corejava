package String_Functions;

import java.util.Scanner;

public class StringLearning {
	public static void main(String[] args)
	{
             String input = "pratiksha";
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);

	            if (i % 2 == 0) 
	            {
	             result.append(Character.toUpperCase(currentChar));
	            } 
	            else 
	            {
	              result.append(currentChar);
	            }
	        }
	        System.out.println(result.toString());
		    }
		}


