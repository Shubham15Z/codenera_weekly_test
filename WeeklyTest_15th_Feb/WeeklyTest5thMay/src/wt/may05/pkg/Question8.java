/*
8. 
 Check for Rotation
Input: `"waterbottle"
,
"erbottlewat"`


Output: `true`
 */

package wt.may05.pkg;

import java.util.Arrays;

public class Question8 
{
	public static boolean checkRotation1(String s, String rotate)
	{
		if(s.length() != rotate.length())
			return false;
		
		char[] ch = s.toCharArray();
		for(int j = 0; j < s.length(); j++)
		{
			char temp = ch[0];
			for(int i = 0; i < ch.length-1; i++)
			{
				ch[i] = ch[i+1];
			}
			ch[ch.length-1] = temp;
			String s2 = new String(ch);
			if(s2.equals(rotate))
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkRotation2(String s1, String s2)
	{
		if(s1.length() != s2.length())
			return false;
		
		String s3 = s1+s2;
		
		return s3.contains(s2);
	}
	public static void main(String[] args) 
	{
		String input = "waterbottle";
		String rotate = "erbottlewat";
		
		if(checkRotation1(input, rotate))
			System.out.println("true");
		else
			System.out.println("False");
		
		if(checkRotation2(input, rotate))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
