/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.shellstock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Sinethemba Sithela(219112940)
 */
public class Item {
    int id;
    String name;
    String quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public Connection connect() throws Exception{
        Connection con = null;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/Stock";
        con = DriverManager.getConnection(url,"Shell","shell");
        if(con!=null){
            System.out.println("Connected to the database");
        }
        
        return con;
    } 
    public void insert() throws Exception {
        Connection con = connect();
        PreparedStatement pst;
        String sql;
        sql = "select max(item_id) from Item";
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            id = rs.getInt(1);
        }
        id++;
        
        sql = "insert into Item values (?,?,?)";
        pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setString(3, quantity);
        pst.executeUpdate();
    }
    
    public void update() throws Exception{
        Connection con = connect();
        PreparedStatement pst;
        String sql;
        sql = "update Item set item_name=?,item_quantity=? where item_id=?";
        pst = con.prepareStatement(sql);
        pst.setString(1, name);
        pst.setString(2, quantity);
        pst.setInt(3, id);
        pst.executeUpdate();
    }
    public void delete() throws Exception{
        Connection con = connect();
        PreparedStatement pst;
        String sql = "delete from Item where item_id=?";
        pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeUpdate();
    }
    public ResultSet display() throws Exception{
        Connection con = connect();
        String sql;
        ResultSet rs;
        PreparedStatement pst;
        sql = "select * from Item";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
   
}
