/*

9. Write a program to delete records from a MySQL table where the age of the employee is greater than 60.
 */

package wt.may31.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Question9 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dec_2024_db","root","Shubham@15");
			
			PreparedStatement ps = con.prepareStatement("delete from emp1 where age > ?");
			
			ps.setInt(1, 60);
			
			int status = ps.executeUpdate();
			if(status > 0)
			{
				System.out.println("Data deleted Successfully");
			}
			else
			{
				System.out.println("Something went wrong");
			}
			
			ps.close();
			con.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
