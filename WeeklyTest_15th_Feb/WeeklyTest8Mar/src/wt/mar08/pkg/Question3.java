/*
3. The scroll was torn in half. Combine two separate parts into one message.
 */

package wt.mar08.pkg;

public class Question3 
{
	private String s1 = "The Ancient Wisdom";  
	
	private String s2 = "lies within";
	
	void combineScroll()
	{
		System.out.println("Combined message :"+(s1+" "+s2));
	}
	public static void main(String[] args) 
	{
		Question3 q3 = new Question3();
		q3.combineScroll();
	}
}
