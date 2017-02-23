import java.util.HashSet;
strictfp interface A{}
class Employee implements Comparable//<Employee>
{
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	
	public int hashCode()
	{
		System.out.println("hashcode"+name.hashCode());
		return name.hashCode();
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("equals");
		Employee emp = (Employee) obj;
		if(name.equals(emp.name))
		{
			return true;
		}
		
		return false;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class HashCodeExample {
	
	public static void main(String[] args) {
		HashSet<Employee> hs=new HashSet<>();
		
		hs.add(new Employee("AB"));
		hs.add(new Employee("BA"));
		
		System.out.println(hs);
		
	}

}
