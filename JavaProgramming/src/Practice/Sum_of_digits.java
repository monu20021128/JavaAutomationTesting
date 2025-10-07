package Practice;

import java.util.Scanner;

public class Sum_of_digits 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long num,temp,digit,sum;
		
		
		System.out.println("Enter number:");
		num=sc.nextLong();
		
		sum=0;
		temp=num;
		while(temp!=0)
		{
			digit=temp%10;
			sum=sum+digit;
			temp=temp/10;
		}
		System.out.println("Sum of Digits of "+num+" is :"+sum);
	}

}
