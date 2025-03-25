/*
12. Mia needed to check if the scroll contained the letter 'Q'. Find out. 
 */

package wt.mar08.pkg;

public class Question12 
{
	private String s1 = "Eldoria The Ancient Wisdom lies within Scroll Quite"; 
	
	void checkPhrase()
	{
		System.out.println("Check scroll which contains letter Q : "+s1.contains("Q"));
	}
	public static void main(String[] args) 
	{
		Question12 q12 = new Question12();
		q12.checkPhrase();
	}
}
