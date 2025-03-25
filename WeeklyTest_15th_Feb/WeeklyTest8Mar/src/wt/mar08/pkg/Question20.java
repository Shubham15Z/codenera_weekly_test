/*
The final challenge was to check if the given text contained only numeric values. 
 */

package wt.mar08.pkg;

public class Question20 
{
	private String s1 = "987608"; 
	
	boolean checkPhrase()
	{
		boolean checkNumber = true;
		char[] ch = s1.toCharArray();
	
		for(int i = 0; i <= ch.length-1; i++)
		{
			if(ch[i] >= '0' && ch[i] <= '9')
			{
				checkNumber = true;
			}
			else
			{
				checkNumber = false;
				break;
			}
		}
		return checkNumber;
	}
	public static void main(String[] args) 
	{
		Question20 q20 = new Question20();
		boolean result = q20.checkPhrase();
		System.out.println("Check Numeric values : "+result);
	}
}
