/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fptu.prj3111.customtable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class CustomTableModel extends javax.swing.JFrame {

    String fileName = "src\\fptu\\prj3111\\customtable\\Employees1.txt";
    
    Vector<String> header = new Vector<String>();
    Vector data = new Vector();
    boolean addNew = false;
    boolean changed = false;
    
    private void loadData() {
        try {
            //khai bao 1 doi tuong file
            File file = new File(fileName);
            //khai bao 1 doi tuong file reader cho hoat dong doc du lieu tu file
            FileReader fr = new FileReader(file);
            //khai bao 1 doi tuong BufferedReader de doc du lieu vtu Buffe vao chuong trinh
            BufferedReader br = new BufferedReader(fr);
            //tien hanh doc du lieu trong file theo tung dong
            String aDetails;
            while ((aDetails = br.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(aDetails, ";");
                String code = stk.nextToken();
                String name = stk.nextToken();
                String Adress = stk.nextToken();
                String Sex = stk.nextToken();
                String salary = stk.nextToken();
                //tao 1 vector sau khi doc du lieu tren tung dong
                Vector v = new Vector();
                v.add(null);
                v.add(code);
                v.add(name);
                v.add(Adress);
                v.add(Sex);
                v.add(salary);
                //them vector vao data
                data.add(v);
            }
        } catch (FileNotFoundException ex1) {
            JOptionPane.showMessageDialog(this, "File not found!");
        } catch (IOException ex2) {
            JOptionPane.showMessageDialog(this, "Cant read file!");
        }
    }
    public CustomTableModel() {
        
        initComponents();
        header.add("Select");
        header.add("Code");
        header.add("Name");
        header.add("Adress");
        header.add("Sex");
        header.add("Salary");
        
        loadData();

        DefaultTableModel tableModel;
        tableModel = (DefaultTableModel) tblEmployee.getModel();

        //fill du lieu vao tableModel
        tableModel.setDataVector(data, header);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "", "Title 6", "Title 7"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Details"));

        jLabel2.setText("Code:");

        jLabel3.setText("Name:");

        jLabel4.setText("Adress:");

        jLabel5.setText("Sex:");

        jLabel6.setText("Salary:");

        buttonGroup1.add(rbMale);
        rbMale.setText("Male");

        buttonGroup1.add(rbFemale);
        rbFemale.setText("Female");

        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSalary)
                                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbMale, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtAdress))))
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnNew))
                .addGap(54, 54, 54))
        );

        jLabel1.setText("Employee List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked
        addNew = true;
        txtCode.setEnabled(true);
        txtCode.setEditable(true);
        txtCode.setText(null);
        txtName.setText(null);
        rbMale.setSelected(true);
        txtAdress.setText(null);
        txtSalary.setText(null);
        txtCode.requestFocus();
    }//GEN-LAST:event_btnNewMouseClicked

    private boolean valid() {
        String s = "";
        if (true) {
            s = txtCode.getText().trim().toUpperCase();
            txtCode.setText(s);
            //kiem tra code theo dung dinh dang hay chua 
            if (!s.matches("^E\\d{3}$")) {
                JOptionPane.showMessageDialog(this, "Code format: E000");
                return false;
            }
            //kiem tra trung lap cua code
            for (int i = 0; i < data.size(); i++) {
                //lay tung ban ghi trong data theo vi tri
                Vector v = (Vector) data.get(i);
                //so sanh gia tri tren txtCode co trung voi phan tu dau tien trong data 
                if (s.equalsIgnoreCase((String) v.get(1))) {
                    JOptionPane.showMessageDialog(this, "Code duplicated!");
                    txtCode.requestFocus();
                    return false;
                }
            }
            //kiem tra ten khong duoc de trong
            if (txtName.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Name is required");
                return false;
            }

            if (txtAdress.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Adress is required");
                return false;
            }
            
            if (!txtSalary.getText().trim().matches("^\\d+$")) {
                JOptionPane.showMessageDialog(this, "Salary is an interger");
                return false;
            }       
        }
        return true;
    }
    
    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        if (!valid()) {
            return;
        }
        if (addNew == true) {
            boolean s = false;
            String code = txtCode.getText().trim();
            String name = txtName.getText().trim();
            String Adress = txtAdress.getText().trim();
            String Sex = buttonGroup1.toString();
            String saraly = txtSalary.getText().trim();
            Vector v = new Vector();
            v.add(s);
            v.add(code);
            v.add(name);
            v.add(Adress);
            v.add(Sex);
            v.add(saraly);
            data.add(v);
        } else {
            //update lai du lieu cho tblEmployees
        }

        //refresh lai tblEmployees
        tblEmployee.updateUI();
        changed = true;
    }//GEN-LAST:event_btnSaveMouseClicked

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        int row = this.tblEmployee.getSelectedRow();
        this.txtCode.setText((String) (tblEmployee.getValueAt(row, 1)));
        this.txtCode.setEditable(false);
        this.txtName.setText((String) (tblEmployee.getValueAt(row, 2)));
        this.txtAdress.setText((String) (tblEmployee.getValueAt(row, 3)));
        this.txtSalary.setText((String) (tblEmployee.getValueAt(row, 5)));
        addNew = false;
    }//GEN-LAST:event_tblEmployeeMouseClicked

    private void tblEmployeeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseReleased
        if (this.tblEmployee.isEditing()) {
            int row = tblEmployee.getSelectedRow();
            int column = tblEmployee.getSelectedColumn();
            tblEmployee.getCellEditor(row, column).cancelCellEditing();
        }
    }//GEN-LAST:event_tblEmployeeMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomTableModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomTableModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomTableModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomTableModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomTableModel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
