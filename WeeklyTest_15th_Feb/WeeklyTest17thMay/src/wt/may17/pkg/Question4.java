/*
 Q4.Create a HashSet of integers and write a program to remove all even numbers from the set.
 */


package wt.may17.pkg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Question4 
{
	public static void main(String[] args) 
	{
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(12,3,65,34,70,23,3));
		
		Set<Integer> non_even = set1.stream().filter(i -> i % 2 != 0).collect(Collectors.toSet());
		
		System.out.println("Set of Non Even : "+non_even);
	}
}
