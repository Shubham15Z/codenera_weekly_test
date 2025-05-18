/*
Q1.Write a lambda expression to find the square of a given integer.
 */

package wt.may17.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 
{
	public static List<Integer> findSquare(List<Integer> list1)
	{
		return list1.stream().map(i -> i*i).collect(Collectors.toList());

	}
	
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		List<Integer> squares = findSquare(list1);
		System.out.println("List of squares : "+squares);
	}
}
