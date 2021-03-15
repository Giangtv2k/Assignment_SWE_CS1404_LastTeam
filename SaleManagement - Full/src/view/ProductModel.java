package view;

import dao.Product;
import dao.Products;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.AbstractTableModel;

public class ProductModel extends AbstractTableModel {

    private Products products = null;

    public ProductModel(Products products) {
        this.products = products;
    }

    public Products getProducts() {
        return this.products;
    }

    @Override
    public int getRowCount() {
        return products.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Product product = products.get(rowIndex);
        Object obj = null;
        //Định dạng dữ liệu sẽ hiển thị lên tblProduct
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        switch (columnIndex) {
            case 0:
                obj = product.getProductId();
                break;
            case 1:
                obj = product.getProductName();
                break;
            case 2:
                obj = product.getUnit();
                break;
            case 3:
                obj = product.getPrice();
                break;
            case 4:
                obj = product.getQuantity();
                break;
            case 5:
                obj = product.isDiscontinued();
                break;
            case 6:
                obj = dateFormat.format(product.getCreateDate());
                break;
            case 7:
                obj = product.getCategory().getCategoryName();
                break;
        }
        return obj;
    }

}
