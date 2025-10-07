package Day12;

import java.util.Arrays;

public class Practice_Strings {

	public static void main(String[] args) 
	{
		
		//Question 5
		//Method 1
		/*String st="Welcome to Java Selenium";
		String arr[]=st.split(" ");
		System.out.println("Number of words in entered strings is: "+arr.length);
		*/
		
		//Method 2
		String st="Welcome to Java Selenium";
		System.out.println("Number of words in entered strings is: "+st.split(" ").length);
		
	}

}
