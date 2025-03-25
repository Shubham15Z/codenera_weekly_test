/*
7. Ryan found special vowels hidden in the text. Count how many there are. 
 */

package wt.mar08.pkg;

public class Question7 
{
	private String s1 = "The Ancient Wisdom lies within"; 
	private String s2 = "aeiouAEIOU";
	int count = 0;
	void countVowels()
	{
		for(char c : s1.toCharArray())
		{
			if(s2.indexOf(c) != -1)
			{
				count++;
			}
		}
		System.out.println("Count of vowels is : "+count);
	}
	public static void main(String[] args) 
	{
		Question7 q7 = new Question7();
		q7.countVowels();
	}
}
