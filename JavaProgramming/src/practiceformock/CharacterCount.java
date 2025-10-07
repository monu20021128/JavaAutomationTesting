package practiceformock;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class CharacterCount 
{
	public static void getCharCount(String str)
	{
		Map<Character,Integer> charMap=new HashMap<Character,Integer>();
		
		char ch[]=str.toCharArray();
		for(char c: ch)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c, 1);
			}
		}
//		System.out.println("String "+str+" contains: "+charMap);
		
		Set<Character> char1=charMap.keySet();
		for(char c: char1) {
			if(charMap.get(c)>0) {
				System.out.println(c+": "+charMap.get(c));
			}
		}
	}
	public static void main(String[] args) 
	{
		getCharCount("Monu Sahu");
	}
}
