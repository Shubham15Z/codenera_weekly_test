/*
 7. Create a class Student with two constructors – one without parameters and another with name and age. 
 Use the this keyword to call one constructor from another.  
 */

package wt.feb15.pkg;

class Student
{
	Student()
	{
		this("ajay", 10);
		System.out.println("No para constructor");
	}
	
	Student(String name, int age)
	{
//		this();
		System.out.println("Para Constructor");
	}
}

public class Question7 {
	public static void main(String[] args) {
		Student st = new Student();
	}
}
