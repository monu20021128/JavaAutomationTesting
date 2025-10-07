package Day4;

import java.util.Scanner;

public class Area_of_Triangle {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Height of traingle :");
		float h=sc.nextFloat();
		System.out.println("Enter Base of traingle :");
		float b=sc.nextFloat();
		float result=b*h/2;
		System.out.println("Area of triangle is: "+result);
		
	}

}
