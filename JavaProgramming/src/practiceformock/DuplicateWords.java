package practiceformock;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords 
{
	public static void getWordCount(String str)
	{
		Map <String,Integer> stringMap= new HashMap<String,Integer>();
		
		String str2[]=str.split(" ");
		for(String s: str2) {
			if(stringMap.containsKey(s))
			{
				stringMap.put(s, stringMap.get(s)+1);
			}
			else {
				stringMap.put(s, 1);
			}
		}
		Set<String> str3=stringMap.keySet();
		for(String s: str3)
		{
			if(stringMap.get(s)>1) {
				System.out.println(s+":"+stringMap.get(s));
			}
		}
		
	}
	public static void main(String[] args) 
	{
		getWordCount("Hello java How are you java Hello python you are best ");
	}

}
