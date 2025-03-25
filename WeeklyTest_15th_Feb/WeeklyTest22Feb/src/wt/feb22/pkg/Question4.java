/*
 4. Write a program where a class contains both instance and static variables, and demonstrate 
 how they are accessed using the this and class name.  
 */

package wt.feb22.pkg;

class Demo4
{
	int num = 10;
	static int age = 20;
	
	void show()
	{
		System.out.println("Instance variable : "+this.num);
		System.out.println("Static variable : "+Demo4.age);
		System.out.println("-----------------------------");
	}
	
	static void display()
	{
//		System.out.println("Instance variable : "+this.num);
		System.out.println("Static variable : "+Demo4.age);
	}
	
	
	
}

public class Question4 
{
	public static void main(String[] args)
	{
		Demo4 ob = new Demo4();
		ob.show();
		ob.display();
		System.out.println("-----------------------------");
		Demo4.display();
	}
}
