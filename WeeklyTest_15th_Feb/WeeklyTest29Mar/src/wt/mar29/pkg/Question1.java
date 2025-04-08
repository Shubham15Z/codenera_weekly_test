/*
 1)Write a Java program to check if two given strings are rotations of each other.
 */
package wt.mar29.pkg;

public class Question1
{
	public static boolean areRotation(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		
		String temp = s1+s1;
		
		if(temp.contains(s2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		String s1 = "abcd";
		String s2 = "cdab";
		boolean res = areRotation(s1, s2);
		if(res)
		{
			System.out.println("String are rotation of each other");
		}
		else
		{
			System.out.println("String are not rotation of each other");
		}
	}
}
