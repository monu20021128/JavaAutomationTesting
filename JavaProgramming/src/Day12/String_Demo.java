package Day12;

public class String_Demo 
{

	public static void main(String[] args) 
	{
		String s1=new String();
		System.out.println("s1 = "+s1);
		
		char ar[]= {'a','b','c','d','e','f','g'};
		String s2=new String(ar);
		System.out.println("s2= "+s2);
		
		String s3=new String(s2);
		if(s2==s3)
			System.out.println("s2 and s3 are equal references");
		if(s2.equals(s3))
			System.out.println("s2 and s3 have same contents");
		
//		System.out.println(s2+ " startsWith abc= "+s2.startsWith("abc"));
//		System.out.println(s2+ " endsWith efg= "+s2.endsWith("efg"));
		
		
	}

}
