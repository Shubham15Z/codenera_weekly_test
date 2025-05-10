/*
 2.
Find the minimum distance between the given two words


Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 = “fox”
Output: 3
Explanation: Minimum distance between the words “the” and “fox” is 3


Input: S = {“geeks”, “for”, “geeks”, “contribute”,  “practice”}, word1 = “geeks”, word2 = “practice”
Output: 2
Explanation: Minimum distance between the words “geeks” and “practice” is 2

 */

package wt.may10.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 
{
	public static void main(String[] args) 
	{
//		List<String> S = new ArrayList<String>(Arrays.asList("the","quick","brown","fox","quick"));
		List<String> S = new ArrayList<String>(Arrays.asList("geeks", "for", "geeks", "contribute",  "practice"));
//		String word1 = "the"; 
//		String word2 = "fox";
		
		String word1 = "geeks";
		String word2 = "practice";
		
		int minDistance = Integer.MAX_VALUE;
		
		int index1 = -1;
		int index2 = -1;
		
		for(int i = 0; i < S.size(); i++)
		{
			String currentWord = S.get(i);
			
			if(currentWord.equals(word1))
			{
				index1 = i;
			}
			else if(currentWord.equals(word2))
			{
				index2 = i;
			}
			
			if(index1 != -1 && index2 != -1)
			{
				int distance = Math.abs(index1 - index2);
				minDistance = Math.min(minDistance, distance);
			}
		}
		
		System.out.println("Minimum Distance is : "+minDistance);
		

	}
}
