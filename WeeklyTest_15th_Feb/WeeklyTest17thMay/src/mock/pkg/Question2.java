/*
5. Group Anagrams  
    - Question: Group anagrams from a list of strings using a HashMap.
    - Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
    - Output: [[eat, tea, ate], [tan, nat], [bat]]
 */

package mock.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question2 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));
		

		Map<String, List<String>> m1 = new HashMap<String, List<String>>();
		
		for(String s1 : list1)
		{
			char[] c1 = s1.toCharArray();
			
			Arrays.sort(c1);
			
			String sorted = new String(c1);
			
			if(!m1.containsKey(sorted))
			{
				m1.put(sorted, new ArrayList<String>());
			}

			m1.get(sorted).add(s1);	
		}
		
		System.out.println(m1);
	
	}
}
