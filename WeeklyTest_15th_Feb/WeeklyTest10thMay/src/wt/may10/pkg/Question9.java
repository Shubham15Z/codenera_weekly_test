/*
Q9. Find Missing Elements  
    - Question: Given an array, find elements not present in a HashSet.
    - Input: Array: [1, 2, 3, 4, 5], Set: {2, 4}
    - Output: [1, 3, 5]
 */

package wt.may10.pkg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question9
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(2,4));
		
		System.out.println(set1);
		
		for(int n1 : arr)
		{
			if(!set1.contains(n1))
			{
				System.out.print(n1+" ");
			}
		}
	}
}
