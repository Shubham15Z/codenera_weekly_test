/*
6. Write a function that returns the maximum product of any two integers in an array.  
 */

package wt.april26.pkg;

import java.util.Arrays;

public class Question3
{
	public void maxProduct()
	{
		int[] a = {12,4,15,7,9,20,5};
		
		Arrays.sort(a);
		
		int maxProd = a[a.length-1]*a[a.length-2];
		
		System.out.println("Maximum product is : "+maxProd);
	}
	
	public static void main(String[] args) 
	{
		Question3 q3 = new Question3();
		q3.maxProduct();
	}
}
