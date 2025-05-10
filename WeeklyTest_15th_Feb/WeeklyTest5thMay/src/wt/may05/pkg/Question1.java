/*
1. Delete consecutive same words in a sequence


Input : ab aa aa bcd ab
Output : 3
As aa, aa destroys each other so, 
ab bcd ab is the new sequence.


Input :  tom jerry jerry tom
Output : 0


As first both jerry will destroy each other.
Then sequence will be tom, tom they will also destroy
each other. So, the final sequence doesn’t contain any
word.
 */

package wt.may05.pkg;

import java.util.Stack;

public class Question1 
{
	public static int deleteWord(String s1)
	{
		String[] words = s1.toLowerCase().split(" ");
		
		Stack<String> st = new Stack<String>();
		
		
		for(int i = 0; i < words.length; i++)
		{
			if(!st.isEmpty() && st.peek().equals(words[i]))
			{
				st.pop();
			}
			else
			{
				st.push(words[i]);
			}
		}
		return st.size();
	}
	public static void main(String[] args) 
	{
		String s1 = "ab aa aa bcd ab";
		String s2 = "tom jerry jerry tom";
		
		int res1 = deleteWord(s1);
		int res2 = deleteWord(s2);
		
		System.out.println(s1+" : "+res1);
		System.out.println(s2+" : "+res2);
	}
}
