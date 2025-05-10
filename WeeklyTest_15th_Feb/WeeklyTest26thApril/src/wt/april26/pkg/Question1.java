/*
4. Write a function to check if a given string is a palindrome, ignoring case and non-alphanumeric characters.
 */

package wt.april26.pkg;

import java.util.Scanner;

public class Question1 
{
	public void checkPalindrome(String s1)
	{
		String s2 = "";
		char[] c1 = s1.toCharArray();
		for(int i = s1.length()-1; i >= 0; i--)
		{
			s2 = s2 + c1[i];
		}
		
		if(s1.equals(s2))
		{
			System.out.println("String is palindrome...");
		}
		else
		{
			System.out.println("String is not palindrome...");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string...");
		String s1 = sc.nextLine();
		
		Question1 q1 = new Question1();
		q1.checkPalindrome(s1);
	}
}
