import java.util.Scanner;

public class Passenger {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the name of passenger :");
	     String name=scanner.next();
		System.out.println("Enter the age of passenger :");
		int age =scanner.nextInt();
		
		if(age<5)
		{
			System.out.println(name + " No Ticket ");
		}
		else if (age > 5 && age < 10) 
		{
			System.out.println(name + " Half Ticket ");
		}
		else if (age > 10 && age < 50) 
		{
			System.out.println(name + " Full Ticket ");
		}
		else if(age > 50)
		{
			System.out.println(name + " half ticket ");
		}
	}

}
