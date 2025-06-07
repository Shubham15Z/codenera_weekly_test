/*
3. CamelCase Pattern Matching


Input: arr[] = [ “WelcomeGeek”, “WelcomeToGeeksForGeeks”, “GeeksForGeeks” ], pattern = “WTG” 
Output: WelcomeToGeeksForGeeks 
Explanation: 
There is only one abbreviation for the given pattern i.e., WelcomeToGeeksForGeeks.


Input: arr[] = [ “Hi”, “Hello”, “HelloWorld”, “HiTech”, “HiGeek”, “HiTechWorld”, “HiTechCity”, “HiTechLab” ], pattern = “HA” 
Output: No match found 
Explanation: 
There is no such abbreviation for the given pattern.
 */

package wt.may25.pkg;

public class Question3 {

    public static void main(String[] args) {
        String[] arr1 = {"WelcomeGeek", "WelcomeToGeeksForGeeks", "GeeksForGeeks"};
        String pattern1 = "WTG";
        System.out.println("Matches for pattern \"" + pattern1 + "\":");
        findMatches(arr1, pattern1);

        System.out.println();

        String[] arr2 = {"Hi", "Hello", "HelloWorld", "HiTech", "HiGeek", "HiTechWorld", "HiTechCity", "HiTechLab"};
        String pattern2 = "HA";
        System.out.println("Matches for pattern \"" + pattern2 + "\":");
        findMatches(arr2, pattern2);
    }

    static void findMatches(String[] arr, String pattern) {
        boolean found = false;

        for (String word : arr) {
            if (matchesPattern(word, pattern)) {
                System.out.println(word);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No match found");
        }
    }

    static boolean matchesPattern(String word, String pattern) {
        int pIndex = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                if (pIndex < pattern.length() && ch == pattern.charAt(pIndex)) {
                    pIndex++;
                } else if (pIndex >= pattern.length()) {
                    continue;
                } else if (ch != pattern.charAt(pIndex)) {
                    return false;
                }
            }
        }

        return pIndex == pattern.length(); 
    }
}
