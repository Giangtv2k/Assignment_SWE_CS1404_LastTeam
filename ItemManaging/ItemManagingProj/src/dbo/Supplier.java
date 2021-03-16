/*
 * Supplier: Class for a Supplier
 */
package dbo;

/**
 *
 * @author thopn
 */
public class Supplier {
    private String supCode = "", supName = "", address = "";
    private boolean colloborating = true;

    public Supplier() {
    }
    
    public Supplier(String supCode, String supName, String address, boolean colloborating){
        this.supCode = supCode;
        this.supName = supName;
        this.address = address;
        this.colloborating = colloborating;
    }

    public String getSupCode() {
        return supCode;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isColloborating() {
        return colloborating;
    }

    public void setColloborating(boolean colloborating) {
        this.colloborating = colloborating;
    }

    @Override
    public String toString() {
        return supCode + "-" + supName;
    }
}
