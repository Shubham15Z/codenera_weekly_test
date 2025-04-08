/*
5)Implement a custom exception InsufficientBalanceException, which should be thrown when a withdrawal amount is 
greater than the account balance.
 */
package wt.mar29.pkg;

import java.util.Scanner;

class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

public class Question5 
{
	public static void checkBalance(double balance, double amount) throws InsufficientBalanceException
	{
		if(amount > balance)
		{
			throw new InsufficientBalanceException("Please check your withdraw amount...");
		}
		else
			System.out.println("Withdraw amount is valid...");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a your balance : ");
		double balance = sc.nextDouble();
		
		System.out.println("Enter a withdraw amount : ");
		double amount = sc.nextDouble();
		
		try
		{
			checkBalance(balance, amount);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}

