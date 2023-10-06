package Algebra;

public class Calculator {
	public static void main(String[] args)
	{
		int c=addition(10,5);
		int d=substraction(9,1);
		int e=division(30,3);
		int g=multiplication(9,9);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(g);
	}
	public static int addition(int a, int b)
	{
		return a+b;
	
	}
	public static int substraction(int a, int b)
	{

	return a-b;
	}
	public static int division(int a,int b)
	{
		return a/b;
		
	}
	public static int multiplication(int a, int b)
	{
		return a*b;
	}

}
