/*
 7. Write a program that demonstrates how a static variable is shared across multiple objects and 
 how it differs from an instance variable. 
 */

package wt.feb22.pkg;

class Counter
{
	int x=0;
	static int y=0;
	
	Counter()
	{
		x++;
		y++;
	}
	
	void display()
	{
		System.out.println("Instance variable :"+x);
		System.out.println("Static variable : "+y);
	}
}

public class Question7
{
	public static void main(String[] args) {
		Counter ob = new Counter();
		ob.display();
		System.out.println("---------------------");
		Counter ob1 = new Counter();
		ob1.display();
		System.out.println("---------------------");
		Counter ob2 = new Counter();
		ob2.display();
	}
	
}
