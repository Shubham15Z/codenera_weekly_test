/*
Implement a program that shows how this keyword is used to differentiate between local and instance variables 
with the same name.
 */

package wt.feb22.pkg;

class Student1
{
	String name;
	int age;
	
	Student1(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void studentDetails()
	{
		System.out.println("Student Details are :"+name+" "+age);
	}
}

public class Question8 
{
	public static void main(String[] args) {
		Student1 s1 = new Student1("Rahul Sharma", 25);
		Student1 s2 = new Student1("Manoj Roy",38);
		s1.studentDetails();
		s2.studentDetails();
	}
}
