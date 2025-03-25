/*
17. The scroll held a hidden message that had to be read backward. Reverse the text. 
 */

package wt.mar08.pkg;

public class Question17 
{
	private String s1 = "etiuQ"; 
	
	String checkPhrase()
	{
		System.out.println("Secrete message : "+s1);
		int left = 0, right = s1.length()-1;
		char[] ch = s1.toCharArray(); 
		while(left < right)
		{
			char temp = ch[right];
			ch[right] = ch[left];
			ch[left] = temp;
			left++;
			right--;
		}
		
		return new String(ch);
	}
	public static void main(String[] args) 
	{
		Question17 q17 = new Question17();
		String result = q17.checkPhrase();
		System.out.println("Revers a message : "+result);
	}
}
