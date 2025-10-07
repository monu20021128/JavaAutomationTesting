package Practice;

import java.util.Scanner;
public class Palindrome_num 
{

	public static void main(String[] args) 
	{
		long num, rev, digit,temp;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number for reversing:");
		num=sc.nextLong();
		System.out.println("Entered number is: "+num);
		rev=0;
		temp=num;
		while(temp!=0)
		{
			digit=temp%10;
			rev=(rev*10)+digit;
			temp=temp/10;
		}
		System.out.println("Reverse of Entered number is :" +rev);
		
		if(num==rev)
		{
			System.out.println("Entered number is Palindrome number");
		}
		else 
		{
			System.out.println("Entered number is not a Palindrome number");
		}

	}

}
