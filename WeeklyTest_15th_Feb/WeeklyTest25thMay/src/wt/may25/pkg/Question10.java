/*
Q10. Roman to Integer
Input: `"IX"`
Output: `9`
 */

package wt.may25.pkg;

import java.util.HashMap;
import java.util.Map;

public class Question10 
{
    public static void main(String[] args) 
    {
        String roman = "IX";  
        int result = romanToInt(roman);
        System.out.println("Integer value of " + roman + " is: " + result);
    }

    public static int romanToInt(String s) 
    {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));

            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
            }

            prevValue = currValue;
        }

        return total;
    }
}

