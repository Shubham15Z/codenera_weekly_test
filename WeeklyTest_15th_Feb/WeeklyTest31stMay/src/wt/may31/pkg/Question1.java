/*
1. Write a program to filter a list of integers to retain only even numbers and then find their sum using the Stream API.
 */

package wt.may31.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		
		int sum = list1.stream().filter(i -> i%2 == 0).mapToInt(i -> i).sum();
		
		System.out.println(sum);
	}
}
