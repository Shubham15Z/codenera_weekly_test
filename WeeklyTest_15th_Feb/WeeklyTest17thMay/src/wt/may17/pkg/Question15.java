/*
Q15.Write a program to find the average of a list of double using stream api
 */

package wt.may17.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question15 
{
	public static void main(String[] args) 
	{
		List<Double> list1 = new ArrayList<Double>(Arrays.asList(100.0, 20.5, 50.5, 80.2));
		
		Double average1 =  list1.stream().mapToDouble(i -> i.doubleValue()).average().orElse(0);
		
		System.out.println("Average of doubles in list : "+average1);
	}
}
