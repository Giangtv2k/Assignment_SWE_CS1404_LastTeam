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
public class Users extends Vector<User> {

    public Users() {
        super();
    }

    public void getAllUser() {
        String account, pass, name, address;
        boolean gender;
        Date dateOfBirth;
        String sql = "SELECT * FROM tblUser";
        try {
            // Tao doi tuong ket noi CSDL
            Connection con = new DBContext().getConnection();
            // Tao doi tuong thuc thi trtuy van
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                account = rs.getString("account");
                pass = rs.getString("pass");
                name = rs.getString("name");
                gender = rs.getBoolean("gender");
                address = rs.getString("address");
                dateOfBirth = rs.getDate("dateofbirth");
                User user = new User(account, pass, name, address, gender, dateOfBirth);
                this.add(user);
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
