/*
9. There were mysterious gaps between words. Count the number of spaces.
 */

package wt.mar08.pkg;

public class Question9 
{
	private String s1 = "The Ancient Wisdom lies within"; 
	
	
	void countGaps()
	{
		int count = 0;
		char[] c1 = s1.toCharArray();
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == ' ')
			{
				count++;
			}
		}
		
		System.out.println("Gap count is : "+count);
		
	}
	public static void main(String[] args) 
	{
		Question9 q9 = new Question9();
		q9.countGaps();
	}
}
