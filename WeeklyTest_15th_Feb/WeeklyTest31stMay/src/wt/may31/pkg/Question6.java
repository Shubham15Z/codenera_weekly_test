/*
6. Write a Java program to insert multiple records into a MySQL table using `PreparedStatement`.
 */

package wt.may31.pkg;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Question6 
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dec_2024_db","root","Shubham@15");
			
			PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
			
			Scanner sc = new Scanner(System.in);
			
			while(true)
			{
				System.out.println("Enter id, name, birthdate : ");
				int id = sc.nextInt();
				String name = sc.next();
				String birthdate = sc.next();
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, birthdate);
				
				ps.addBatch();
				
				System.out.println("Do you want to add more records... press Y else N");
				char ch = sc.next().charAt(0);
				
				if(ch == 'n' || ch == 'N')
				{
					break;
				}
			}
			int[] status = ps.executeBatch();
			if(status.length > 0)
			{
				System.out.println("Multiple Data inserted Successfully....");
			}
			else
			{
				System.out.println("Something went wrong");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
