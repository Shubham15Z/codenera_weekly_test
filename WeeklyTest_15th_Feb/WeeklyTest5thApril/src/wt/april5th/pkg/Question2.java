/*

Write a Java program that handles multiple exceptions. The program should:

Take two numbers as input from the user.

Perform division and handle ArithmeticException if division by zero occurs.

Handle NumberFormatException if the input is not a valid number.

Display appropriate error messages for each exception.

 */


package wt.april5th.pkg;

import java.util.Scanner;

class MyExceptionHandler
{
	public void printNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number :");
		String s1 = sc.nextLine();
		System.out.println("Enter second number :");
		String s2 = sc.nextLine();
		
		try
		{
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			float res = n1/n2;
			System.out.println("The given numbers are : "+s1+" and "+s2);
			System.out.println("The division is : "+res);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please check the number you have entered...");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Number is not divisible by zero(0)...");
		}
	}
	
}

public class Question2 
{
	public static void main(String[] args) 
	{
		MyExceptionHandler m1 = new MyExceptionHandler();
		m1.printNumber();
	}
}
