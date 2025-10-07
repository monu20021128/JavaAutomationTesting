package practiceformock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class wordCount 
{
	public static void getWordCount(String str1) {
		Map<String,Integer> str2=new HashMap<String,Integer>();
		
		String str3[]=str1.split(" ");
		System.out.println("String Array is: "+Arrays.toString(str3));
		for(String s: str3) {
			if(str2.containsKey(s)) {
				str2.put(s, str2.get(s)+1);
			}
			else {
				str2.put(s, 1);
			}
		}
//		System.out.println("Given String contains: "+str2);
		
		Set<String> str4=str2.keySet();
		for(String s: str4) {
			if(str2.get(s)>0) {
				System.out.println(s+": "+str2.get(s));
			}
		}
	}
	public static void main(String[] args) {
		getWordCount("Welcome to java , java is good language");
	}
}
