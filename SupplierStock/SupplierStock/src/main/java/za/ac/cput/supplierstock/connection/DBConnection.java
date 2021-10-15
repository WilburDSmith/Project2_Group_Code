/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.supplierstock.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Alizwa Solibanzi
 */
public class DBConnection 
{
	public static Connection DerbyConnection() throws SQLException
	{
	String url="jdbc:derby://localhost:1527/StockManagement";
	String user="SupplierStock";
        String password="12345";
	return DriverManager.getConnection(url, user, password);
 
	}
	
}
