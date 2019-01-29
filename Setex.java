package ExceptionHandling;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set s=new HashSet();         //heterogeneous ....unordered
        s.add(1);
        s.add(4);
        s.add(6);
        s.add(8);
        s.add("Aditya");
        s.add("Shobhit");
        s.add("Alok");
        s.add('a');
        s.add('B');
        s.add('c');
        s.add(2);
        System.out.println(s);
        
        Set c=new LinkedHashSet();  //heterogeneous ....ordered by insertion
        c.add(1);
        c.add(7);
        c.add(8);
        c.add('B');
        c.add(2);
        c.add('A');
        System.out.println(c);
        
        Set<Integer> t=new TreeSet<>();   //homogeneous........ordered by sorting
        t.add(8);
        t.add(1);
        t.add(3);
        t.add(0);
        //t.add('B');
	    System.out.println(t);
	}
	

}
