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

package wt.may25.pkg;

import java.util.HashMap;
import java.util.Map;

public class Question8 {
    public static void main(String[] args) 
    {
        String s = "socks";

        int maxDistance = maxCharsBetweenSameChars(s);
        System.out.println("Maximum number of characters between two same characters: " + maxDistance);
    }

    public static int maxCharsBetweenSameChars(String s) 
    {
        Map<Character, Integer> firstIndexMap = new HashMap<>();

        int maxDist = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!firstIndexMap.containsKey(c)) 
            {
                firstIndexMap.put(c, i);
            } 
            else 
            {
                int dist = i - firstIndexMap.get(c) - 1;
                if (dist > maxDist)
                {
                    maxDist = dist;
                }
            }
        }

        return maxDist == -1 ? 0 : maxDist;
    }
}

