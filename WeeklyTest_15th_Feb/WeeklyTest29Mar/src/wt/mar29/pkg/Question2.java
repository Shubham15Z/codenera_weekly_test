/*
2)Implement a program to find the first non-repeating character in a given string.
 */

package wt.mar29.pkg;

public class Question2 
{
	public static char firstNonRepChar(String s1)
	{
		for(int i = 0; i < s1.length(); i++)
		{
			char c1 = s1.charAt(i);
			boolean isRepeating = false;
			for(int j = 0; j < s1.length(); j++)
			{
				if(i!=j && c1 == s1.charAt(j))
				{
					isRepeating = true;
					break;
				}
			}
			
			if(!isRepeating)
			{
				return c1;
			}	
		}
		return '\0';

	}
	
	public static void main(String[] args) 
	{
		String s1 = "abcdab";
		
		char res = firstNonRepChar(s1);
		System.out.println("The first Non repeating character is : "+res);

	}
}
