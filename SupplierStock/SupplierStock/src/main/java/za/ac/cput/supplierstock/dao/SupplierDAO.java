/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.supplierstock.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import za.ac.cput.supplierstock.domain.Supplier;
import za.ac.cput.supplierstock.connection.DBConnection;
import za.ac.cput.supplierstock.SupplierGui;

/**
 *
 * @author Alizwa
 */
public class SupplierDAO
	//This class is responsible for CREATING,READING,UPDATING AND DELETING DATA on the DataBase
{
ResultSet rs;
int row;
 ResultSetMetaData rd;
private final Connection con;	
private PreparedStatement ps;
public SupplierDAO() throws SQLException{
	this.con= DBConnection.DerbyConnection();
}

//Creating a method to save data to the database	
public Supplier save(Supplier supplier) throws SQLException
{
	int ok;
 String insertSQL ="INSERT INTO Supplier(SupplierId, SupplierName, SupplierPhone ,SupplierEmail, SupplierAddress)"
	               +"VALUES(?,?,?,?,?)";
	try ( PreparedStatement ps = this.con.prepareStatement(insertSQL)) { 
		ps.setInt(1,supplier.getSupplierId());
		ps.setString(2,supplier.getSupplierName());
		ps.setString(3,supplier.getSupplierPhone());
		ps.setString(4,supplier.getSupplierEmail());
		ps.setString(5,supplier.getSupplierAddress());
		
		ok=ps.executeUpdate();
		if(ok>0){
			return supplier;
		}
		else {
			return null;
		}
	}
	




}
public List<Supplier> getAll() throws SQLException
{
String getAllSQL_SQL = "SELECT * FROM Supplier";
List<Supplier>suppliers = new ArrayList<>();

	 PreparedStatement ps = this.con.prepareStatement(getAllSQL_SQL);
		ResultSet rs = ps.executeQuery();
		
		
		 ResultSetMetaData rd = rs.getMetaData();
		 row = rd.getColumnCount();
	{
		
		
		if(rs !=null){
		while(rs.next())
		{
			int SupplierId = rs.getInt(1);
			String SupplierName = rs.getString(2);
			String SupplierPhone = rs.getString(3);
			String SupplierEmail = rs.getString(4);
			String SupplierAddress	= rs.getString(5);
			Supplier supplier = new Supplier(SupplierId,SupplierName, 
				SupplierPhone,SupplierEmail,SupplierAddress);
			suppliers.add(supplier);
		
		}
		rs.close();
	}
	}
	
return suppliers;

}

public void CloseResources() throws SQLException
{

this.con.close();
}
 public Supplier Update(Supplier supplier) throws SQLException
 {
int ok;

String Update = "UPDATE Supplier SET SupplierName=?, SupplierPhone =? ,SupplierEmail=?, SupplierAddress=? "
	+ "WHERE SupplierId=?";
	   	 PreparedStatement ps = this.con.prepareStatement(Update);
		 
		
		 
		ps.setInt(5,supplier.getSupplierId());
		ps.setString(1,supplier.getSupplierName());
		ps.setString(2,supplier.getSupplierPhone());
		ps.setString(3,supplier.getSupplierEmail());
		ps.setString(4,supplier.getSupplierAddress());
		
		
		ok=ps.executeUpdate();
		
		if(ok>0){
			return supplier;
		}
		else {
			return null;
		}
		
		}
 public int delete(int SupplierId)
 {
	try {
		int ok;
		String deleteSql = "DELETE FROM Supplier WHERE SupplierId =?  ";
		ps = this.con.prepareStatement(deleteSql);
		ps.setInt(1,SupplierId);
	       ok=ps.executeUpdate();
	}
	catch (SQLException ex) {
		Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
	}
	return 0;
 }

 }

