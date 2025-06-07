/*
7. Develop a program to fetch all records from a MySQL table and display them in a formatted manner using JDBC.
 */

package wt.may31.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Question7 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dec_2024_db","root","Shubham@15");
			
			PreparedStatement ps = con.prepareStatement("select * from emp");
			
			ResultSet rs = ps.executeQuery();
			
			System.out.println("Id\t Name\t Birthdate");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
