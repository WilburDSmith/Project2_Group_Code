/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.supplierstock.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import za.ac.cput.supplierstock.StockGui;
import za.ac.cput.supplierstock.connection.DBConnection;
import za.ac.cput.supplierstock.domain.Stock;
import za.ac.cput.supplierstock.domain.Supplier;

/**
 *
 * @author Alizwa Solibanzi
 */
public class StockDAO
{
ResultSet rs;
ResultSetMetaData rd;
int row;
int ok;
private PreparedStatement ps;
private Connection con;
public StockDAO() throws SQLException
{
this.con = DBConnection.DerbyConnection();
}
public Stock save(Stock stock) throws SQLException
{
	
		int ok;
 String insertSQL ="INSERT INTO STOCK(StockId, StockName, StockType,StockDescription,StockQuantity,StockLocation )"
	               +"VALUES(?,?,?,?,?,?)";
		
		ps = this.con.prepareStatement( insertSQL);
		ps.setInt(1, stock.getStockId());
		ps.setString(2, stock.getStockName());
		ps.setString(3, stock.getStockType());
		ps.setString(4, stock.getStockDescription());
		ps.setString(5, stock.getStockQuantity());
		ps.setString(6, stock.getStockLocation());
		
		ok =ps.executeUpdate();
		if(ok>0){
			return stock;
		}else
			return null;
	} 


 
public List<Stock> getAll() 
{
String getAll ="SELECT* FROM Stock";
List<Stock>stockList = new ArrayList<>();
	try {
		
		
		
		ps = this.con.prepareStatement(getAll);
		rs = ps.executeQuery();
		rd =rs.getMetaData();
		row =rd.getColumnCount();
		
		if(rs!=null){
		while(rs.next())
		{
        int StockId = rs.getInt(1);
	 String StockName = rs.getString(2);
	 String StockType  = rs.getString(3);
	 String  StockDescription= rs.getString(4);
	 String StockQuantity = rs.getString(5);
	 String StockLocation = rs.getString(6);
	 
	 Stock stock = new Stock(StockId,StockName,StockType,StockDescription,
		 StockQuantity,StockLocation);
	 stockList.add(stock);
		
		}
		}
		rs.close();
	} catch (SQLException ex) {
		Logger.getLogger(StockDAO.class.getName()).log(Level.SEVERE, null, ex);
	}
	return stockList;

}

public int Delete(int StockId ) throws SQLException
{
String delete ="DELETE FROM Stock WHERE StockId=?";
ps = this.con.prepareStatement(delete);
ps.setInt(1,StockId );
 ok =ps.executeUpdate();
	return 0;

}
public Stock Update(Stock stock)
{
	try {
String update ="UPDATE Stock SET StockName=?, StockType =? ,StockDescription=?, StockQuantity=?,StockLocation=? "
	+ "WHERE StockId=?";
		
		ps = this.con.prepareStatement(update);
		
		ps.setInt(6, stock.getStockId());
		ps.setString(1, stock.getStockName());
		ps.setString(2, stock.getStockType());
		ps.setString(3, stock.getStockDescription());
		ps.setString(4, stock.getStockQuantity());
		ps.setString(5, stock.getStockLocation());
		
		ok =ps.executeUpdate();
		
		
	} catch (SQLException ex) {
		Logger.getLogger(StockDAO.class.getName()).log(Level.SEVERE, null, ex);
	}
	return stock;

}
public void close() throws SQLException
{
this.con.close();
rs.close();

}

}
