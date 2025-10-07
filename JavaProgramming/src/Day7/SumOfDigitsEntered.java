package Day7;

import java.util.Scanner;

public class SumOfDigitsEntered 
{
	long num,temp,digit,sum;
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		num=sc.nextLong();
		temp=num;
		sum=0;
	}
	void getData()
	{
		while(temp!=0)
		{
			digit=temp%10;
			sum=sum+digit;
			temp=temp/10;
			
		}
		System.out.println("Sum of Digits of "+num+" is :"+sum);
	}
	
	public static void main(String[] args) 
	{
		SumOfDigitsEntered d=new SumOfDigitsEntered();
		d.setData();
		d.getData();
	}

}
