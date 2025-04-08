/*
3)Write a Java method to reverse every word in a given string while keeping the order of words intact.
 */

package wt.mar29.pkg;

public class Question3 
{
	public static String revereWord(String s1)
	{
		String[] words = s1.split(" ");
		String s2 = "";
		
		for(int i = 0; i < words.length; i++)
		{
			String w1 = words[i];
			for(int j = w1.length()-1; j >= 0; j--)
			{
				s2 = s2+w1.charAt(j);
			}
			s2=s2+" ";
		}
		return s2.trim();
	}
	
	public static void main(String[] args) {
		String s1 = "Hello World Java is simple";
		System.out.println(s1);
		String res = revereWord(s1);
		System.out.println(res);
	}
}
