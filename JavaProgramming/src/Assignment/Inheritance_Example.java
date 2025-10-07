package Assignment;

class person
{
	String name;
	int age;
	
	person(String name, int age)
	{
		this.age=age;
		this.name=name;
	}
	
	void displayInfo()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
}
class stud extends person
{
	int stuId;
	String courseName;
	stud(String name, int age,int stuId,String courseName ) 
	{
		super(name, age);
		this.stuId=stuId;
		this.courseName=courseName;
	}
	
	void displayStudInfo()
	{
		super.displayInfo();
		System.out.println("Student Id: "+stuId);
		System.out.println("Course Name: "+courseName);
	}
	
}


public class Inheritance_Example 
{

	public static void main(String[] args) 
	{
		stud s=new stud("Monu",23,101,"BCA");
		
		System.out.println("Person Detail: ");
		s.displayInfo();
		System.out.println();
		System.out.println("Student Details:");
		s.displayStudInfo();

	}

}
