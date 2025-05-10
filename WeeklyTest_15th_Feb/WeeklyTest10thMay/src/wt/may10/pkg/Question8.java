/*
Q8. Maximum number of characters between any two same character
Given a string containing lower and uppercase alphabets, the task is to find the maximum
number of characters between any two same characters in the string.
Example 1:
Input:
S = "socks"
Output: 3
Explanation: There are 3 characters between
the two occurrences of 's'.
 */

package wt.may10.pkg;

import java.util.HashMap;

public class Question8 
{
	public static int maxCharsBetweenSame(String s)
	{
		HashMap<Character,Integer> m1 = new HashMap<Character, Integer>();
		
		int maxChars = -1;
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(m1.containsKey(ch))
			{
				int firstIndex = m1.get(ch);
				int distance = i - firstIndex - 1;
				maxChars = Math.max(maxChars, distance);
			}
			else
			{
				m1.put(ch, i);
			}
		}
		
		return maxChars;
	}
	public static void main(String[] args) 
	{
		String S = "socks";
		int res = maxCharsBetweenSame(S);
		System.out.println(res);
	}
}
