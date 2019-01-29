package CollectionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraylistex {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<>();
		LinkedList<Integer> k=new LinkedList<>();
		
		l.add(1);
		l.add(1,2); // to add at index 1....dynamically done
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
