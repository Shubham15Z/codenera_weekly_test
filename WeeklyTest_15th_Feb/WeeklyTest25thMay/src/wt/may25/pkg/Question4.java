/*
Q4. Write a Java program to find the longest word in a text file.
 */

package wt.may25.pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Question4
{
	
	public static void main(String[] args)
	{
		File f1 = new File("E:\\Work\\Codenera\\WeeklyTest\\WeeklyTest_15th_Feb\\WeeklyTest25thMay\\files\\longestword.txt");
		
		try 
		{
			Scanner sc = new Scanner(f1);
			StringBuilder sb = new StringBuilder();
			
			while(sc.hasNext())
			{
				sb.append(sc.nextLine());
			}
			
			String s = String.valueOf(sb);
			String[] words = s.split(" ");
			String longest = "";
			
			for(String word : words)
			{
				if(word.length() >= longest.length())
				{
					longest = word;
				}
			}
			
			System.out.println("Longest Word : "+longest);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
}
