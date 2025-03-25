/*
6. Create a Java program where static blocks are executed before the main method and demonstrate 
their order of execution. 
 */

package wt.feb22.pkg;

public class Question6 
{
	Question6()
	{
		System.out.println("This is constructor");
	}
	
	static 
	{
		System.out.println("This is static block 1");
	}
	
	static 
	{
		System.out.println("This is static block 2");
		Question6 ob = new Question6();
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Main method");
		
	}
	
	static 
	{
		System.out.println("This is static block 3");
	}
	{
		System.out.println("This is instance block");
	}
}
