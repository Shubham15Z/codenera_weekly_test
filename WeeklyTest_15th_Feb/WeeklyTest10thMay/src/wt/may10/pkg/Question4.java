/*
Q4.  Remove Duplicates  
   - Question: Given an ArrayList of integers, remove duplicates while preserving order.
   - Input: [1, 2, 2, 3, 4, 4, 5]
   - Output: [1, 2, 3, 4, 5]
 */

package wt.may10.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question4 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5));
		
		Set<Integer> set1 = new LinkedHashSet<Integer>(list1);
		
		System.out.println(set1);
	}
}
