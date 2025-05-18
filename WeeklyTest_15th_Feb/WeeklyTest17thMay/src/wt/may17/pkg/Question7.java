/*
Q7.Given a list of integers, use a lambda expression to filter out the odd numbers and return a new list.
 */

package wt.may17.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 
{
	public static List<Integer> findOdd(List<Integer> list1)
	{
		return list1.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
	}
	
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		List<Integer> odds =  findOdd(list1);
		System.out.println("List of odd : "+odds);
		
	}
}
