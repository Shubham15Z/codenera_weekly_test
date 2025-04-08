/*
7)Write a program to find the second largest element in an unsorted array without sorting it.
 */

package wt.mar29.pkg;

public class Question7 
{
	public Question7() 
	{
		int res = findSecMax(null);
		display(res);
		
	}
	public static int findSecMax(int a[])
	{
		int[] a1 = {12,45,6,3,32,8};
		int max = 0;
		int secMax = 0;
		
		for(int i = 0; i < a1.length; i++)
		{
			if(a1[i] > max)
			{
				secMax = max;
				max = a1[i];
			}
			else if(a1[i] > secMax && max != secMax)
			{
				secMax = a1[i];
			}
		}
		return secMax;
	}
	
	public static void display(int res)
	{
		System.out.println("The second largest element is : "+res);
	}
	
	public static void main(String[] args) 
	{
		Question7 q7 = new Question7();
	}
}
