/*
8. Write a function to rotate an array to the right by `k` steps (e.g., `[1,2,3,4,5]` → rotate by 2 → `[4,5,1,2,3]`).
 */

package wt.april26.pkg;

import java.util.Arrays;

public class Question5 
{
	public static void rotateArray(int[] a, int k)
	{
		for(int j = 1; j <= k; j++)
		{
			int temp = a[a.length-1];
			for(int i = a.length-1; i > 0; i--)
			{
				a[i] = a[i-1];
			}
			a[0] = temp;
		}
	}
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		int k = 2;
		System.out.println(Arrays.toString(a));
		rotateArray(a,k);
		System.out.println(Arrays.toString(a));
	}
}
