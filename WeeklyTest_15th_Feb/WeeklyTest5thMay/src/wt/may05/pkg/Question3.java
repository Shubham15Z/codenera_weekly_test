/*
3. Remove duplicate elements from an array using a HashSet.
 */
package wt.may05.pkg;

import java.util.Arrays;
import java.util.HashSet;

public class Question3 
{
	public static void main(String[] args) 
	{
		int[] arr = {10, 20, 30, 20, 10, 40, 50, 30, 60, 50};
		
		System.out.println(Arrays.toString(arr));
		
		HashSet s1 = new HashSet(Arrays.asList(10, 20, 30, 20, 10, 40, 50, 30, 60, 50));
		
		System.out.println(s1);
	}
}
