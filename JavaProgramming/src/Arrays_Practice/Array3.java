package Arrays_Practice;

import java.util.Arrays;

public class Array3 
{

	public static void main(String[] args) 
	{
		
		 int a[]= {100,20,300,40,50,600};
		
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(a));
		
		System.out.println("After sorting: ");
		Arrays.sort(a);											// for sorting in increasing order				
		System.out.println(Arrays.toString(a));
		
	}
}
