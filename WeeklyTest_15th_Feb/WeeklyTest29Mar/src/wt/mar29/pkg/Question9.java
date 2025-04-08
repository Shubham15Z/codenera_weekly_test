/*
9)Write a Java program to merge two sorted arrays without using extra space.
 */
package wt.mar29.pkg;

import java.util.Arrays;

public class Question9 
{
	public static void mergeArrays(int[] arr1, int[] arr2)
	{
		int m = arr1.length;
		int n = arr2.length;
		
		int right = m-1;
		int left = 0;
		
		while(right >= 0 && left < n)
		{
			if(arr1[right] > arr2[left])
			{
				int temp = arr1[right];
				arr1[right] = arr2[left];
				arr2[left] = temp;
			}
			right--;
			left++;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
	}
	
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};

        System.out.println("Before Merging:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        mergeArrays(arr1, arr2);

        System.out.println("\nAfter Merging:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}
