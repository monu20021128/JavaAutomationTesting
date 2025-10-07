package Day11;

import java.util.Scanner;

public class Exception 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		a=sc.nextInt();
		System.out.println("Enter Second Number: ");
		b=sc.nextInt();
		try
		{
		c=a/b;
		System.out.println("Division is: "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by 0 Error, Try again "+e);
		}
		System.out.println("Bye");
		
		
	}
}
