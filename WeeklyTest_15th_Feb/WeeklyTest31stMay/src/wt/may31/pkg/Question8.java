/*
8. Create a Java program to update the salary of employees by 10% for a specific department using JDBC.
 */

package wt.may31.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Question8 
{
	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dec_2024_db","root","Shubham@15");
			
			String dept = "Engineering";
			
			PreparedStatement ps = con.prepareStatement("update employee set salary = salary * 1.10 where department=?");
			
			ps.setString(1, dept);
			
			int status = ps.executeUpdate();
			
			if(status > 0)
			{
				System.out.println("Salary updated Successfully");
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
