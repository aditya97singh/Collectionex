package CollectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"one");
		hm.put(2,"two");
		System.out.println(hm);
		
		Set<Integer> s=hm.keySet();
        Iterator<Integer> it=s.iterator();
        while(it.hasNext())
        {
        	Integer key=it.next();
        	System.out.println("Key ="+key);
        	System.out.println("Value ="+hm.get(key));
        }
        
        Set<Entry<Integer,String>> s2=hm.entrySet();
        Iterator<Entry<Integer,String>> it2=s2.iterator();
        while(it2.hasNext())
        {
        	Map.Entry me=it2.next();
        	System.out.println(me.getKey());
        	System.out.println(me.getValue());
        }
	}

}
