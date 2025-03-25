/*
14. Mia was looking for the last appearance of the letter 'T'. Find it.
 */
package wt.mar08.pkg;

public class Question14 
{
	private String s1 = "Eldoria The Ancient Wisdom lies within Scroll QuiTe"; 
	
	void checkPhrase()
	{
		System.out.println("The last occurrence of the letter 'T' in scroll : "+s1.lastIndexOf("T"));
	}
	public static void main(String[] args) 
	{
		Question14 q14 = new Question14();
		q14.checkPhrase();
	}
}
