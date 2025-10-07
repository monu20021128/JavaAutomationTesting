package Day11;

class MyClass
{
	static void method()
	{   
		try
		{
		throw new ArithmeticException();
		}
		catch ( ArithmeticException e)
		{
		System.out.println("Caught and Rethrown");
		throw e;
		}
	}
}

public class Throw_Throws 
{

	public static void main(String[] args) 
	{
		try
		{
			MyClass.method();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught in main "+e);
		}
	}

}
