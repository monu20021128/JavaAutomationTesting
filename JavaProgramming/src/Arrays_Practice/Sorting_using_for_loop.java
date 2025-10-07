package Arrays_Practice;

import java.util.Arrays;

public class Sorting_using_for_loop 
{

	public static void main(String[] args) 
	{
		
		// Ascending order sorting
		/*int a[]= {10,30,60,40,50,05,20};
		
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(a));
		
		System.out.println("After SOrting: ");
		int temp;
		for(int i=0;i<a.length-1;i++)
		
			for(int j=0;j<a.length-1;j++)
			
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		System.out.println(Arrays.toString(a));*/
		
		
		
		// Descending order sorting
		
		int a[]= {10,30,60,40,50,05,20};
		
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(a));
		
		System.out.println("After SOrting: ");
		int temp;
		for(int i=0;i<a.length-1;i++)
		
			for(int j=0;j<a.length-1;j++)
			
			if(a[j]<a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		System.out.println(Arrays.toString(a));
	}

}
