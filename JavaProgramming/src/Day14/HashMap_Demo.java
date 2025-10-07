package Day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Demo {

	private static final int Object = 0;

	public static void main(String[] args) 
	{
		HashMap Hm=new HashMap();
		
		Hm.put(11, "Monu");
		Hm.put(12, "Sahu");
		Hm.put("Ward no", 2);
		Hm.put("City", "Nagpur");
		System.out.println(Hm);
		
		Hm.remove(12);
		System.out.println(Hm);
		
		System.out.println(Hm.keySet());
		System.out.println(Hm.values());
		System.out.println(Hm.entrySet());
		
		Hm.put("Country", "India");
		System.out.println(Hm.entrySet());
		
//		System.out.println(Hm.get(11));
		
//		System.out.println(Hm.containsKey("City"));
//		System.out.println(Hm.containsValue("Monu"));
		
//		Hm.clear();
//		System.out.println(Hm.isEmpty());
		
		/*for(Object X:Hm.keySet())
		{
			System.out.println(X+"   "+Hm.get(X));
			System.out.println(Hm.get(X));
		}*/
		
		Iterator it=Hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry entry=(Entry) it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
