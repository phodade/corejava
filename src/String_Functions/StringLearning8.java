package String_Functions;

public class StringLearning8 {
	public static void main(String[]args)
	{
		 String name = "pratiksha@.gmailcom"; 

	        String[] xyz = name.split("@");
	        System.out.println("User Name: " + xyz[0]);
	        System.out.println("Domain: " + xyz[1]);

	        name.toUpperCase();
	        name.toLowerCase();

	        StringBuilder sb = new StringBuilder();
	    }
	}
