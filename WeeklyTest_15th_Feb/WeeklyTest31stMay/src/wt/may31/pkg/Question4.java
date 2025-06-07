/*
4. Write a program to convert a list of strings to uppercase and collect them into a new list using Stream API.
 */

package wt.may31.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question4
{
	public static void main(String[] args) 
	{
		List<String> l1 = Arrays.asList("Apple","Orange","Grapes","Banana");
		
		List<String> l2 = l1.stream().map(s1 -> s1.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(l2);
	}
}
