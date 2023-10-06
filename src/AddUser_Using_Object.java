import java.util.Scanner;

public class AddUser_Using_Object {
	
	static User u1=new User();	
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		boolean canIKeepRunningTheProgram=true;
		
		while (canIKeepRunningTheProgram==true)
		{
			System.out.println("******Welcome To User Management******");
			System.out.println("\n");
			
			System.out.println("What would you like to do ?");
			System.out.println("1.Add User");
			System.out.println("2.Edit User");
			System.out.println("3.Delete User");
			System.out.println("4.Search User");
			System.out.println("5.Quit");
			
			int optionSelectedByUser =scanner.nextInt();
			
			if(optionSelectedByUser==5)
			{
				System.out.println("!!!Program Closed");
				canIKeepRunningTheProgram=false;
			}
			else if(optionSelectedByUser==1)
			{
				addUser();
				System.out.println("\n");
			}
			
		}
		System.out.println("User Name : "+u1.userName);
		System.out.println("Login Name : "+u1.loginName);
		System.out.println("Password : "+u1.password);
		System.out.println("Confire Password : "+u1.confirePassword);
		System.out.println("User Role : "+u1.userRole);
		
	
	}
	
	public static void addUser()
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("User Name: ");
		u1.userName=scanner.nextLine();
		
		System.out.println("Login Name : ");
		u1.loginName=scanner.nextLine();
		
		System.out.println("Password : ");
		u1.password=scanner.nextLine();
		
		System.out.println("Confire Password : ");
		u1.confirePassword=scanner.nextLine();
		
		System.out.println("User Role : ");
		u1.userRole=scanner.nextLine();
		
		System.out.println("User Name : "+u1.userName);
		System.out.println("Login Name : "+u1.loginName);
		System.out.println("Password : "+u1.password);
		System.out.println("Confire Password : "+u1.confirePassword);
		System.out.println("User Role : "+u1.userRole);
			
	}

}
