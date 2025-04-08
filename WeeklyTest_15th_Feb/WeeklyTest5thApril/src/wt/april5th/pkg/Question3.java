/*
3. String Coding – Palindrome Check:
Write a Java program to check if a string is a palindrome (i.e., the string reads the same forwards and backwards). 
Ignore spaces, punctuation, and case sensitivity.
 */

package wt.april5th.pkg;

import java.util.Scanner;

class StringPalindrome
{
	private String text;
	
	public StringPalindrome(String text)
	{
		this.text = text;
	}
	
	public void checkPalindrome()
	{
		String result = processString(text);
		
		if(isPalindrome(result))
		{
			System.out.println(text+" is palindrome...");
		}
		else
		{
			System.out.println(text+" is not palindrome...");
		}
	}
	
	private String processString(String text)
	{
		return text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	}
	
	public boolean isPalindrome(String result)
	{
		int left = 0, right = result.length()-1;
		
		while(left < right)
		{
			if(result.charAt(left) != result.charAt(right))
			{
				return false;
			}
			left++; 
			right--;
		}
		return true;
	}
	
	
}

public class Question3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check palindrome : ");
		String s1 = sc.nextLine();
		
		StringPalindrome sp1 = new StringPalindrome(s1);
		
		sp1.checkPalindrome();
		
	}
}
