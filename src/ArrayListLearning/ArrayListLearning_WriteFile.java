package ArrayListLearning;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListLearning_WriteFile {
	static ArrayList<User> al=new ArrayList();
	
	public static void main(String[] args) throws IOException
	{
	   Scanner scanner=new Scanner(System.in);
				
	   boolean canIKeepRunningTheProgram=true;
				
	   while(canIKeepRunningTheProgram==true)
   	{
		System.out.println("WELCOME TO USER MANAGEMENT");
		System.out.println("\n");
		System.out.println("WHAT WOULD YOU LIKE TO DO..?");
		System.out.println("1.Add User");
		System.out.println("2.Edit User");
		System.out.println("3.Delete User");
		System.out.println("4.Search User");
		System.out.println("5.Quit");
		
	   int optionSelectedByUser=scanner.nextInt();
		
		if(optionSelectedByUser==5)
		{
			System.out.println("PROGRAM CLOSED...!!!!");
			canIKeepRunningTheProgram=false;
		}
		else if(optionSelectedByUser==UserOptions.ADD_USER)
		{
			addUser();
			System.out.println("\n");
			
		}
		else if(optionSelectedByUser==UserOptions.SEARCH_USER)
		{
			System.out.println("Enter The User Name To Serach : ");
			scanner.nextLine();
			String sn =scanner.nextLine();
			searchUser(sn);
			System.out.println("\n");
			
		}
		else if(optionSelectedByUser==UserOptions.DELETE_USER)
		{
			System.out.println("Enter The User Name To delete : ");
			scanner.nextLine();
			String sn =scanner.nextLine();
			deleteUser(sn);
			System.out.println("\n");
			
		}
		else if(optionSelectedByUser==UserOptions.EDIT_USER)
		{
			System.out.println("Enter The User Name To edit : ");
			scanner.nextLine();
			String editUserName =scanner.nextLine();
			editUser(editUserName);
			System.out.println("\n");
			
		}
		
	}
	System.out.println("\n");
	System.out.println("AFTER WHILE LOOP");
	
	for(User u:al)
	{
		System.out.println(u.userName);
		System.out.println(u.loginName);
		System.out.println(u.password);
		System.out.println(u.conformPassword);
		System.out.println(u.userRole);
	}
	
}

	public static void addUser() throws IOException
	{
		Scanner scanner=new Scanner(System.in);
		User userObject=new User();
		
		System.out.println("User Name:");
		userObject.userName=scanner.nextLine();
		
		System.out.println("Login Name:");
		userObject.loginName=scanner.nextLine();
		
		System.out.println("Password:");
		userObject.password=scanner.nextLine();
		
		System.out.println("conform password");
		userObject.conformPassword=scanner.nextLine();
		
		System.out.println("User Role:");
		userObject.userRole=scanner.nextLine();
		
		System.out.println("User Name:"+userObject.userName);
		System.out.println("Login Name:"+userObject.loginName);
		System.out.println("Password:"+userObject.password);
		System.out.println("Conform Password:"+userObject.conformPassword);
		System.out.println("User Role:"+userObject.userRole);
		
		al.add(userObject);
		

		File file=new File("C:\\Users\\Pratiksha\\eclipse-workspace\\OrangeHRM15Sep(WriteFile_USR_MGMT_FILE)\\src\\ArrayListLearning\\UserDB.txt");
		
		FileWriter fileWriter=new FileWriter(file,true);
		
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		
        bufferedWriter.write("User Name: " +userObject.userName);
	    bufferedWriter.newLine(); 
	    bufferedWriter.write("Login Name: " + userObject.loginName);
	    bufferedWriter.newLine();
	    bufferedWriter.write("Password: " +userObject.password);
	    bufferedWriter.newLine(); 
	    bufferedWriter.write("Conform Password: " +userObject.conformPassword);
	    bufferedWriter.newLine();
	    bufferedWriter.write("User Role: " +userObject.userRole );
	    bufferedWriter.newLine(); 
	    
        bufferedWriter.close();
		fileWriter.close();
		System.out.println("User information added and written to the file.");

	}

	public static void searchUser(String userName)
	 {
		for(User user : al)
		 {
			if(user.userName.equalsIgnoreCase(userName))
			{
				System.out.println("User Name:"+user.userName);
				System.out.println("Login Name:"+user.loginName);
				System.out.println("Password:"+user.password);
				System.out.println("Conform Password:"+user.conformPassword);
				System.out.println("User Role:"+user.userRole);
				return;
			}
		}
		
		System.out.println("User Not Found");
	}

	public static void deleteUser(String userName)
	{
		Iterator<User>Iterator=al.iterator();
		
		while(Iterator.hasNext())
		{
			User user=Iterator.next();
			if(user.userName.equalsIgnoreCase(userName))
			{
				Iterator.remove();
				System.out.println("User" + user.userName+"has been deleted.");
				break;
			}
		}
		
	}
	
	public static void editUser(String userName)
	{
		for(User user : al)
		{
			if(user.userName.equalsIgnoreCase(userName))
			{
		        Scanner scanner=new Scanner(System.in);
				System.out.println("Editing User:"+user.userName);

				System.out.println("New User Name:");
				user.userName=scanner.nextLine();
				
				System.out.println("New Login Name:");
				user.loginName=scanner.nextLine();
				
				System.out.println("New Password:");
				user.password=scanner.nextLine();
				
				System.out.println("New conform password:");
				user.conformPassword=scanner.nextLine();
				
				System.out.println("New User Role:");
				user.userRole=scanner.nextLine();
				
				
				System.out.println("User Information Updated");
				
				return;
           }
		}
	}
  }




