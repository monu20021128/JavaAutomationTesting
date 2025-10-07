package Day2;

import java.util.Scanner;

public class Odd_Even 
{

	public static void main(String[] args) 
	{
		
		int b=Integer.parseInt(args[0]);  
//		Integer.parseInt() is used to convert String to integer 
		
		if(b%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}

}
