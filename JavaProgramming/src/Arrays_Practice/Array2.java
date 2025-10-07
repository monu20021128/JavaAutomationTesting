package Arrays_Practice;

// Two dimensional array

public class Array2 
{
	public static void main(String[] args) 
	{
		int a[][]= {{10,20},
					{30,40},
					{50,60}
					};
		
		System.out.println("no. of rows in two dimensional array is: "+a.length);
		System.out.println("no. of columns in two dimensional array is: "+a[0].length);  //number of columns for 0th row. 
		
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+"  ");
			}
			System.out.println();
		}

	}

}
