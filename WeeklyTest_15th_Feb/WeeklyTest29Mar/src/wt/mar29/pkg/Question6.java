/*
 
6)Write a program that defines a custom exception NegativeNumberException and throws it if the user enters a 
negative number.
 */

package wt.mar29.pkg;

import java.util.Scanner;

class NegativeNumberException extends Exception
{
	public NegativeNumberException(String message) {
		super(message);
	}
}


public class Question6 
{
	public static void checkNumber(int num) throws NegativeNumberException
	{
		if(num < 0)
		{
			throw new NegativeNumberException("Please enter number greater than zero (0)...");
		}
		else
			System.out.println("Valid number...");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		try {
			checkNumber(num);
		} catch (NegativeNumberException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}

