/*
5. Given two strings, write a function to check if one is an anagram of the other.
 */

package wt.april26.pkg;

import java.util.Arrays;

public class Question2 
{
	public void checkAnagram()
	{
		String s1 = "ajay";
		String s2 = "jaya";
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("Strings are not Anagram...");
		}
	}
	
	public static void main(String[] args) 
	{
		Question2 q2 = new Question2();
		q2.checkAnagram();
	}
}
