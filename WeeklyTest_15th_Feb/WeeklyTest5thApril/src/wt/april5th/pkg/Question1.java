/*
Write a Java class Student that has properties: name, age, and grade. Create a method display() 
that prints the student's details. Instantiate an object of the class and display the information.
 */

package wt.april5th.pkg;

class Student
{
	private String name;
	private int age;
	private String grade;

	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public void display()
	{
		System.out.println("Student details are : name = "+name+", age = "+age+", Grade = "+grade);
	}
	
}
public class Question1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Ajay Sharma", 18, "A");
		s1.display();
	}
}
