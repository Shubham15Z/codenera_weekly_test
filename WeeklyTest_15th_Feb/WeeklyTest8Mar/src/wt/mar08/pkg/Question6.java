/*
6. The next section had only capital letters. Convert it all to lowercase.  
 */

package wt.mar08.pkg;

public class Question6 
{
	private String s1 = "The Ancient Wisdom lies within "; 
	
	void makeLowercase()
	{
		System.out.println("Uppercase Scroll : "+s1.toLowerCase());
	}
	public static void main(String[] args) 
	{
		Question6 q6 = new Question6();
		q6.makeLowercase();
	}
}
