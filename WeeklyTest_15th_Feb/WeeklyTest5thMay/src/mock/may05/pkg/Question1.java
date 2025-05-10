/*
 input: S = "aaABBb"
 Output: "3a3b"
 Explanation: As 'a' appears 3 times
 consecutively and 'b' also 3 times,
 and 'b' and 'B' considered as same.
 Example 2:
 Input: S = "aaacca"
 Output: "3a2c1a"
 Explanation: As 'a' appears 3 times
 consecutively and 'c' also 2 times,
 and then 'a' 1 time.
 */

package mock.may05.pkg;

public class Question1 
{
	public static void main(String[] args) 
	{
		String s = "aaABBb";
//		String s = "aaacca";
		
		char[] ch = s.toLowerCase().toCharArray();
		
		for(int i = 0; i < ch.length; i++)
		{
			int count = 1;
			for(int j = i+1; j < ch.length; j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
					i++;
				}
				else
				{
					break;
				}
			}
			System.out.print(count+""+ch[i]);
		}
		
	}
}
