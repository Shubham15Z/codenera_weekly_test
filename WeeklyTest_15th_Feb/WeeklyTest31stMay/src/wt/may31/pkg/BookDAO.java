package wt.may31.pkg;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class BookDAO
{
	 Scanner sc = new Scanner(System.in);

	    public void addBook() {
	        try (Connection con = DBConnection.getConnection()) {
	            String sql = "INSERT INTO books VALUES (?, ?, ?, ?, ?)";
	            PreparedStatement ps = con.prepareStatement(sql);

	            System.out.println("Enter Book ID, Title, Author, Category, Quantity:");
	            ps.setInt(1, sc.nextInt());
	            ps.setString(2, sc.next());
	            ps.setString(3, sc.next());
	            ps.setString(4, sc.next());
	            ps.setInt(5, sc.nextInt());

	            ps.executeUpdate();
	            System.out.println("Book Added.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void updateBook() {
	        try (Connection con = DBConnection.getConnection()) {
	            String sql = "UPDATE books SET title=?, author=?, category=?, quantity=? WHERE book_id=?";
	            PreparedStatement ps = con.prepareStatement(sql);

	            System.out.println("Enter Book ID to update:");
	            int id = sc.nextInt();

	            System.out.println("Enter new Title, Author, Category, Quantity:");
	            ps.setString(1, sc.next());
	            ps.setString(2, sc.next());
	            ps.setString(3, sc.next());
	            ps.setInt(4, sc.nextInt());
	            ps.setInt(5, id);

	            ps.executeUpdate();
	            System.out.println("Book Updated.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void deleteBook() {
	        try (Connection con = DBConnection.getConnection()) {
	            String sql = "DELETE FROM books WHERE book_id=?";
	            PreparedStatement ps = con.prepareStatement(sql);

	            System.out.println("Enter Book ID to delete:");
	            ps.setInt(1, sc.nextInt());

	            ps.executeUpdate();
	            System.out.println("Book Deleted.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void viewAllBooks() {
	        try (Connection con = DBConnection.getConnection()) {
	            String sql = "SELECT * FROM books";
	            Statement st = con.createStatement();
	            ResultSet rs = st.executeQuery(sql);

	            while (rs.next()) {
	                System.out.println(rs.getInt(1) + " | " +
	                        rs.getString(2) + " | " +
	                        rs.getString(3) + " | " +
	                        rs.getString(4) + " | " +
	                        rs.getInt(5));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void searchBook() {
	        try (Connection con = DBConnection.getConnection()) {
	            String sql = "SELECT * FROM books WHERE title LIKE ? OR category LIKE ?";
	            PreparedStatement ps = con.prepareStatement(sql);

	            System.out.println("Enter title or category to search:");
	            String input = "%" + sc.next() + "%";

	            ps.setString(1, input);
	            ps.setString(2, input);

	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                System.out.println(rs.getInt(1) + " | " +
	                        rs.getString(2) + " | " +
	                        rs.getString(3) + " | " +
	                        rs.getString(4) + " | " +
	                        rs.getInt(5));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
