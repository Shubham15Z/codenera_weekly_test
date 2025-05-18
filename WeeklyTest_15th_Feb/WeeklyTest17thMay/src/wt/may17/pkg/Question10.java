/*
Q10.Design a custom functional interface named MathOperation with a method that takes two integers and 
performs a specific mathematical operation (e.g., addition, subtraction). 
Use this interface with a lambda expression to perform addition on two given integers.
 */

package wt.may17.pkg;

@FunctionalInterface
interface MathOperation
{
	public int calculate(int a, int b);
}

public class Question10
{
	public static void main(String[] args)
	{
		MathOperation addition = (a,b) -> a+b;
		int res = addition.calculate(10, 30);
		System.out.println("Addition is :"+res);
	}
}
