import java.util.HashSet;

class Employee implements Comparable<Employee>
{
 private String name;

public Employee(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "Employee [name=" + name + "]";
}

@Override
public int hashCode() {
 System.out.println("Hashcode value:"+name.hashCode());
 return name.hashCode();
}

@Override
public boolean equals(Object obj) {
Employee emp=(Employee)obj;
System.out.println("Equals working");
if(name.equals(emp.getName()))
		return true;
else
	return false;
		
}
}
public class HashcodeEx {

	public static void main(String[] args) {
    
		HashSet<Employee> hs=new HashSet<>();
		hs.add(new Employee("Aditya"));
		hs.add(new Employee("Aditya"));
		
		System.out.println(hs);
        System.out.println("AB".compareTo("BA"));

	}

}
