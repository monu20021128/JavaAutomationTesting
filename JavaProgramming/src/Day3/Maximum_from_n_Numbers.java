package Day3;

public class Maximum_from_n_Numbers 
{

	public static void main(String[] args) 
	{
		 if (args.length == 0) 
		 {
	            System.out.println("Please provide numbers as command line arguments.");
	            return;
	     }
		System.out.println("Entered numbers are :");
		int max=Integer.parseInt(args[0]);
		System.out.println(args[0]);
		for(int i=1;i<args.length;i++)
		{
			int num=Integer.parseInt(args[i]);
			System.out.println(args[i]);
			if(num>max)
			{
				max=num;
				
			}
			
		}
		System.out.println("Maximum among entered numbers is :"+max);
		
	}

}
