package Algebra;

public class Binomial {
	public static void main(String[] args) 
	{
		int a=expansion(2,3);
		System.out.println(a);
		int b=expansion_square(2,3);
        System.out.println(b);
        int c=expansion_cube(2,3);
        System.out.println(c);
        int d=expansion_quad(2,3);
        System.out.println(d);
        int e=expansion_penta(2,3);
        System.out.println(e);
        
	
	}
	public static int expansion(int a, int b) {
		return a+b;
	}
	public static int expansion_square(int a, int b) {
		return a*a+2*a*b+b*b;
	}

	public static int expansion_cube(int a, int b) {
		return a*a*a+3*a*a*b+3*a*b*b+b*b*b;
	}

	public static int expansion_quad(int a, int b) {
		return a*a*a*a+4*a*a*a*b+6*a*a*b*b+4*a*b*b*b+b*b*b*b;
	}

	public static int expansion_penta(int a, int b) {
		return a*a*a*a*a+5*a*a*a*a*b+10*a*a*a*b*b+10*a*a*b*b*b+5*a*b*b*b*b+b*b*b*b*b;
					
		}

	

}
