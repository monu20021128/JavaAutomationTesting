package Day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "Monu");
		hm.put(102, "Meet");
		hm.put(103, "Prem");
		hm.put(104, "Raj");
		hm.put(105, "Guru");
		
		System.out.println("HashMap is: "+hm.entrySet()); //[101=Monu, 102=Meet, 103=Prem, 104=Raj, 105=Guru]
		System.out.println("Keys are: "+hm.keySet());
		System.out.println("Values are: "+hm.values());
		
		
//		hm.remove(105);
//		System.out.println(hm);  //{101=Monu, 102=Meet, 103=Prem, 104=Raj}
	
//		System.out.println(hm.get(103));  //Prem
		
//		System.out.println("Size is: "+hm.size());
		
		/*for(int st: hm.keySet())
		{
			System.out.println("Student roll no is "+st+" and name is "+hm.get(st));
		}*/
		
		
		//Approach 1 using iterator
		/*Iterator<Integer> it=hm.keySet().iterator();
		while(it.hasNext())
		{
			int roll_no=it.next();
			System.out.print("Roll no "+roll_no);
			String name=hm.get(roll_no);
			System.out.print(" Name is: "+name);	
			System.out.println();
		}*/
		
		//Approach 2 using iterator
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,String> entry=it.next();
			System.out.print("Roll no "+entry.getKey());
			System.out.print(" Name "+entry.getValue());	
			System.out.println();
		}
		
	}

}
