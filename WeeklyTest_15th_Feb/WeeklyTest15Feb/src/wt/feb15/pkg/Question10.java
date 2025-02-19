/*
 10. Create a class DatabaseConnection with a static block that prints "Database Connected" only once when the 
 class is loaded. Create multiple objects and observe the output.
 */

package wt.feb15.pkg;


class DatabaseConnection
{
	static 
	{
		System.out.println("Database Connected");
	}
}
public class Question10 {
	public static void main(String[] args) {
		DatabaseConnection ob = new DatabaseConnection();
		DatabaseConnection ob1 = new DatabaseConnection();
		DatabaseConnection ob2 = new DatabaseConnection();
		DatabaseConnection ob3 = new DatabaseConnection();
	}
	
}
