package CollectionEx;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistex {

	public static void main(String[] args) {
	
		LinkedList<Integer> l=new LinkedList<>();
		LinkedList<Integer> k=new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(null);
		l.add(null);
		l.add(2);
		System.out.println(l);
    
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i)); //to get the element at index
		}
		for(Integer i:l)
		{
			System.out.println(i); //same as above
		}
		Iterator<Integer> it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Iterator<Integer> listit=l.iterator();
		while(listit.hasNext())
		{
			System.out.println(listit.next());
		}
		k.addAll(l);
		System.out.println(k);
	}

}
