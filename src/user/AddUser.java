package user;

	import java.util.Scanner;

	public class AddUser {
		public static void main(String[] args)
		{
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter the Username : ");
			String userName=scanner.next();
			
			System.out.println("Enter the Employee Name : ");
			String employeeName=scanner.next();
			
			System.out.println("Enter the password : ");
			String password=scanner.next();
			
			System.out.println("Enter the conform password : ");
			String conformPassword=scanner.next();
			
			
			scanner.close();
			
			System.out.println("User Name : " + userName);
			System.out.println("Employee Name : " + employeeName);
			System.out.println("password : " +  password);
			System.out.println("conform password : " + conformPassword);
			}

	}


