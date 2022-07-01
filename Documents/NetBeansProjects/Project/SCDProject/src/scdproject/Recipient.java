/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scdproject;

/**
 *
 * @author Hp
 */
public class Recipient 
{
    private String name;
    private String phoneNumber;
    private String bloodGroup;
    private int bloodQuantity;

    public Recipient(String name, String phoneNumber, String bloodGroup, int bloodQuantity) 
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.bloodGroup = bloodGroup;
        this.bloodQuantity = bloodQuantity;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getBloodGroup() 
    {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) 
    {
        this.bloodGroup = bloodGroup;
    }

    public int getBloodQuantity() 
    {
        return bloodQuantity;
    }

    public void setBloodQuantity(int bloodQuantity) 
    {
        this.bloodQuantity = bloodQuantity;
    }
    
    
}
