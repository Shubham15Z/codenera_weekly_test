/*
5. Write a program to find the union and intersection of two arrays using a HashSet.
 */

package wt.may05.pkg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question5 
{
	public static void main(String[] args) 
	{
		Integer[] arr1 = {1, 2, 3, 3, 4, 5, 6};
        Integer[] arr2 = {4, 5, 5, 6, 7, 7, 8, 9};
        
        Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(arr1));
        Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(arr2));
        
        Set<Integer> union = new HashSet(s1);
        union.addAll(s2);
        
        System.out.println("Union : "+union);
        
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        
        System.out.println("Intersection : "+intersection);
	}
}
