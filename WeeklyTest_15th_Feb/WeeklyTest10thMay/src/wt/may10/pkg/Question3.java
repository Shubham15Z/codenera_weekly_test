/*
3. First Non-Repeating Character  
    - Question: Find the first non-repeating character in a string using a HashMap.
    - Input: "swiss"
    - Output: "w"
 */

package wt.may10.pkg;

import java.util.HashMap;
import java.util.Map;

public class Question3
{
	public static void main(String[] args)
	{
		String s1 = "swiss";
		
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		
		for(char ch : s1.toCharArray())
		{
			m1.put(ch, m1.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(m1);
		
		for(char ch : s1.toCharArray())
		{
			if(m1.get(ch) == 1)
			{
				System.out.println(ch);
				return;
			}
		}
	}
}
