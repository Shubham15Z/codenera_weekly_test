package wt.may31.pkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MemberDAO 
{
	 Scanner sc = new Scanner(System.in);

	    public void addMember() {
	        try (Connection con = DBConnection.getConnection()) {
	            String sql = "INSERT INTO members VALUES (?, ?, ?, ?)";
	            PreparedStatement ps = con.prepareStatement(sql);

	            System.out.println("Enter Member ID, Name, Address, Phone:");
	            ps.setInt(1, sc.nextInt());
	            ps.setString(2, sc.next());
	            ps.setString(3, sc.next());
	            ps.setString(4, sc.next());

	            ps.executeUpdate();
	            System.out.println("Member Added.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void updateMember() {
	        try (Connection con = DBConnection.getConnection()) {
	            String sql = "UPDATE members SET name=?, address=?, phone=? WHERE member_id=?";
	            PreparedStatement ps = con.prepareStatement(sql);

	            System.out.println("Enter Member ID to update:");
	            int id = sc.nextInt();

	            System.out.println("Enter new Name, Address, Phone:");
	            ps.setString(1, sc.next());
	            ps.setString(2, sc.next());
	            ps.setString(3, sc.next());
	            ps.setInt(4, id);

	            ps.executeUpdate();
	            System.out.println("Member Updated.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void deleteMember() {
	        try (Connection con = DBConnection.getConnection()) {
	            String sql = "DELETE FROM members WHERE member_id=?";
	            PreparedStatement ps = con.prepareStatement(sql);

	            System.out.println("Enter Member ID to delete:");
	            ps.setInt(1, sc.nextInt());

	            ps.executeUpdate();
	            System.out.println("Member Deleted.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void viewAllMembers() {
	        try (Connection con = DBConnection.getConnection()) {
	            String sql = "SELECT * FROM members";
	            Statement st = con.createStatement();
	            ResultSet rs = st.executeQuery(sql);

	            while (rs.next()) {
	                System.out.println(rs.getInt(1) + " | " +
	                        rs.getString(2) + " | " +
	                        rs.getString(3) + " | " +
	                        rs.getString(4));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
