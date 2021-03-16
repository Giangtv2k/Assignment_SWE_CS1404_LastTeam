/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import context.DBContext;
import dao.Customers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author thopn
 */
public class MainGUI extends javax.swing.JFrame {

    //khoi tao bien cuc bo
    CustomerModel customerModel;
    Customers customers;

    public MainGUI() {
        initComponents();
        RefreshtblCustomer();
    }

    private void RefreshtblCustomer() {
        customers = new Customers();
        customers.getAllCustomer();
        customerModel = new CustomerModel(customers);
        tblCustomer.setModel(customerModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        mainTab = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtProductCode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbUnit = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAddProduct = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        btnResetProduct = new javax.swing.JButton();
        btnExitProduct = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCustomerCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDoB = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnAddCustomer = new javax.swing.JButton();
        btnUpdateCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        btnResetCustomer = new javax.swing.JButton();
        btnExitCustomer = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        mainMenu = new javax.swing.JMenuBar();
        menuAccount = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenuItem();
        menuRegister = new javax.swing.JMenuItem();
        menuDatabase = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Customer");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information of Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        jLabel6.setText("Product code");

        jLabel7.setText("Product name");

        jLabel8.setText("Unit");

        cbUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - Tỏi", "2 - Sọi", "3 - Con sâu", "4 - Thốn" }));

        jLabel9.setText("Price");

        btnAddProduct.setText("ADD");

        btnUpdateProduct.setText("UPDATE");

        btnDeleteProduct.setText("DELETE");

        btnResetProduct.setText("RESET");
        btnResetProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetProductActionPerformed(evt);
            }
        });

        btnExitProduct.setText("EXIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddProduct)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateProduct)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteProduct)
                        .addGap(18, 18, 18)
                        .addComponent(btnResetProduct)
                        .addGap(18, 18, 18)
                        .addComponent(btnExitProduct)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProductCode)
                            .addComponent(cbUnit, 0, 189, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductName)
                            .addComponent(txtPrice)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProduct)
                    .addComponent(btnUpdateProduct)
                    .addComponent(btnDeleteProduct)
                    .addComponent(btnResetProduct)
                    .addComponent(btnExitProduct))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblProduct);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainTab.addTab("Product", jPanel3);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information of Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        jLabel1.setText("Customer code");

        jLabel2.setText("Customer name");

        jLabel3.setText("Date of birth");

        txtDoB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel4.setText("Gender");

        buttonGroup1.add(rbMale);
        rbMale.setSelected(true);
        rbMale.setText("Male");

        buttonGroup1.add(rbFemale);
        rbFemale.setText("Female");

        jLabel5.setText("Address");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        btnAddCustomer.setText("ADD");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnUpdateCustomer.setText("UPDATE");
        btnUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomerActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setText("DELETE");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        btnResetCustomer.setText("RESET");
        btnResetCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCustomerActionPerformed(evt);
            }
        });

        btnExitCustomer.setText("EXIT");
        btnExitCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitCustomerActionPerformed(evt);
            }
        });

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCustomer);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResetCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExitCustomer)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCustomerCode, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(txtDoB))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbFemale)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCustomerName)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(jScrollPane3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCustomerCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCustomer)
                    .addComponent(btnUpdateCustomer)
                    .addComponent(btnDeleteCustomer)
                    .addComponent(btnResetCustomer)
                    .addComponent(btnExitCustomer))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
        );

        mainTab.addTab("Customer", jPanel1);

        menuAccount.setText("Account");

        menuLogin.setText("Login");
        menuAccount.add(menuLogin);

        menuRegister.setText("Register");
        menuAccount.add(menuRegister);

        mainMenu.add(menuAccount);

        menuDatabase.setText("Database");
        mainMenu.add(menuDatabase);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainTab, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkExist(String custId) {
        String sql = "select * from tblCustomer where CustomerID = ?";
        try {
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, custId);
            ResultSet rs = ps.executeQuery();
            if (rs.next() == true) {
                JOptionPane.showMessageDialog(this, "Customer exist.");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        return true;
    }

    private boolean validCustomer() {
        String custId = txtCustomerCode.getText().trim();
        String custName = txtCustomerName.getText().trim();
        String address = txtAddress.getText().trim();
        String dob = txtDoB.getText().trim();
        boolean gender = false;
        if (rbMale.isSelected()) {
            gender = true;
        } else {
            gender = false;
        }

        //kiem tra tinh hop le
        if (custId.length() == 0) {
            JOptionPane.showMessageDialog(this, "Customer Id not empty.");
            txtCustomerCode.requestFocus();
            return false;
        }

        if (custId.matches("^C\\d{4}$") == false) {
            JOptionPane.showMessageDialog(this, "Customer Id invalid format!");
            txtCustomerCode.requestFocus();
            return false;
        }

        if (custName.length() == 0) {
            JOptionPane.showMessageDialog(this, "Customer Name not empty.");
            txtCustomerName.requestFocus();
            return false;
        }

        if (dob.length() == 0) {
            JOptionPane.showMessageDialog(this, "DoB not empty.");
            txtDoB.requestFocus();
            return false;
        }

        return true;
    }
    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        String custId = txtCustomerCode.getText().trim();
        String custName = txtCustomerName.getText().trim();
        String address = txtAddress.getText().trim();
        String dob = txtDoB.getText().trim();
        txtCustomerCode.setEnabled(true);

        boolean gender = false;
        if (rbMale.isSelected()) {
            gender = true;
        } else {
            gender = false;
        }

        if (validCustomer() != true || checkExist(custId) == false) {
            return;
        }
        Date birth = null;
        try {
            birth = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

        try {
            String sql = "insert into tblCustomer values(?,?,?,?,?)";
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, custId);
            ps.setString(2, custName);
            ps.setBoolean(3, gender);
            ps.setString(4, address);
            java.sql.Date birthDate = new java.sql.Date(birth.getTime());
            ps.setDate(5, birthDate);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "Add success!");
                txtCustomerCode.setText("");
                txtCustomerName.setText("");
                txtAddress.setText("");
                txtDoB.setText("");
                rbMale.setSelected(true);
                txtCustomerCode.requestFocus();
                //refresh table tblCustomer
                RefreshtblCustomer();
            } else {
                JOptionPane.showMessageDialog(this, "Add fail.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        //xac dinh vi tri cua dong tren tblCustomer ma nguoi dung dang click
        int pos = tblCustomer.getSelectedRow();
        String cusId = (String) customerModel.getValueAt(pos, 0);
        txtCustomerCode.setEnabled(false);

        //c1: su dung du lieu tu tblCustomer de fill vao form
//        txtCustomerCode.setText((String)customerModel.getValueAt(pos, 0));
//        txtCustomerName.setText((String)customerModel.getValueAt(pos, 1));
//        txtAddress.setText((String)customerModel.getValueAt(pos, 2));
        //c2: try van truc tiep xuong db ---> lay Customer theo customerId
        try {
            String sql = "select * from tblCustomer where CustomerID = ?";
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cusId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //fill du lieu vao form de update
                txtCustomerCode.setText(rs.getString("CustomerID"));
                txtCustomerName.setText(rs.getString("CustomerName"));
                txtAddress.setText(rs.getString("Address"));
                if (rs.getBoolean("Gender") == true) {
                    rbMale.setSelected(true);
                } else {
                    rbFemale.setSelected(true);
                }
                txtDoB.setText(new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate("Birthdate")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed
        int pos = tblCustomer.getSelectedRow();
        if (pos >= 0) {
            String cusId = (String) customerModel.getValueAt(pos, 0);
            if (JOptionPane.showConfirmDialog(this, "Do you want to delete", "Question", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    String sql = "delete from tblCustomer where CustomerID = ?";
                    Connection con = new DBContext().getConnection();
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, cusId);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(this, "Delete success.");
                        RefreshtblCustomer();
                    } else {
                        JOptionPane.showMessageDialog(this, "Delete fail!");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a row to delete.");
        }

    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void btnExitCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitCustomerActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Do you want to exit!", "Question", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitCustomerActionPerformed

    private void btnUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomerActionPerformed
        if (validCustomer() == false) {
            return;
        }

        String custId = txtCustomerCode.getText().trim();
        String custName = txtCustomerName.getText().trim();
        String address = txtAddress.getText().trim();
        String dob = txtDoB.getText().trim();
        Date birth = null;
        try {
            birth = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        boolean gender = false;
        if (rbMale.isSelected()) {
            gender = true;
        } else {
            gender = false;
        }

        try {
            String sql = "update tblCustomer set CustomerName=?,Gender=?,Birthdate=?,Address=? where CustomerId = ?";
            Connection con = new DBContext().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(5, custId);
            ps.setString(1, custName);
            ps.setBoolean(2, gender);
            ps.setString(4, address);
            java.sql.Date birthDate = new java.sql.Date(birth.getTime());
            ps.setDate(3, birthDate);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "Update success!");
                txtCustomerCode.setText("");
                txtCustomerName.setText("");
                txtAddress.setText("");
                txtDoB.setText("");
                rbMale.setSelected(true);
                txtCustomerCode.requestFocus();
                //refresh table tblCustomer
                RefreshtblCustomer();
            } else {
                JOptionPane.showMessageDialog(this, "Update fail.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnUpdateCustomerActionPerformed

    private void btnResetProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetProductActionPerformed
        txtPrice.setText("");
        txtProductName.setText("");
        txtProductCode.setText("");
        txtProductCode.requestFocus();
        txtProductCode.setEnabled(true);
        cbUnit.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetProductActionPerformed

    private void btnResetCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCustomerActionPerformed
        txtAddress.setText("");
        txtCustomerCode.setText("");
        txtCustomerName.setText("");
        txtDoB.setText("");
        rbMale.isSelected();
        txtCustomerCode.requestFocus();
        txtCustomerCode.setEnabled(true);
    }//GEN-LAST:event_btnResetCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnExitCustomer;
    private javax.swing.JButton btnExitProduct;
    private javax.swing.JButton btnResetCustomer;
    private javax.swing.JButton btnResetProduct;
    private javax.swing.JButton btnUpdateCustomer;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JTabbedPane mainTab;
    private javax.swing.JMenu menuAccount;
    private javax.swing.JMenu menuDatabase;
    private javax.swing.JMenuItem menuLogin;
    private javax.swing.JMenuItem menuRegister;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCustomerCode;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JFormattedTextField txtDoB;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductCode;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
