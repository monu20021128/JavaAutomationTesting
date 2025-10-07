package Day2;

public class Larger_bw_three_cmdlineargs 
{

	public static void main(String[] args) 
	{
		if(args.length==3) 
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			
			if(a>b && a>c)
			{
				System.out.println("Larger is : " +a);
			}
			else if(b>c)
			{
				System.out.println("Larger is : " +b);
			}
			else
			{
				System.out.println("Larger is c : " +c);
			}
		}
		else
		{
			System.out.println("Enter Only 3 command Line Argument");
		}
	}

}
