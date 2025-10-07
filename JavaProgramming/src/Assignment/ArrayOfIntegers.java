package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfIntegers 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to store: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		int sum=0;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter number "+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(arr));
		System.out.print("Even numbers are: ");
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		for(i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of all elements of array is: "+sum);
		
		int max=arr[0];
		for(i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
			}
			
		}
		System.out.println("Maximum of entered number is: "+max);
		
		int min=arr[0];
		for(i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]<min)
				{
					min=arr[i];
				}
			}
			
		}
		System.out.println("Maximum of entered number is: "+min);
	}
}
