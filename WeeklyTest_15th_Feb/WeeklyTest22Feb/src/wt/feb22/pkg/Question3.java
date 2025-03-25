/*
3. Create a program that shows how static methods are inherited in Java and 
how method hiding works with static methods.
 */

package wt.feb22.pkg;

class Base3
{
	static void show()
	{
		System.out.println("Static show() method from Base");
	}
}

class Child3 extends Base3
{
	static void show()
	{
		System.out.println("Static show() method from child");
	}
}
public class Question3 
{
	public static void main(String[] args) 
	{
		Base3 ob1 = new Base3();
		ob1.show();
		Base3 ob2 = new Child3();
		ob2.show();
		Child3 ob3 = new Child3();
		ob3.show();
	}
}
