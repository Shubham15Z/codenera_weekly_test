
/*
15. Some words were misspelled. Replace all occurrences of 'e' with 'a'. 
 */
package wt.mar08.pkg;

public class Question15 
{
	private String s1 = "Eldoria The Ancient Wisdom lies within Scroll QuiTe"; 
	
	void checkPhrase()
	{
		System.out.println("Replacing all occurences of 'e' with 'a' : "+s1.replace("e","a"));
	}
	public static void main(String[] args) 
	{
		Question15 q15 = new Question15();
		q15.checkPhrase();
	}
}
