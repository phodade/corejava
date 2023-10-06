package user_management19Aug;

import java.util.Scanner;

public class UserManagement {
	static User[] u1=new User[10];
	static int userCount=0;
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		boolean canIKeepRunningTheProgram=true;
		while(canIKeepRunningTheProgram==true)
		{
			System.out.println("****Welcome to user management****");
			System.out.println("\n");
			System.out.println("What would you like to do?");
			System.out.println("1.add user:");
			System.out.println("2.edit user:");
			System.out.println("3.delete user:");
			System.out.println("4.search user:");
			System.out.println("5.quit");
			
			
			int optionSelectedByUser=scanner.nextInt();
			if( optionSelectedByUser==5)
				
			{
				System.out.println("!!!Program Closed...");
				canIKeepRunningTheProgram=false;
			}
			else if( optionSelectedByUser==1)
			{
				addUser();
				System.out.println("\n");
			}
		}
		System.out.println("After while loop:");
		
		for(int i=0;i<10;i++)
		{
			System.out.println(u1[i].userName);
		}
		}
	
	public static void addUser()
	{
		Scanner scanner=new Scanner(System.in);
		u1[userCount]=new User();
		System.out.println("User Name");
		u1[userCount].userName=scanner.nextLine();
		
		System.out.println("login name");
		u1[userCount].loginName=scanner.nextLine();
		
		System.out.println("Password");
		u1[userCount].password=scanner.nextLine();
		
		System.out.println("Confrom Password");
		u1[userCount].conformPassword=scanner.nextLine();
		
		System.out.println("User Role");
		u1[userCount].userRole=scanner.nextLine();
		
		System.out.println("User Name: "+u1[userCount].userName);
		System.out.println("Login Name: "+u1[userCount].loginName);
		System.out.println("Password: "+u1[userCount].password);
		System.out.println("conform password: "+u1[userCount].conformPassword);
		System.out.println("User Role: "+u1[userCount].userRole);
		
		userCount=userCount+1;
		}
	}
