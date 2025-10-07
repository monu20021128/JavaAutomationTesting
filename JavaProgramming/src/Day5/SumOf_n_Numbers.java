package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class SumOf_n_Numbers {

	public static void main(String[] args) 
	{
//		(accept n numbers from users and store them in array, and find sum of n numbers.) 
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("How many numbers you want to store: ");
		n=sc.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0;i<n;i++)
		{
		System.out.println("Enter no "+(i+1));
		a[i]=sc.nextInt();
		}
//		System.out.println("Entered numbers are: "+Arrays.toString(a));
	/*	System.out.println("Entered numbers are: ");
		for(i=0;i<n;i++)
		{
		System.out.println(a[i]);
		
		}*/
		int sum=0;
		for(i=0;i<n;i++)
		{
		sum=sum+a[i];
		}
		System.out.println("Sum of : "+Arrays.toString(a)+" is " +sum);
	}
	
	/*public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers you want to store: ");
		int n=sc.nextInt();
		int i;
		
		int Ar[]=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter " +(i+1) +" number :");
			Ar[i]=sc.nextInt();
			
		}
		int sum=0;
		for(i=0;i<n;i++)
		{
			sum=sum+Ar[i];	
		}
		System.out.println("Sum of Entered number is :"+sum);
	}*/
}
