package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;


public class Products extends Vector<Product>{

    public Products() {
        super();
    }
    
    public void getAllProduct(){
        String productId, productName, unit, categoryId;
        int price, quantity;
        boolean discontinued;
        Date createDate;
        Categories categories = new Categories();
        
        String sql = "select * from Products";
        try {
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                productId = rs.getString("ProductId");
                productName = rs.getString("ProductName");
                unit = rs.getString("Unit");
                price = rs.getInt("Price");
                quantity = rs.getInt("Quantity");
                discontinued = rs.getBoolean("Discontinued");
                createDate = rs.getDate("CreateDate");
                categoryId = rs.getString("CategoryId");
                //khai báo 1 category
                Category category = categories.getCategoryById(categoryId);
                Product product = new Product(productId, productName, unit, price, quantity, discontinued, createDate, category);
                this.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
