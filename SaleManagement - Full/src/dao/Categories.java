package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Categories extends Vector<Category>{
    public Categories(){
        super();
    }
    
    // Phuong thuc lay tat ca du lieu tu bang Categories
    public void getAllCategory(){
        String catId, catName, desc;
        String sql = "SELECT * FROM Categories";
        try{
            // Tao doi tuong ket noi CSDL
            Connection con = new DBContext().getConnection();
            // Tao doi tuong thuc thi truy van
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                catId = rs.getString("CategoryId");
                catName = rs.getString("CategoryName");
                desc = rs.getString("Description");
                Category category = new Category(catId, catName, desc);
                this.add(category);
            }
            rs.close();
            con.close();
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void getCategoryByName(String searchVal){
        String sql = "Select * from Categories where CategoryName like ?";
         String catId, catName, desc;
         try{
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,searchVal + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                catId = rs.getString("CategoryId");
                catName = rs.getString("CategoryName");
                desc = rs.getString("Description");
                Category category = new Category(catId, catName, desc);
                this.add(category);
            }
            rs.close();
            con.close();
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public Category getCategoryById(String categoryId){
        String sql = "select * from Categories where CategoryId = ?";
        try {
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categoryId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Category category = new Category();
                category.setCategoryId(rs.getString("CategoryId"));
                category.setCategoryName(rs.getString("CategoryName"));
                category.setDescription(rs.getString("Description"));
                return category;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public int addUpdateCategory(Category category, int operator){
        int count = 0;
        String sql = "";
        if(operator == 2){ // Thuc hien Update
            sql = "UPDATE Categories SET CategoryName=?, Description=? WHERE CategoryId=?";
        }
        if(operator == 1){ // Thuc hien them moi
            sql = "INSERT INTO Categories(CategoryName, Description, CategoryId) VALUES(?, ?, ?)";
        }
        
        try {
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, category.getCategoryName());
            ps.setString(2, category.getDescription());
            ps.setString(3, category.getCategoryId());
            
            count = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return count;
    }
    
    public int deleteCategory(String catId){
        int count = 0;
        String sql = "Delete from Categories where CategoryId = ?";
        try {
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, catId);
            count = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return count;
    }
    
    
}
