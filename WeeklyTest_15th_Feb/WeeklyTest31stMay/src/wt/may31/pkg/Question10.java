/*
Project: Library Management System

Description: A system to manage library records, including book and member management. Users can add, update, delete, view, and search for books and members. Additionally, it includes a feature to generate reports using callable statements.

Modules:

1. Add Book
   - Add details like Book ID, title, author, category, and quantity to the library database.

2. Update Book
   - Update book details based on Book ID.

3. Delete Book
   - Remove a book from the library database by Book ID.

4. View All Books
   - Display the complete list of books in the library.

5. Search Books
   - Search for books by title or category.

6. Add Member
   - Register new library members by adding details like Member ID, name, address, and phone number.

7. Update Member
   - Update member details based on Member ID.

8. Delete Member
   - Remove a member from the library database by Member ID.

9. Issue and Return Books
   - Record the issuance and return of books, including validation of return dates and fine calculation.

10. Generate Library Report (Callable Statement)
    - Use a stored procedure to generate a report summarizing library details, such as:
      - Total books in the library.
      - List of books currently issued.
      - Summary of fines collected within a specific date range.
 */

package wt.may31.pkg;

import java.util.Scanner;

public class Question10 
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDAO bookDAO = new BookDAO();
        MemberDAO memberDAO = new MemberDAO();
        IssueDAO issueDAO = new IssueDAO();
        ReportDAO reportDAO = new ReportDAO();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. View All Books");
            System.out.println("5. Search Book");
            System.out.println("6. Add Member");
            System.out.println("7. Update Member");
            System.out.println("8. Delete Member");
            System.out.println("9. View All Members");
            System.out.println("10. Issue Book");
            System.out.println("11. Return Book");
            System.out.println("12. Generate Report");
            System.out.println("0. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> bookDAO.addBook();
                case 2 -> bookDAO.updateBook();
                case 3 -> bookDAO.deleteBook();
                case 4 -> bookDAO.viewAllBooks();
                case 5 -> bookDAO.searchBook();
                case 6 -> memberDAO.addMember();
                case 7 -> memberDAO.updateMember();
                case 8 -> memberDAO.deleteMember();
                case 9 -> memberDAO.viewAllMembers();
                case 10 -> issueDAO.issueBook();
                case 11 -> issueDAO.returnBook();
                case 12 -> reportDAO.generateReport();
                case 0 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Option.");
            }
        }
    }
}
