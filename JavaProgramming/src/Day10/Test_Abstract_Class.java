package Day10;

abstract class Shape
{
	abstract double Area();
	abstract double Perimeter();
}

class Circle extends Shape
{
	double radius;
	
	double Area() 
	{
		double area= Math.PI*radius*radius;
		return area;
		
	}

	double Perimeter()
	{
		double perimeter= Math.PI*radius*radius;
		return perimeter;
		
	}

}



class Rectangle extends Shape
{
	int length;
	int breadth;
	double Area() 
	{
		int Area=length*breadth;
		return Area;
	}

	
	double Perimeter() 
	{
		int perimeter=2*(length+breadth);
		return perimeter;
	}
}

public class Test_Abstract_Class 
{

	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.length=10;
		r.breadth=5;
		
		Shape s=r;	//Reference of parent class can call only those methods and variables which are  present in Parent class
		System.out.println("Area is "+s.Area());
		System.out.println("Perimeter is "+s.Perimeter());
	}

}


