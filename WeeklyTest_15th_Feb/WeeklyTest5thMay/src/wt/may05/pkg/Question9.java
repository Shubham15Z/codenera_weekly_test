/*
9.Longest Common Prefix
Input: `["flower","flow","flight"]`

Output: `"fl"`
 */

package wt.may05.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question9 
{
	public static String findLongestPrefix(List<String> l1)
	{
		if(l1 == null || l1.isEmpty())
			return "";
		
		Collections.sort(l1);
		
		String first = l1.getFirst();
		String last = l1.getLast();
		
		int i = 0;
		
		while(i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i))
		{
			i++;
		}
		
		return first.substring(0,i);
	}
	public static void main(String[] args) 
	{
		List<String> l1 = new ArrayList<String>(Arrays.asList("flower","flow","flight"));
		
		String res = findLongestPrefix(l1);
		
		System.out.println(res);
	}
}
