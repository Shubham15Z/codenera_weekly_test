/*
4. Take a sentence as a String input, and find anagrams in the string.
   for eg "peek up the call and keep the roses "
           anagram strings : peek keep
 */

package wt.may05.pkg;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Question4 
{
	public static boolean checkAnagram(String s1, String s2)
	{
		if(s1.length() != s2.length())
			return false;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}
	
	public static void findAnagram(String s)
	{
		String[] words = s.split("\\s+");
		
		Set<String> printed = new HashSet<String>();
		
		System.out.println("Anagaram strings : ");
		
		for(int i = 0; i < words.length; i++)
		{
			for(int j = i+1; j < words.length; j++)
			{
				if(!words[i].equals(words[j]) && checkAnagram(words[i], words[j]))
				{
					if(!printed.contains(words[i]) && !printed.contains(words[j]))
					{
						System.out.println(words[i] + " " + words[j]);
						printed.add(words[i]);
						printed.add(words[j]);
					}
				}
			}
		}
	}
	public static void main(String[] args)
	{
		String sentence = "peek up the call and keep the roses";
		findAnagram(sentence);
	}
}
