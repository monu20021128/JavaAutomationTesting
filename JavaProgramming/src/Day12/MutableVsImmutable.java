package Day12;

import java.util.Arrays;

public class MutableVsImmutable 
{

	public static void main(String[] args) 
	{
		//Mutable---can change
		/* int a[]= {20,90,40,70,60,10};
		System.out.print("Before Sorting: ");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);									//Mutable 
		System.out.print("After Sorting: ");
		System.out.println(Arrays.toString(a));
		*/
		
		//Immutable---can not change
		String s="Welcome";
		System.out.print("Before Concatinating: ");
		System.out.println(s);
		
		s.concat(" to Java");							//Immutable
		System.out.print("After Concatinating: ");
		System.out.println(s);
		
	}

}
