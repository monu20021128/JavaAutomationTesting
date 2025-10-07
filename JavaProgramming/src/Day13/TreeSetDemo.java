package Day13;

import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet(List.of(400,600,800,900));
		ts.add(120);
		ts.add(10);
		ts.add(90);
		ts.add(50);
		ts.add(60);
		ts.add(80);
		ts.add(100);
		
		System.out.println("All elements in TreeSet are: "+ts);
		System.out.println(ts.first()); //Returns the first (lowest) element currently in this set.
		System.out.println(ts.getFirst()); //Gets the first element of this collection.
		System.out.println(ts.getLast());  //Gets the last element of this collection.
//		System.out.println(ts.descendingSet()); //Returns a reverse order view of the elements contained in this set. 
		System.out.println(ts.ceiling(12));//50
		System.out.println(ts.floor(45)); //10	
	}
}
