/*
16. The scroll had unnecessary blank spaces at the beginning and end. Remove them.
 */
package wt.mar08.pkg;

public class Question16 
{
	private String s1 = "   Eldoria The Ancient Wisdom lies within Scroll QuiTe   "; 
	
	void checkPhrase()
	{
		System.out.println("Replacing all unecessary blank spaces : "+s1.trim());
	}
	public static void main(String[] args) 
	{
		Question15 q15 = new Question15();
		q15.checkPhrase();
	}
}
