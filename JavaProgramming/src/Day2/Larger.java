package Day2;

public class Larger
{

	public static void main(String[] args) 
	{	
		if(args.length==2)
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
	
			if(a>b)
			{
				System.out.println("Larger is: "+a);
			}
			else 
			{
				System.out.println("Larger is: "+b);
			}	
		}
		else
		{
			System.out.println("Enter Only 2 command Line Argument");
		}
	}
}