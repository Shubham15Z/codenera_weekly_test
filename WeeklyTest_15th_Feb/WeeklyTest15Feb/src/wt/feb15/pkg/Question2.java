/*
2. Create a class Person with a default constructor and a parameterized constructor that takes name and age. 
Create two objects using both constructors and display their details. 
 */

package wt.feb15.pkg;

class Person
{
	String name;
	int age;
	Person()
	{
		this.name = "Rahul";
		this.age = 20;
		
	}
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void display()
	{
		System.out.println("The person details are : name = "+name+" age = "+age);
	}
}

public class Question2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.display();
		Person p2 = new Person("Ajay",29);
		p2.display();
	}
	
}
