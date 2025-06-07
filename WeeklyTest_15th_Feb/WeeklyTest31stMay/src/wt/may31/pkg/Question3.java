/*
3. Using Stream API, sort a list of custom objects (e.g., students) based on their grades in descending order.
 */
package wt.may31.pkg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	private int rollno;
	private String name;
	private String grade;
	public Student(int rollno, String name, String grade) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.grade = grade;
	}
	
	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "\nrollno=" + rollno + ", name=" + name + ", grade=" + grade;
	}
}

class SortStudentByGrade implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getGrade().compareTo(o1.getGrade());
	}
	
}
public class Question3 
{
	public static void main(String[] args)
	{
		List<Student> list1 = new ArrayList<Student>();
		
		list1.add(new Student(501, "Ram", "C"));
		list1.add(new Student(502, "Mayur", "A"));
		list1.add(new Student(503, "Pooja", "B"));
		list1.add(new Student(504, "Vishal", "D"));
		list1.add(new Student(505, "Kirti", "C"));
		list1.add(new Student(506, "Ajay", "A"));
		list1.add(new Student(507, "Nilesh", "B"));
		
//		list1.sort(new SortStudentByGrade());
//		System.out.println(list1);
		
		List<Student> l2 = list1.stream().sorted( (s1,s2) -> s2.getGrade().compareTo(s1.getGrade())).collect(Collectors.toList());
		System.out.println(l2);
		
	}
}
