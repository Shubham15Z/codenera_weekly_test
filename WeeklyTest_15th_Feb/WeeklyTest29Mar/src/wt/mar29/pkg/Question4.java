/*
4)Create a custom exception InvalidAgeException and write a program that throws this exception if age is less than 18.
 */

package wt.mar29.pkg;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

public class Question4 
{
	public static void checkAge(int age) throws InvalidAgeException
	{
		if(age < 18)
		{
			throw new InvalidAgeException("You are under 18");
		}
		else
		{
			System.out.println("Your age is Valid...");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}
