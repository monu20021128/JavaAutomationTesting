package Practice;

import java.util.Scanner;

public class One_dimensional_Arrays 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows in array: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];  
		
		System.out.println("Enter "+n+" values for array: ");
		for(int r=0;r<a.length;r++)
		{
			a[r]=sc.nextInt();
		}
		System.out.println("Array is: ");
		for(int r=0;r<a.length;r++)
		{
			System.out.println(a[r]);
		}
	}
}
