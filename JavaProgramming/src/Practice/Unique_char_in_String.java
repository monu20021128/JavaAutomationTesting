package Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique_char_in_String 
{

	public static void main(String[] args) 
	{
		//Method 1
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		String unique="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(str.indexOf(c)==str.lastIndexOf(c)) 
			{
				unique+=c;
			}
			
		}
		System.out.println(unique);
		*/
		
		
		//Method 2
		
		HashSet<Character> hs=new HashSet();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str1=sc.nextLine();
		
		String tempstr=str1.toLowerCase();
		
		for(char ch:tempstr.toCharArray())
		{
			hs.add(ch);
		}
		System.out.println("Unique characters in "+str1+" are: "+hs);	
	}
	
}