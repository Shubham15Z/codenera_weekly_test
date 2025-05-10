/*
7. Write a program to sort a list of strings in ascending order using a TreeSet.
 */

package wt.may05.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question7
{
	public static void main(String[] args) 
	{
		List<String> s1 = new ArrayList<String>(Arrays.asList("Ram", "Vishal", "Ajay","Nayan","Sham"));
		System.out.println(s1);
		
		Set<String> t1 = new TreeSet<>();
		
		for(String name : s1)
		{
			t1.add(name);
		}
		
		System.out.println(t1);
	}
}
