package Practice;

import java.util.Scanner;

public class Count_digits_of_entered_num 
{

	public static void main(String[] args) 
	{
		/* Technique 1
		long num;
		String count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		num=sc.nextLong();
		count=String.valueOf(num);
		System.out.println("Length of Entered number is: "+count.length());
		*/
		
//		Technique 2
		long num,temp;
		int count;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		num=sc.nextLong();
		
		count=0;
		temp=num;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		System.out.println("Length of Entered number is: "+count);
	}

}
