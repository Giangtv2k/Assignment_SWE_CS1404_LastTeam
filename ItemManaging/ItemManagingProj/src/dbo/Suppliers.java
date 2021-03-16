/*
 * Suppliers.java: Class for a list of suppliers
 */
package dbo;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author thopn
 */
public class Suppliers extends Vector<Supplier>{

    public Suppliers() {
        super();
    }
    
    public int find(String supCode){
        for (int i = 0; i < this.size(); i++) {
            if(supCode.equals(this.get(i).getSupCode())) 
                return i;
        }
        return -1;
    }
    
    public Supplier findSupplier(String supCode){
        int i = this.find(supCode);
        return i < 0 ? null : this.get(i);
    }
    
    public void loadFromDB(ItemDBAccess dbObj){
        String supCode, supName, address;
        boolean colloborating;
        
        // Get suppliers từ bảng Suppliers trong CSDL
        String sql = "SELECT * FROM Suppliers";
        try {
            ResultSet rs = dbObj.executeQuery(sql);
            while(rs.next()){
                supCode = rs.getString(1); // Chỉ số cột bắt đầu từ 1
                supName = rs.getString(2);
                address = rs.getString(3);
                colloborating = rs.getBoolean(4);
                Supplier supplier = new Supplier(supCode, supName, address, colloborating);
                this.add(supplier);
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
