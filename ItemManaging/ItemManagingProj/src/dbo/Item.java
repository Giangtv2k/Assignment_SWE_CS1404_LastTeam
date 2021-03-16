/*
 * Item.java: Class for an item
 */
package dbo;

/**
 *
 * @author thopn
 */
public class Item {
    private String itemCode = "", itemName = "", unit = "";
    private Supplier supplier = null;
    private int price = 0;
    private boolean supplying = false;

    public Item() {
    }
    
    public Item(String itemCode, String itemName, Supplier supplier, String unit, int price, boolean supplying){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.supplier = supplier;
        this.unit = unit;
        this.price = price;
        this.supplying = supplying;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSupplying() {
        return supplying;
    }

    public void setSupplying(boolean supplying) {
        this.supplying = supplying;
    }
}
