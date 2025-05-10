/*

5. Delete consecutive same words in a sequence


Input : ab aa aa bcd ab
Output : 3
As aa, aa destroys each other so, 
ab bcd ab is the new sequence.


Input :  tom jerry jerry tom
Output : 0
 */

package wt.may10.pkg;

import java.util.Stack;

public class Question5 
{
	public static int deleteSameWord(String s)
	{
		String[] words = s.split(" ");
		
		Stack<String> st = new Stack<String>();
		
		for(String word : words)
		{
			if(!st.isEmpty() && st.peek().equals(word))
			{
				st.pop();
			}
			else
			{
				st.push(word);
			}
		}
		
		return st.size();
	}
	public static void main(String[] args) 
	{
		String s1 = "ab aa aa bcd ab";
		String s2 = "tom jerry jerry tom";
		
		int res1 = deleteSameWord(s1);
		System.out.println(res1);
		
		int res2 = deleteSameWord(s2);
		System.out.println(res2);
		
	}
}
