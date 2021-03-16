/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Customers extends Vector<Customer>{

    public Customers() {
        super();
    }
    public  void getAllCustomer(){
        String id, name, address;
        boolean gender;
        Date dob;
        
        try {
            String sql = "select * from tblCustomer";
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                id = rs.getString("CustomerID");
                name = rs.getString("CustomerName");
                address = rs.getString("Address");
                gender = rs.getBoolean("Gender");
                dob = rs.getDate("BirthDate");
                
                //khoi tao doi tuong co kieu customer
                Customer cust = new Customer(id, name, address, gender, dob);
                //them cust vao vector
                this.add(cust);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
