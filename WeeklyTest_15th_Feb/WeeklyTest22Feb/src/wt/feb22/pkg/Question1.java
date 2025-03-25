/*
  Write a program demonstrating method overriding in Java to show runtime polymorphism using the four pillars of OOP.
 */

package wt.feb22.pkg;

abstract class Person
{
	private String name;
	private int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	abstract void showDetails();
}

class Student extends Person
{
	private int sid;
	private String course;
	
	Student(String name, int age, int sid, String course)
	{
		super(name, age);
		this.sid = sid;
		this.course = course;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public void showDetails()
	{
		System.out.println("Student Id : "+getSid());
		System.out.println("Student name : "+getName());
		System.out.println("Student age : "+getAge());
		System.out.println("Student course : "+getCourse());
	}
}

public class Question1 
{
	public static void main(String[] args) 
	{
		Person p1 = new Student("Rahul SHarma",26,70089,"Python");
		p1.showDetails();
	}
}
