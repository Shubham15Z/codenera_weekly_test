/*
5.  String Compression

Input: `"aaabbccc"`
Output: `"a3b2c3"`
 */

package wt.may25.pkg;

public class Question5 {
    public static void main(String[] args) {
        String input = "aaabbccc";
        String compressed = compressString(input);
        System.out.println("Compressed String: " + compressed);
    }

    public static String compressString(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        result.append(str.charAt(str.length() - 1)).append(count);

        return result.toString();
    }
}

