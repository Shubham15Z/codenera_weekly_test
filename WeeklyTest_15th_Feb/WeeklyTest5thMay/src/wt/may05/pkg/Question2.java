/*
2.Check for Balanced Brackets in an expression (well-formedness)

Given an expression string exp, write a program to examine whether the pairs and the orders 
of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.

Example: 

Input: exp = “[()]{}{[()()]()}” 
Output: Balanced
Explanation: all the brackets are well-formed

Input: exp = “[(])” 
Output: Not Balanced 
Explanation: 1 and 4 brackets are not balanced because 
there is a closing ‘]’ before the closing ‘(‘
 */

package wt.may05.pkg;

import java.util.Stack;

public class Question2 
{
	public static boolean isFormated(String s)
	{
		if(s.isEmpty())
			return false;
		
		char[] ch = s.toCharArray();
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == '(' || ch[i] == '[' || ch[i] == '{')
			{
				st.push(ch[i]);
			}
			else
			{
				if(st.isEmpty())
					return false;
				
				char top = st.pop();
				
				if((ch[i] == ')' && top != '(') ||
				   (ch[i] == ']' && top != '[') ||
				   (ch[i] == '}' && top != '{'))
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		String s1 = "[()]{}{[()()]()}";
		String s2 = "[(])";
		
		boolean res1 = isFormated(s1);
		boolean res2 = isFormated(s2);
		
		System.out.println(s1+" : "+res1);
		System.out.println(s2+" : "+res2);
	}
}
