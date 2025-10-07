package Day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> Al1=new ArrayList<Integer>(List.of(10,20,30,40,50,60));
		System.out.println("List 1 Before : "+Al1);
		ArrayList<Integer> Al2=new ArrayList<Integer>(List.of(70,80,90,100));
//		System.out.println("List 2 Before : "+Al2);
		
//		ArrayList ms=new ArrayList(List.of(10,20,"hello",5.5,true));
		
//		Al1.add(200);
//		Al2.add(600);
//		System.out.println(Al1);
//		System.out.println(Al2);
		
		Al1.add(3, 200);
		System.out.println("List 1 After: "+Al1);
		System.out.println(Al1.indexOf(50));
		
//		Al1.addAll(Al2);
		Al1.addAll(2, Al2);
		System.out.println(Al1);
		
//		Al1.retainAll(Al2);
//		System.out.println(Al1);
		
		System.out.println(Al1.get(5));
		
//		Al1.set(5, 800);
//		System.out.println(Al1);
		
//		System.out.println(Al1.indexOf(50));
		Al1.add(20);
		System.out.println(Al1);
		System.out.println(Al1.lastIndexOf(20));
		
//		Al2.clear();
//		System.out.println("After clearing Al2 is: "+Al2);
		
//		System.out.println(Al2.isEmpty());
		
		/*Iterator<Integer> it= Al1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		
		
		
		
	}
}
