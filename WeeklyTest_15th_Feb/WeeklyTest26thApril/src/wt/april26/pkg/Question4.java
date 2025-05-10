/*
7. Given a sorted array, remove the duplicates in-place and return the new length.
 */

package wt.april26.pkg;

import java.util.Arrays;

public class Question4 
{
	public int findLength(int[] a)
	{
		if(a.length == 0) return 0;
		
		int i = 0;
		
		for(int j = 1; j < a.length; j++)
		{
			if(a[j] != a[i])
			{
				i++;
				a[i] = a[j];
			}
		}
		return i+1;
	}
	
	public static void main(String[] args)
	{
		int[] a = {1,1,2,2,3,4,4,5};
		
		Question4 q4 = new Question4();
		
		int res = q4.findLength(a);
		
		System.out.println("new length is : "+res);
	}
}
