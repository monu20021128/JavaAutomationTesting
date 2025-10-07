package Day13;

import java.util.HashSet;

public class HashSetDemo 
{

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("Monu");
		hs.add("Meet");
		hs.add("Bala");
		hs.add("Prem");
		
		HashSet<Integer> hs2=new HashSet();
		hs2.add(101);
		hs2.add(102);
		hs2.add(103);
		hs2.add(104);
		
		System.out.println("1st HashSet is: "+hs);
		System.out.println("2nd HashSet is: "+hs2);
		
		hs.addAll(hs2);
		System.out.println(hs);
		
//		hs.removeAll(hs2);
//		System.out.println(hs);
		
		System.out.println("Size of Combined HashSet is: "+hs.size());
		
		System.out.println(hs.contains(101)); //True
		System.out.println(hs.contains(50)); //False
		
		System.out.println(hs2.isEmpty());
//		System.out.println();
		
		Object[] arr=hs.toArray();
		System.out.println(arr.length);
			
		
		
		
	}

}
