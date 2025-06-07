/*
5. Implement a program to find the second-highest number in a list using Stream API.

 */

package wt.may31.pkg;

import java.util.Arrays;
import java.util.List;

public class Question5 
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(12,45,30,68,20);
		
		int secMax = l1.stream().sorted((n1,n2) -> n2-n1).skip(1).findFirst().orElse(0);
		
		System.out.println(secMax);
	}
}
