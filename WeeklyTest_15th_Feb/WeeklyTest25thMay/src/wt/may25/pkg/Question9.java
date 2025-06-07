/*
Q9.Create a recursive function to check the given String is palindrome or not.
 */

package wt.may25.pkg;

public class Question9 {
    public static void main(String[] args) 
    {
        String str = "madam";
        
        if (isPalindrome(str, 0, str.length() - 1)) 
        {
            System.out.println(str + " is a palindrome.");
        } 
        else
        {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right)
        {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindrome(s, left + 1, right - 1);
    }
}

