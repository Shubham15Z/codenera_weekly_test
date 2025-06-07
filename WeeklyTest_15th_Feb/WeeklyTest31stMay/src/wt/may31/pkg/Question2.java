/*
2.Create a program to group a list of employees by their department and count the number of employees in each department.
 */

package wt.may31.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee
{
	private int id;
	private String name;
	private String department;
	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		return "\nid=" + id + ", name=" + name + ", department=" + department;
	}
	
	
}
public class Question2 
{
	
	public static void main(String[] args) 
	{
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(new Employee(101, "Ajay Verma", "Engineering"));
		list1.add(new Employee(102, "Vishal Roy", "HR"));
		list1.add(new Employee(103, "Mayur Sharma", "Accounts"));
		list1.add(new Employee(104, "Pooja Dev", "Engineering"));
		list1.add(new Employee(105, "Kirti More", "HR"));
		list1.add(new Employee(106, "Rahul Sing", "Engineering"));
		
//		System.out.println(list1);
		
		Map<String, Long> group =  list1.stream().collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));
		
		System.out.println(group);
	}
}
