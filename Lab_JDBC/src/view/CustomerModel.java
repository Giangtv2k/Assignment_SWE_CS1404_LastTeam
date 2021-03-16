/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.Customers;
import dao.Customer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.AbstractTableModel;

public class CustomerModel extends AbstractTableModel {

    private Customers customers = null;

    public CustomerModel(Customers customers) {
        this.customers = customers;
    }

    public Customers getCustomers() {
        return this.customers;
    }

    @Override
    public int getRowCount() {
        return customers.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Customer customer = customers.get(rowIndex);
        Object obj = null;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        switch (columnIndex) {
            case 0:
                obj = customer.getCustomerID();
                break;
            case 1:
                obj = customer.getCustomerName();
                break;
            case 2:
                obj = dateFormat.format(customer.getBirhDate());
                break;
            case 3:
                obj = customer.isGender();
                break;
            case 4:
                obj = customer.getAddress();
        }
        return obj;
    }

    @Override
    public String getColumnName(int column) {
        String columnName = "";
        switch (column) {
            case 0:
                columnName = "Customer code";
                break;
            case 1:
                columnName = "Customer name";
                break;
            case 2:
                columnName = "Date of birth";
                break;
            case 3:
                columnName = "Gender";
                break;
            case 4:
                columnName = "Address";
                break;
        }
        return columnName;
    }
}
