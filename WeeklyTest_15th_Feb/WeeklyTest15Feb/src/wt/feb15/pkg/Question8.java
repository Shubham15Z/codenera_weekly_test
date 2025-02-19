/*
 8. Create a base class Employee with a constructor initializing name and salary.
  Create a subclass Manager that calls the parent class constructor using super and adds an additional bonus attribute.
 */

package wt.feb15.pkg;


class Employee 
{
	String name;
	double salary;

 public Employee(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 public void display() {
     System.out.println("Name: " + name);
     System.out.println("Salary: $" + salary);
 }
 
}

class Manager extends Employee 
{
	double bonus;
	
	public Manager(String name, double salary, double bonus) 
	{
		super(name, salary);
		this.bonus = bonus; 
	}

 public void display() {
     super.display();
     System.out.println("Bonus: $" + bonus);
 }
 
}

public class Question8 {
	 public static void main(String[] args) 
	 {
	     Manager manager = new Manager("John", 60000, 10000);
	     manager.display();
	 }
}
