/*
6. Write a program to check if a given string is a pangram or not. 
A pangram is a sentence that contains every letter of the alphabet at least once.
 */

package wt.may05.pkg;

import java.util.HashSet;
import java.util.Set;

public class Question6 
{
	public static boolean checkPanagram(String s)
	{
		char[] c1 = s.toLowerCase().toCharArray();
		
		Set<Character> letters = new HashSet<Character>();
		
		for(char ch : c1)
		{
			if(ch >= 'a' && ch <= 'z')
			{
				letters.add(ch);
			}	
		}
		
		if(letters.size() == 26)
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		String input = "The quick brown fox jumps over the lazy dog";
		
		if(checkPanagram(input))
		{
			System.out.println("The string is Panagram...");
		}
		else
		{
			System.out.println("The string is not Panagram....");
		}
	}
}
