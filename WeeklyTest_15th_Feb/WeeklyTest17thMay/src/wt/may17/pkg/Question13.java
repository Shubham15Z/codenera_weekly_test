/*
Q13.Design a custom class representing a library book. 
Create a HashMap to store information about each book, and implement methods to add, remove, and search for books.
 */

package wt.may17.pkg;

import java.util.HashMap;
import java.util.Map;

class Book
{
	private int id;
	private String bookName;
	private String author;
	public Book(int id, String bookName, String author) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "\nid = " + id + ", bookName = " + bookName + ", author = " + author;
	}
}

public class Question13
{
	 	private static Map<Integer, Book> library = new HashMap<>();

	    public static void addBook(Book book) 
	    {
	        library.put(book.getId(), book);
	        System.out.println("Book added: " + book);
	    }

	
	    public static void removeBook(int id) 
	    {
	        if (library.containsKey(id)) 
	        {
	            Book removed = library.remove(id);
	            System.out.println("Book removed: " + removed);
	        } 
	        else 
	        {
	            System.out.println("Book with ID " + id + " not found.");
	        }
	    }


	    public static void searchBook(int id) 
	    {
	        if (library.containsKey(id))
	        {
	            System.out.println("Book found: " + library.get(id));
	        } 
	        else
	        {
	            System.out.println("Book with ID " + id + " not found.");
	        }
	    }

	    public static void main(String[] args) {
	        
	        addBook(new Book(1, "The Alchemist", "Paulo Coelho"));
	        addBook(new Book(2, "1984", "George Orwell"));
	        addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
	        
	        searchBook(2);

	        removeBook(3);
	        
	        searchBook(3);
	    }
}
