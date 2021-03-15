package view;

import dao.Categories;
import dao.Category;
import javax.swing.table.AbstractTableModel;

public class CategoryModel extends AbstractTableModel{
    private Categories categories = null;
    
    public CategoryModel(Categories categories){
        this.categories = categories;
    }
    
    public Categories getCategories(){
        return this.categories;
    }

    @Override
    public int getRowCount() {
        return categories.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Category category = categories.get(rowIndex);
        Object obj = null;
        switch(columnIndex){
            case 0: obj = category.getCategoryId(); break;
            case 1: obj = category.getCategoryName(); break;
            case 2: obj = category.getDescription(); break;
        }
        return obj;
    }
    
    @Override
    public String getColumnName(int column){
        String columnName = "";
        switch(column){
            case 0: columnName = "Category ID"; break;
            case 1: columnName = "Category name"; break;
            case 2: columnName = "Description"; break;
        }
        return columnName;
    }
    
    
}
