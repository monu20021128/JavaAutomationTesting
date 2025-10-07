package Practice;

import java.util.Scanner;

public class Two_Dimensional_Array 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows in Array: ");
		int m=sc.nextInt();
		System.out.println("Enter number of columns in Array: ");
		int n=sc.nextInt();
		
		int a[][]=new int[m][n];
//		System.out.println(m);
//		System.out.println(n);

		System.out.println("Enter value for "+m+" rows and "+n+" columns in Array: ");
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
		System.out.println("Array is: ");
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+"   "); // white giving input and printing output of array variable in loop should be entered inside bracket 
			}
			System.out.println();
		}
	}

}
