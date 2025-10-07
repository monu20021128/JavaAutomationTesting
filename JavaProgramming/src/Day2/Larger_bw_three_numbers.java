package Day2;

import java.util.Scanner;

public class Larger_bw_three_numbers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b=sc.nextInt();
		System.out.println("Enter Third Number: ");
		int c=sc.nextInt();
		
		if(a>b && a>c)
			{
				System.out.println("Larger is: " +a);
			}
		else if(b>c)
			{
				System.out.println("Larger is: " +b);
			}
		else
			{
				System.out.println("Larger is: " +c);
			}
		
	}

}
