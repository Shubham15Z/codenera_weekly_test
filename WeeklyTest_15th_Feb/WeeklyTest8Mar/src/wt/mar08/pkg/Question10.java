/*
10. The scroll had a phrase that might start with "Eldoria." Check if it does.
 */

package wt.mar08.pkg;

public class Question10 
{
	private String s1 = "Eldoria The Ancient Wisdom lies within"; 
	
	void checkPhrase()
	{
		System.out.println("Check scroll start with phrase Eldoria : "+s1.startsWith("Eldoria"));
	}
	public static void main(String[] args) 
	{
		Question10 q10 = new Question10();
		q10.checkPhrase();
	}
}
