package Practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Loops 
{

	public static void main(String[] args) 
	{
//		byte n=0;
		/*while(n!=0)
		{
			System.out.println("Value of n is: "+n);
			n++;
		}*/
		
		/*do
		{
			System.out.println("Value of n is: "+n);
			n++;												//infinite loop
		}while(n!=0);
		*/
//		System.out.println("Loop ended");
		
		/*int i;
		int j;
		for( i=5, j=0;i>=0 && j<=10; i-- , j++)
		{
			System.out.println("Value of i is "+i+" value of j is "+j);
		}
		*/
		
//		int i;
//		int sum=0;
//		for(i=0;i<=20;i++)
//		{
//			sum=sum+i;
//		}
//		System.out.println("Sum is: "+sum);
		
		
		ArrayList hs=new ArrayList(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
		int num;
		int sum=0;
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			num=(int) it.next();
			sum=sum+num;
		}
		System.out.println("Sum is : "+sum);
		
	}
}
