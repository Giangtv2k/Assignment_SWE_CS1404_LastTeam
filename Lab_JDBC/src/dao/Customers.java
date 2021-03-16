/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacky
 */
public class Customers extends Vector<Customer> {

    public Customers() {
        super();
    }

    public void gettAllCustomer() {
        String customerID, customerName, address;
        boolean gender;
        Date birhDate;
        String sql = "SELECT * FROM tblCustomer";
        try {
            // Tao doi tuong ket noi CSDL
            Connection con = new DBContext().getConnection();
            // Tao doi tuong thuc thi trtuy van
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                customerID = rs.getString("CustomerID");
                customerName = rs.getString("CustomerName");
                gender = rs.getBoolean("Gender");
                address = rs.getString("Address");
                birhDate = rs.getDate("Birthdate");
                Customer customer = new Customer(customerID, customerName, address, gender, birhDate);
                this.add(customer);
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public int updateCustomer(Customer customer, int operator) {
        String sql = "";
        int count = 0;
        if (operator == 1) {
            sql = "INSERT INTO tblUser(account, pass, name,gender,address,dateofbirth) VALUES(?, ?, ?,?,?,?)";
        }
        if (operator == 2) {
            sql = "UPDATE tblCustomer SET CustomerName =?, Gender=?, Address=?, Birthdate =?, WHERE CustomerID =?";
        }
        try {
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customer.getCustomerName());
            ps.setBoolean(2, customer.isGender());
            ps.setString(3, customer.getAddress());
            ps.setDate(4, customer.getBirhDate());
            count = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return count;
    }
    
    public int addCustomer(Customer customer, int operator) {
        String sql = "";
        int count = 0;
        if (operator == 1) {
            sql = "INSERT INTO tblUser(account, pass, name,gender,address,dateofbirth) VALUES(?, ?, ?,?,?,?)";
        }
        try {
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customer.getCustomerID());
            ps.setString(2, customer.getPass());
            ps.setString(3, customer.getCustomerName());
            ps.setBoolean(4, customer.isGender());
            ps.setString(5, customer.getAddress());
            ps.setDate(6, customer.getBirhDate());
            count = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return count;
    }
    
    public int deleteCustomer(String customerID) {
        String sql = "DELETE FROM tblCustomer WHERE CustomerID =?";
        int count = 0;
        try {
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customerID);
            count = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return count;
    }
}
