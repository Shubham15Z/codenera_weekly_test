/*
Q2.Given a list of strings, use the Stream API to filter out strings starting with the letter 'A' and 
concatenate the remaining strings into a single result string.
 */
package wt.may17.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 
{
	public static String concatStrings(List<String> list1)
	{
		return list1.stream()
				.filter(s -> !s.startsWith("A"))
				.collect(Collectors.joining(" "));
		
//		return list1.stream().filter(s -> s.charAt(0) != 'A').reduce((s1,s2) -> s1+" "+s2).orElse(null);
	}
	public static void main(String[] args)
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("Mango", "Apple", "Grapes", "Kiwi","Avacado"));
		String result = concatStrings(list1);
		System.out.println("Combination of remaining words : "+result);
	}
}
