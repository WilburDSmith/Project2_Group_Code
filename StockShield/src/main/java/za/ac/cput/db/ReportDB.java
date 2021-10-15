/**
 * This code is to connect the program to the database
 * @author Wilbur Smith
 */
package za.ac.cput.db;

import java.sql.*;


public class ReportDB 
{
    public static Connection DerbyConnection() throws SQLException
    {
            String dbURL = "jdbc:derby://localhost:1527/StockShield";
            String username = "StockShield";
            String password = "StockShield123456789";

           return DriverManager.getConnection(dbURL, username, password);     
    }
}
