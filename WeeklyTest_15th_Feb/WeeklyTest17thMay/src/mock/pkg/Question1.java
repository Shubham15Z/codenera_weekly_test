/*
 Find the average of a list of doubles.
Write a method that takes a list of doubles as input and returns the average of the numbers in the list. 
Use the Stream API to solve this problem.
 */

package mock.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 
{
	public static double findAverage(List<Double> list1)
	{
		return list1.stream().mapToDouble(i -> i.doubleValue()).average().orElse(0);
	}
	
	public static void main(String[] args) 
	{
		List<Double> list1 = new ArrayList<Double>(Arrays.asList(10.0,20.5,30.2,40.8));
		
		double result = findAverage(list1);
		
		System.out.println("Average : "+result);
	}
}
