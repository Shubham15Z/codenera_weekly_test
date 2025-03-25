/*
2. Mia wanted to check how many characters were in the scroll's first line. Find the length of the string.
 */
package wt.mar08.pkg;

public class Question2 
{
	private String message = "The Ancient Wisdom lies within "; 
	
	void findLength()
	{
		System.out.println("Length : "+message.length());
	}
	public static void main(String[] args) 
	{
		Question2 q2 = new Question2();
		q2.findLength();
	}
}
