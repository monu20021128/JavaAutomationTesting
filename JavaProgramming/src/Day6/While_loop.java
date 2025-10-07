package Day6;

import java.util.Scanner;

public class While_loop 
{
	
	public static void main(String[] args) 
	{
		// Print n number in decreasing order
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n numbers :");
		n=sc.nextInt();
		
//		int i=n;
		while(n>=1)
		{
			System.out.println(n);
			n--;
		}
	}
}
