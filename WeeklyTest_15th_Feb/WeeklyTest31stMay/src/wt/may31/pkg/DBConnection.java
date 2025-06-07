package wt.may31.pkg;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
    private static final String URL = "jdbc:mysql://localhost:3306/dec_java_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Shubham@15";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL 8+ driver
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
