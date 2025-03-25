/*
11. It also had a phrase that might end with "Scroll." Verify this. 
 */

package wt.mar08.pkg;

public class Question11 
{
	private String s1 = "Eldoria The Ancient Wisdom lies within Scroll"; 
	
	void checkPhrase()
	{
		System.out.println("Check scroll ends with phrase Scroll : "+s1.endsWith("Scroll"));
	}
	public static void main(String[] args) 
	{
		Question11 q11 = new Question11();
		q11.checkPhrase();
	}
}
