/*
. Mia discovered strange consonants in the words. Count them too. 
 */

package wt.mar08.pkg;

public class Question8 
{
	private String s1 = "The Ancient Wisdom lies within"; 
	private String s2 = "aeiouAEIOU";
	
	void countConsonents()
	{
		int count = 0;
		char[] c1 = s1.toCharArray();
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(s2.indexOf(c1[i]) == -1)
			{
				count++;
			}
		}
		
		System.out.println("Consonent count is : "+count);
		
	}
	public static void main(String[] args) 
	{
		Question8 q8 = new Question8();
		q8.countConsonents();
	}
}
