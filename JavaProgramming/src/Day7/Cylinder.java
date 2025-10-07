package Day7;

public class Cylinder 
{

	float radius;
	float height;
	float Area;
	Cylinder(float x,float y)
	{
		radius=x;
		height=y;
	}
	
	double CalculateArea()
	{
		return (2*3.14*radius*height);
	}
	
	public static void main(String[] args) 
	{
		Cylinder C1;
		C1=new Cylinder(5,4);
		double Area=C1.CalculateArea();
		System.out.println("Area of Cylinder is :"+Area);
	}
}
