package view;


import javax.swing.table.AbstractTableModel;
import dbo.*;
/*
 * ItemFullModel.java: Class for table model of items
 */

/**
 *
 * @author thopn
 */
public class ItemFullModel extends AbstractTableModel{
    private Items items = null;

    public ItemFullModel(Items items) {
        this.items = items;
    }

    public Items getItems() {
        return items;
    }
    
    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int column){
        String columnName = "";
        switch(column){
            case 0: columnName = "Code"; break;
            case 1: columnName = "Name"; break;
            case 2: columnName = "Supplier"; break;
            case 3: columnName = "Unit"; break;
            case 4: columnName = "Price"; break;
            case 5: columnName = "Supply"; break;
        }
        return columnName;
    }
    
    @Override
    public Object getValueAt(int row, int colum){
        Item item = items.get(row);
        Object obj = null;
        switch(colum){
            case 0: obj = item.getItemCode(); break;
            case 1: obj = item.getItemName(); break;
            case 2: obj = item.getSupplier().getSupCode(); break;
            case 3: obj = item.getUnit(); break;
            case 4: obj = item.getPrice(); break;
            case 5: obj = item.isSupplying(); break;
        }
        return obj;
    }
    
}
