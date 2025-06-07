package wt.may31.pkg;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class IssueDAO 
{
	 Scanner sc = new Scanner(System.in);

	    public void issueBook() {
	        try (Connection con = DBConnection.getConnection()) {
	            String sql = "INSERT INTO issued_books(book_id, member_id, issue_date) VALUES (?, ?, ?)";
	            PreparedStatement ps = con.prepareStatement(sql);

	            System.out.println("Enter Issue ID, Book ID, Member ID, Issue Date (yyyy-mm-dd):");
//	            ps.setInt(1, sc.nextInt());  // Issue ID
	            ps.setInt(1, sc.nextInt());  // Book ID
	            ps.setInt(2, sc.nextInt());  // Member ID
	            ps.setDate(3, Date.valueOf(sc.next()));  // Issue Date

	            ps.executeUpdate();
	            System.out.println("Book Issued.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void returnBook() {
	        try (Connection con = DBConnection.getConnection()) {
	            String sql = "UPDATE issued_books SET return_date=?, fine=? WHERE issue_id=?";
	            PreparedStatement ps = con.prepareStatement(sql);

	            System.out.println("Enter Issue ID and Return Date (yyyy-mm-dd):");
	            int issueId = sc.nextInt();
	            Date returnDate = Date.valueOf(sc.next());

	            // Fine calculation (optional logic: Rs. 10 per day after 14 days)
	            String fetchQuery = "SELECT issue_date FROM issued_books WHERE issue_id=?";
	            PreparedStatement psFetch = con.prepareStatement(fetchQuery);
	            psFetch.setInt(1, issueId);
	            ResultSet rs = psFetch.executeQuery();

	            int fine = 0;
	            if (rs.next()) {
	                Date issueDate = rs.getDate("issue_date");
	                long diff = returnDate.getTime() - issueDate.getTime();
	                int days = (int) (diff / (1000 * 60 * 60 * 24));
	                if (days > 14) fine = (days - 14) * 10;
	            }

	            ps.setDate(1, returnDate);
	            ps.setInt(2, fine);
	            ps.setInt(3, issueId);

	            ps.executeUpdate();
	            System.out.println("Book Returned. Fine: Rs. " + fine);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
