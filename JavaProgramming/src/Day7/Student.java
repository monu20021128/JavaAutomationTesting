package Day7;

public class Student 
{
	String name;
	int RollNo;
	int StudentClass;
	
	void setData(String x,int y,int z)
	{
		name=x;
		RollNo=y;
		StudentClass=z;
	}
	
	void getData()
	{
		System.out.println("Name: "+ name);
		System.out.println("RollNo is: "+RollNo);
		System.out.println("StudentClass is: "+StudentClass);
	}
	
	public static void main(String[] args) 
	{
		Student S1=new Student();
		S1.setData("Monu",32,10);
		S1.getData();	
	}
}
