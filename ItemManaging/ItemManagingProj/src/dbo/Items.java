/*
 * Items.java: Class for a list of items
 */
package dbo;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author thopn
 */
public class Items extends Vector<Item>{
    final int SUPPLYING = 1; // Mặt hàng còn bán
    final int UNSUPPLYING = 2; // Mặt hàng đã ngừng bán

    public Items() {
        super();
    }
    
    public int find(String itemCode){
        for (int i = 0; i < this.size(); i++) {
            if(itemCode.equals(this.get(i).getItemCode())) return i;
        }
        return -1;
    }
    
    public Item FindItem(String itemCode){
        int i = this.find(itemCode);
        return i < 0 ? null : this.get(i);
    }
    
    public void loadFromDB(ItemDBAccess dbObj, Suppliers suppliers, int supply){
        String itemCode, itemName, supplierCode, unit;
        int price;
        boolean supplying;
        String sql = ""; // Lấy items từ bảng Items trong CSDL
        
        if(supply == SUPPLYING)
            sql = "SELECT * FROM Items WHERE supplying = true";
        else if(supply == UNSUPPLYING)
            sql = "SELECT * FROM Items WHERE supplying = false";
        else
            sql = "SELECT * FROM Items";
        
        try {
            ResultSet rs = dbObj.executeQuery(sql);
            while(rs.next()){
                itemCode = rs.getString(1);
                itemName = rs.getString(2);
                supplierCode = rs.getString(3);
                Supplier supplier = suppliers.findSupplier(supplierCode);
                unit = rs.getString(4);
                price = rs.getInt(5);
                supplying = rs.getBoolean(6);
                Item item = new Item(itemCode, itemName, supplier, unit, price, supplying);
                this.add(item);
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
