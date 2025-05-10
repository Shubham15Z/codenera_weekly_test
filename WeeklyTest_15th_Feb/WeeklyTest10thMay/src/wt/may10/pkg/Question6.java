/*
Q6. Calculate the frequency of each word in the given string using HashMap.
 */

package wt.may10.pkg;

import java.util.HashMap;
import java.util.Map;

public class Question6
{
	public static void main(String[] args) 
	{
		String input = "this is a test this is only a test";

        String[] words = input.split(" ");

        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : words) 
        {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        
        System.out.println(freqMap);
	}
}
