/*
13. Ryan wanted to find the first occurrence of the letter 'S'. Locate it.
 */

package wt.mar08.pkg;

public class Question13 
{
	private String s1 = "Eldoria The Ancient Wisdom lies within Scroll Quite"; 
	
	void checkPhrase()
	{
		System.out.println("The first occurrence of the letter 'S' in scroll : "+s1.indexOf("S"));
	}
	public static void main(String[] args) 
	{
		Question13 q13 = new Question13();
		q13.checkPhrase();
	}
}
