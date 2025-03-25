/*
4. The first task was to check whether the scroll was empty. Verify this. 
 */

package wt.mar08.pkg;

public class Question4 
{
	private String s1 = "The Ancient Wisdom lies within "; 
	
	void checkEmpty()
	{
		if(s1.length() == 0)
		{
			System.out.println("Scroll was empty");
		}
		else
		{
			System.out.println("Scroll was not empty");
		}
		
	}
	public static void main(String[] args) 
	{
		Question4 q4 = new Question4();
		q4.checkEmpty();
	}
}
