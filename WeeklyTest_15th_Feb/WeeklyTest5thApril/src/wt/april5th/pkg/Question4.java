/*
4. Array Coding – Second Largest Element:
Write a Java program that finds the second largest element in an integer array. 
The program should handle the case where the array has fewer than two distinct elements.
 */

package wt.april5th.pkg;

class SecondLargest
{
	private int[] a;
	
	public SecondLargest(int[] a)
	{
		this.a = a;
	}
	
	public void findSecondLargest()
	{
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > max)
			{
				secMax = max;
				max = a[i];
			}
			else if(a[i] > secMax && a[i] != max)
			{
				secMax = a[i];
			}
		}
		
		if(secMax == Integer.MIN_VALUE)
		{
			System.out.println("No second largest element as array has no distinct elements greater than two");
		}
		else
		{
			System.out.println("Second largest element is : "+secMax);
		}
	}
}


public class Question4 
{
	public static void main(String[] args) 
	{
		int[] a1 = {12,4,7,33,15,20,8};
		int[] a2 = {10,10,10};
		
		SecondLargest sl1 = new SecondLargest(a1);
		sl1.findSecondLargest();
		
		System.out.println("----------------------------");
		
		SecondLargest sl2 = new SecondLargest(a2);
		sl2.findSecondLargest();
		
	}
}
