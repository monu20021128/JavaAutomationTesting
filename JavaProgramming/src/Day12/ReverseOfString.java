package Day12;

public class ReverseOfString 
{

	public static void main(String[] args) 
	{
		//Approach 1
		/*String s="Welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		*/
		
		//Approach 2
		/*String s="Hello";
		System.out.println("Entered String is: "+s);
		String rev="";
		
		char c[]=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println("Reverse of entered String is: "+rev);
		*/
		
		
		//Using StringBuffer and StringBuilder we can directly reverse a String
		//Approach 3
		StringBuffer s1=new StringBuffer("Welcome");
		System.out.println("Entered String is: "+s1);
		System.out.println("Reverse String is: "+s1.reverse());
		
		
		//Approach 4    
		StringBuilder s2=new StringBuilder("Hello");
		System.out.println("Entered String is: "+s2);
		System.out.println("Reverse String is: "+s2.reverse());
	}
}
