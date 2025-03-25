
/*
19. The ancient text had repeated letters. Remove all duplicate characters.
 */
package wt.mar08.pkg;

public class Question19 
{
	private String s1 = "Before"; 
	
	String checkPhrase()
	{
		char[] ch = s1.toCharArray();
		String s2 = "";
		
		for(int i = 0; i <= ch.length-1; i++)
		{
			if(s2.indexOf(ch[i]) == -1)
			{
				s2 += ch[i];
			}
		}
		
		return s2;
	}
	public static void main(String[] args) 
	{
		Question19 q19 = new Question19();
		String result = q19.checkPhrase();
		System.out.println("Remove duplicates : "+result);
	}
}
