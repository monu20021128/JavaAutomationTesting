package Day6;

import java.util.Arrays;

public class Sort_n_numbers 
{
	public static void main(String[] args)
	{
		int num[]= {100,20,30,80,40,70,0,100};
		System.out.println("Array Before Sorting: "+Arrays.toString(num));
		
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=0;j<num.length-1;j++)
			{
				if(num[j]<num[j+1])
				{
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println("Array After Sorting: "+Arrays.toString(num));
	}
}
