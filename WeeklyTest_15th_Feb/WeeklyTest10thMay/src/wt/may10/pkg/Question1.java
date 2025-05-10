/*
1.  Find Common Characters  
    - Question: Find common characters in two strings using a HashMap.
    - Input: "hello", "world"
    - Output: ["o", "l"]
 */

package wt.may10.pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question1 
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		String s2 = "world";
		
		Map<Character, Integer> common = new HashMap<Character, Integer>();
		
		for(char ch : s1.toCharArray())
		{
			if(!common.containsKey(ch))
			{
				common.put(ch, 1);
			}
			else
			{
				common.put(ch, common.getOrDefault(ch, 0)+1);
			}
		}
		
		for(char ch : s2.toCharArray())
		{
			if(!common.containsKey(ch))
			{
				common.put(ch, 1);
			}
			else
			{
				common.put(ch, common.getOrDefault(ch, 0)+1);
			}
		}
		
		List<Character> l1 = new ArrayList<Character>();
		for(char ch : common.keySet())
		{
			if(common.get(ch) > 1)
			{
				l1.add(ch);
			}
		}
		
		System.out.println(common);
		System.out.println(l1);
	}
}
