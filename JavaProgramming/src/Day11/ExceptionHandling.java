package Day11;

public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		try
		{
			System.out.println("In try block");
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Quotient = "+c);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Exception Caught: "+e1);
		}
		/*catch(NumberFormatException e2)
		{
			System.out.println("DataType Exception "+e2 );
		}*/
		System.out.println("After Catching");
	}
}
