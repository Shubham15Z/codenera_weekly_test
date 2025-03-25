/*
5. Implement a program that uses the super keyword to call both a superclass method and a constructor from the subclass.
 */

package wt.feb22.pkg;

class Base5
{
	Base5()
	{
		System.out.println("Base Constructor..");
	}
	
	void show()
	{
		System.out.println("Base show() method..");
	}
}

class Child5 extends Base5
{
	public Child5() 
	{
		super();
	}
	
	void show()
	{
		super.show();
	}
}

public class Question5 
{
	public static void main(String[] args) {
		Base5 ob = new Child5();
		ob.show();
	}
}
