/*
 * @Author Wilbur Deano Smith (220003033)
 */
package za.ac.cput.dao;

import java.sql.*;
import java.util.*;
import za.ac.cput.db.ReportDB;
import za.ac.cput.stockshield.Report;
import za.ac.cput.stockshield.ReportGUI;

public class ReportDAO 
{
    ResultSet rs;
    private PreparedStatement ps;
    private Connection con;

    public ReportDAO() throws SQLException
    {
        this.con = ReportDB.DerbyConnection();
    }
    
    public ArrayList<Report> getAll()
    {
        String getAll = "SELECT * FROM Stock";
        
        ArrayList<Report> reportList = new ArrayList<>();
        
        try 
        {
		ps = this.con.prepareStatement(getAll);
		rs = ps.executeQuery();
		
		if(rs!=null)
                {
                    while(rs.next())
                    {
                        int itemPrice = rs.getInt(1);
                        String itemDescription = rs.getString(2);
                        int amountInStock = rs.getInt(3);
                        
                        Report report = new Report(itemPrice, itemDescription, amountInStock);
                        
                        reportList.add(report);
                    }
                    rs.close();
                }
		
        }
        catch (SQLException ex)
        {
            System.out.println("Exception" + ex);
        }
        
        return reportList;
    }
    
    public void close() throws SQLException
    {
        this.con.close();
        rs.close();
    }
    
}
