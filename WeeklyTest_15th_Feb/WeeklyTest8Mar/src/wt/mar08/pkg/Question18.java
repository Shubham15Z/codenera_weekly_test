/*
18. Mia needed to count the number of words written on the scroll. Find the word count.
 */

package wt.mar08.pkg;

public class Question18 
{
	private String s1 = "The Ancient Wisdom lies within"; 
	
	
	void wordCount()
	{
		int count = 1;

		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == ' ')
			{
				count++;
			}
		}
		
		System.out.println("Word count is : "+count);
		
	}
	public static void main(String[] args) 
	{
		Question18 q18 = new Question18();
		q18.wordCount();
	}
}
