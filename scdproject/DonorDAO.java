/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scdproject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class DonorDAO 
{
    Connection c;
    Statement st;
    ResultSet rs;
    
    public DonorDAO() throws SQLException
    {
         try {
            //driverIP Address
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","");
            st = c.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DonorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addDonor(Donor D)
    {
        String q = " INSERT INTO donor Values (?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = c.prepareStatement(q);
        
             ps.setString(1, D.getName());
             ps.setString(2, D.getPhoneNumber());
             ps.setString(3, D.getBloodGroup());
             ps.setString(4, D.getHealthStatus());
             ps.setInt(5, D.getBloodQuantity());  
             ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DonorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet displayDonor(String name)
    {
        String q = " SELECT * FROM donor WHERE Name = ? ";
        PreparedStatement ps;
        try {
            ps = c.prepareStatement(q);
            ps.setString(1, name); 
            rs = ps.executeQuery();    
        } catch (SQLException ex) {
            Logger.getLogger(DonorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
