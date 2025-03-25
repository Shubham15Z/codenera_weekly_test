/*
2. Implement a class hierarchy where a subclass calls the superclass constructor using the super keyword and 
displays constructor execution order. 
 */

package wt.feb22.pkg;

class Parent
{
	public Parent() 
	{
		System.out.println("Parent constructor");
	}
}

class Child extends Parent
{
	public Child() 
	{
		super();
		System.out.println("Child Constructor");
	}
}

public class Question2 
{
	public static void main(String[] args) 
	{
		Parent p1 = new Child();
		
		
	}
}
