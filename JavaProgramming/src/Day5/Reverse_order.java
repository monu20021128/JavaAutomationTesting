package Day5;

public class Reverse_order {

	public static void main(String[] args) 
	{
//		to display command line arguments in reverse order
		System.out.println("All command line argument are:");
		for(int i=args.length-1; i>=0;i--)
		{
			System.out.println(args[i]);
			
		}
		
	}

}
