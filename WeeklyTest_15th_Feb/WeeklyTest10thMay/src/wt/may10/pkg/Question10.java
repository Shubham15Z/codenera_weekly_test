/*
Q10.Given an array of words, print all anagrams together.


Input : {“cat”, “dog”, “tac”, “god”, “act”}


Output : {“cat”, “tac”, “act”, ‘”dog”, “god”}
 */

package wt.may10.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question10 
{
    public static void printAnagrams(String[] words)
    {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) 
        {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!anagramMap.containsKey(sortedWord))
            {
                anagramMap.put(sortedWord, new ArrayList<>());
            }
            
            anagramMap.get(sortedWord).add(word);
        }

        for (List<String> group : anagramMap.values()) {
            for (String word : group) {
                System.out.print(word + " ");
            }
        }
    }
	public static void main(String[] args) 
	{
		String[] words = {"cat", "dog", "tac", "god", "act"};
		
		printAnagrams(words);
	}
}
