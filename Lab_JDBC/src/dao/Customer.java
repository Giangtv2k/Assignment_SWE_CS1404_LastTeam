/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;

/**
 *
 * @author Jacky
 */
public class Customer {
    
    private String customerID,pass, customerName, address;
    private boolean gender;
    private Date birhDate;

    public Customer() {
    }

    public Customer(String customerID, String pass, String customerName, String address, boolean gender, Date birhDate) {
        this.customerID = customerID;
        this.pass = pass;
        this.customerName = customerName;
        this.address = address;
        this.gender = gender;
        this.birhDate = birhDate;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirhDate() {
        return birhDate;
    }

    public void setBirhDate(Date birhDate) {
        this.birhDate = birhDate;
    }
}
