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
public class Donor 
{
    private String name;
    private String phoneNumber;
    private String bloodGroup;
    private String healthStatus;
    private int bloodQuantity;

    public Donor(String name, String phoneNumber, String bloodGroup, String healthStatus, int bloodQuantity) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.bloodGroup = bloodGroup;
        this.healthStatus = healthStatus;
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

    public String getHealthStatus() 
    {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) 
    {
        this.healthStatus = healthStatus;
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
