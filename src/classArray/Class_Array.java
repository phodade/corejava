package classArray;

public class Class_Array {
	
	public static void main(String[] args)
	{
		Student [] students = new Student[10];
		
		for(int i=0;i<10;i++)
		{
			students[i]=new Student();
			students[i].rollNumber=100+i;
			students[i].name="Student"+i;
			students[i].address="Address"+i;
			students[i].email="emil"+i;
			students[i].mobile="mobile"+i;
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println("RollNumber : "+students[i].rollNumber +" "+ "Name : "+students[i].name +" "+ 
		      "Address : "+students[i].address +" "
			+"email : "+students[i].email +" "+"mobile : "+students[i].mobile);
		}
	}

}
