/*
Q9.Write a Java program to demonstrate the use of TreeMap to store and retrieve key-value pairs in sorted order.

 */

package wt.may17.pkg;

import java.util.Map;
import java.util.TreeMap;

public class Question9 
{
	public static void main(String[] args)
	{
        TreeMap<String, String> capitals = new TreeMap<>();

        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington D.C.");
        capitals.put("Germany", "Berlin");
        capitals.put("Australia", "Canberra");
        capitals.put("Canada", "Ottawa");

        
        System.out.println("Country - Capital (Sorted by Country Name):");
        
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
	}
}
