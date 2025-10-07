package Day7;

public class Circle 
{
	float radius;
	float Area;

	Circle(float r)
	{
		radius=r;
	}
	
	double Area()
	{
		return 3.14*radius*radius;
	}
	public static void main(String[] args)
	{
		Circle c1;
		c1=new Circle(5);
		System.out.println(c1.Area());
	}
}
