package Day14;

import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {

	public static void main(String[] args) 
	{
		LinkedList Ls=new LinkedList(List.of("Monu",20,true,50));
		
		System.out.println(Ls);
		
		Ls.add("Sahu");
		Ls.addFirst("Kumar");
		System.out.println(Ls);
		Ls.addFirst(new Integer(20));
		System.out.println(Ls);
		Ls.addLast(new Integer(30));
		System.out.println(Ls);
		
		System.out.println(Ls.getFirst());
		System.out.println(Ls.getLast());
		
		Ls.removeFirst();
		Ls.removeLast();
		System.out.println(Ls);
		
		Ls.add("Hello");
		System.out.println(Ls);
		System.out.println(Ls.indexOf(50));
		
	}

}
