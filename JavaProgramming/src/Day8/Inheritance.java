package Day8;

import java.util.Scanner;

class Circle
{
	public double radius;
	public double Area()
	{
		return Math.PI*radius*radius;
		
	}
	public double Parameter()
	{
		return Math.PI*2*radius;
	}
}

class Cylinder extends Circle
{
	public double height;
	public double Volume()
	{
		return Area()*height;
	}
	
}

public class Inheritance 
{
	public static void main(String[] args) 
	{
		Cylinder c=new Cylinder();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		c.radius=sc.nextDouble();
		System.out.println("Enter height: ");
		c.height=sc.nextDouble();
//		c.radius=7;
//		c.height=15;
		
		System.out.println("Area of Circle: "+c.Area());
		System.out.println("Parameter of Circle: "+c.Parameter());
		System.out.println("Volume of Cylinder: "+c.Volume());
	}
}
