/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scdproject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class DonorController 
{
     private DonorDAO obj;
    public DonorController(){
    
        try {
            obj= new DonorDAO();
        } catch (SQLException ex) {
            Logger.getLogger(DonorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void createDonor(Donor D)
    {
        obj.addDonor(D);    
    }
    
    public ResultSet searchDonor(String name)
    {
        ResultSet rs;
        rs = obj.displayDonor(name);
        return rs;
    }
}
