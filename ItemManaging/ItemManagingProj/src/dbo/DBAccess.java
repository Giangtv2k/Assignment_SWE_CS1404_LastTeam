/**
 * DBAccess.java - Class for database accessing
 * Operations: inset, update, delete are encapsulated
 */
package dbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author thopn
 */
public class DBAccess {
    // Khai báo đối tượng kết nối
    Connection con = null;
    // Khai báo đối tượng cho phép thực thi truy vấn SQL và trả về kết qủa
    Statement stmt = null;
    
    public DBAccess(){}
    
    public void connectDB(String driver, String url){
        try{
            Class.forName(driver); // Nạp Driver
            con = DriverManager.getConnection(url); // Kết nối tới CSDL
            stmt = con.createStatement();
        } catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void connectDB(String driver, String url, String uid, String pwd){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, uid, pwd);
            stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ResultSet executeQuery(String selectSql){
        if(con == null) return null;
        try {
            return (stmt.executeQuery(selectSql));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public int executeUpdate(String updateSql){
        if(con == null) return 0;
        try {
            return (stmt.executeUpdate(updateSql));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
}
