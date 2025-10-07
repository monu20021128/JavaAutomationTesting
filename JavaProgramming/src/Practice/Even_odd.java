package Practice;

import java.util.Scanner;

public class Even_odd 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long num,temp,digit;
		int eve,odd;
		
		System.out.println("Enter number: ");
		num=sc.nextLong();
		
		temp=num;
		eve=0;
		odd=0;
		
		while(temp!=0)
		{
			digit=temp%10;
			if(digit%2==0)
			{
				eve++;
			}
			else
			{
				odd++;
			}
			temp=temp/10;
		}
		System.out.println("There are "+eve+" Even and "+odd+" Odd numbers in "+num);
	}
}
