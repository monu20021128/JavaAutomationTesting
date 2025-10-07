package Day13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import Arrays_Practice.Array;

public class HashSet_Demo 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> Hs=new HashSet<>(List.of(70,90,45));
		HashSet<Integer> Hs2=new HashSet<>(List.of(700,900,450));
		
		Hs.add(10);
		Hs.add(50);
		Hs.add(30);
		Hs.add(40);
		System.out.println(Hs);
		
		Hs.addAll(Hs2);
		System.out.println(Hs);
		     
//		System.out.println(Hs.containsAll(Hs2));
		
		Iterator<Integer> IT=Hs.iterator();
		System.out.print("HashSet is: ");
		while(IT.hasNext())
		{
			
			System.out.print(" "+IT.next());
		}
		System.out.println();
		
		
//		Hs.remove(45);
//		System.out.println(Hs);
		
//		Hs.retainAll(Hs2);
//		System.out.println(Hs);
		
//		System.out.println(Hs.size());
		
//		Hs.clear();
//		System.out.println("After clearing: "+Hs);
		
		/*System.out.println(Hs2);
		ArrayList Al=new ArrayList(Hs2);
		System.out.println(Al.get(2));
		*/
	
	}

}
