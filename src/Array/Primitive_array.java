package Array;
public class Primitive_array {
	public static void main(String[] args)
	{
		int[] rollNumber = new int[10];
		
		for(int i=0;i<10;i++)
		{
			rollNumber[i]=i+100;
		}
		
		String[] names=new String[10];
		names[0] ="Pratiksha";
		names[1] ="Rani";
		names[2] ="Jaii";
		names[3] ="Vaishnavi";
		names[4] ="Anuja";
		names[5] ="Gauri";
		names[6] ="Anuradha";
		names[7] ="Dipti";
		names[8] ="Revati";
		names[9] ="Arti";
		
		String[] address = new String[10];
		address[0]="Pune";
		address[1]="Nagpur";
		address[2]="Nashik";
		address[3]="Solapur";
		address[4]="Jalna";
		address[5]="Beed";
		address[6]="Mumbai";
		address[7]="Parbhani";
		address[8]="Sambhajinagar";
		address[9]="Dhule";
		
		for(int i=0;i<10;i++)
		{
			System.out.println("RollNumber:"+rollNumber[i]+" "+"Name:"+names[i]+" "+"Address:"+address[i]);
		}
		}
}


