/*
5. Some words were written in lowercase letters. Convert the entire text to uppercase. 
 */

package wt.mar08.pkg;

public class Question5 
{
	private String s1 = "The Ancient Wisdom lies within "; 
	
	void makeUppercase()
	{
		System.out.println("Uppercase Scroll : "+s1.toUpperCase());
	}
	public static void main(String[] args) 
	{
		Question5 q5 = new Question5();
		q5.makeUppercase();
	}
}
