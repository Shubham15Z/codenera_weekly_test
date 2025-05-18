/*
Q3.Implement a recursive function to calculate the factorial of a non-negative integer.
 */

package wt.may17.pkg;

public class Question3 
{
	public static int findFactorial(int n)
	{
		if(n < 0)
			throw new IllegalArgumentException("Input must be a non-negative integer");
		
		if(n == 0 || n == 1)
			return 1;
		
		return n * findFactorial(n-1);
	}
	
	public static void main(String[] args)
	{
		int num = 6;
		int result = findFactorial(num);
		System.out.println("Factorial of "+num+" is : "+result);
	}
}
