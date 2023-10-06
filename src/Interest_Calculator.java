import java.util.Scanner;

public class Interest_Calculator {
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("****Welcome to Interest calculator****\n\n");
		System.out.println("Enter the principale amount : ");
		int amount=scanner.nextInt();
		
		System.out.println("Enter the interest rate :");
	    float interest=scanner.nextFloat();
		
		System.out.println("Enter the years :");
		int year=scanner.nextInt();
	
		 
		System.out.println("\nInterest of amount is : " + amount*interest*year);
		
		
		}

}
