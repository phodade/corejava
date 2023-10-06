package Pass;

	import java.util.Scanner;

	public class Passenger1 {
		public static void main(String[] args)
		{
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter the name of passenger :");
		     String name=scanner.next();
		     
			System.out.println("Enter the age of passenger :");
			int age =scanner.nextInt();
			
			String ticketPrice;
			
			if(age>=0 && age<=5)
			{
				ticketPrice = " No Ticket ";
			}
			else if (age >=6 && age <= 10) 
			{
				ticketPrice = " Half Ticket ";
			}
			else if (age >= 11 && age <= 50) 
			{
				ticketPrice =" Full Ticket ";
			}
			else 
			{
				ticketPrice =" half ticket ";
			}
			
			System.out.println("Passanger : " + name);
			System.out.println("Age : " + age);
			System.out.println("Ticket Price : " + ticketPrice);
		}

	}


