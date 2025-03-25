/*
 9. Create a class with a method that returns the current class instance using this keyword and use it to call 
 another method. 
 */
package wt.feb22.pkg;


class Base9 
{
	Base9 getInstance()
	{
		System.out.println("Return current class instance");
		return this;
	}
	
	void display()
	{
		System.out.println("Display Method");
	}

}

public class Question9
{
	public static void main(String[] args) 
	{
		Base9 ob = new Base9();
		ob.getInstance().display();;
	}
}
