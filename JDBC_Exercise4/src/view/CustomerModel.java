/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.Customer;
import dao.Customers;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hp
 */
public class CustomerModel extends AbstractTableModel{

    public Customers customers = null;

    public CustomerModel(Customers cus) {
        this.customers = cus;
    }
    
    
    @Override
    public int getRowCount() {
        return this.customers.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Customer customer = customers.get(rowIndex);
        Object obj = null;
        switch (columnIndex) {
            case 0: obj = customer.getId(); break;
            case 1: obj = customer.getName(); break;
            case 2:
                String gender = customer.isGender() == true ? "Male" : "Female";
                obj = gender; break;
            case 3: obj = new SimpleDateFormat("dd/MM/yyyy").format(customer.getDate()); break;
            case 4: obj = customer.getAddress(); break;
        }
        return obj;
    }

    @Override
    public String getColumnName(int column) {
        String columnName = "";
        switch (column) {
            case 0: columnName = "ID"; break;
            case 1: columnName = "Name"; break;
            case 2: columnName = "Gender"; break;
            case 3: columnName = "Birth"; break;
            case 4: columnName = "Address"; break;
        }
        return columnName;
    }
    
}
