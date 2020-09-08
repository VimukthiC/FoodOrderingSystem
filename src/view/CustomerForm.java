
package view;

import controller.CustomerFormController;
import dto.CustomerDTO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerForm extends javax.swing.JFrame {


    public CustomerForm() {
        initComponents();
        loadAllCustomers();
        table();
        mouseClickedAndReleased();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblOrderdetailes = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblFoodManage = new javax.swing.JLabel();
        lblOrder = new javax.swing.JLabel();
        lblCustomerDetailes = new javax.swing.JLabel();
        lblCustimerRegistration = new javax.swing.JLabel();
        pnlSet = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtCusNIC = new javax.swing.JTextField();
        txtCusID = new javax.swing.JTextField();
        txtCusName = new javax.swing.JTextField();
        txtCusAddress = new javax.swing.JTextField();
        txtCusPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCusSalary = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddCustomer = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/foodlogo.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 160));

        lblOrderdetailes.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblOrderdetailes.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderdetailes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Numbered_List_45px.png"))); // NOI18N
        lblOrderdetailes.setText("    ORDER DETAILES");
        jPanel2.add(lblOrderdetailes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 210, 70));

        lblHome.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Home_45px_1.png"))); // NOI18N
        lblHome.setText("    HOME");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });
        jPanel2.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 70));

        lblFoodManage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblFoodManage.setForeground(new java.awt.Color(255, 255, 255));
        lblFoodManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Hamburger_45px_1.png"))); // NOI18N
        lblFoodManage.setText("    FOOD MANAGE");
        lblFoodManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFoodManageMouseClicked(evt);
            }
        });
        jPanel2.add(lblFoodManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 210, 70));

        lblOrder.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblOrder.setForeground(new java.awt.Color(255, 255, 255));
        lblOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Shopping_Cart_45px.png"))); // NOI18N
        lblOrder.setText("    ORDER");
        lblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderMouseClicked(evt);
            }
        });
        jPanel2.add(lblOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, 70));

        lblCustomerDetailes.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCustomerDetailes.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerDetailes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_User_Account_45px_1.png"))); // NOI18N
        lblCustomerDetailes.setText("    CUSTOMER DETAILES");
        jPanel2.add(lblCustomerDetailes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 210, 70));

        lblCustimerRegistration.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCustimerRegistration.setForeground(new java.awt.Color(255, 255, 255));
        lblCustimerRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Registration_45px.png"))); // NOI18N
        lblCustimerRegistration.setText("    CUSTOMER REGISTRA");
        jPanel2.add(lblCustimerRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 720));

        pnlSet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("NIC");
        pnlSet.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 50, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("ADD CUSTOMER ");
        pnlSet.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 360, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("NAME");
        pnlSet.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 70, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("PHONE");
        pnlSet.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("ADDRESS");
        pnlSet.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("CUSTOMER ID");
        pnlSet.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 160, 40));

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlSet.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 90, 30));

        txtCusNIC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCusNIC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        txtCusNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusNICActionPerformed(evt);
            }
        });
        pnlSet.add(txtCusNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 340, 30));

        txtCusID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCusID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        txtCusID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusIDActionPerformed(evt);
            }
        });
        pnlSet.add(txtCusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 340, 30));

        txtCusName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCusName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        txtCusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusNameActionPerformed(evt);
            }
        });
        pnlSet.add(txtCusName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 340, 30));

        txtCusAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCusAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        txtCusAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusAddressActionPerformed(evt);
            }
        });
        pnlSet.add(txtCusAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 340, 30));

        txtCusPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCusPhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        txtCusPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusPhoneActionPerformed(evt);
            }
        });
        pnlSet.add(txtCusPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 340, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("SALARY");
        pnlSet.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 70, 40));

        txtCusSalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCusSalary.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        txtCusSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusSalaryActionPerformed(evt);
            }
        });
        pnlSet.add(txtCusSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 340, 30));

        tblAddCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblAddCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER ID", "NAME", "ADDRESS", "PHONE", "NIC", "SALARY"
            }
        ));
        tblAddCustomer.setFocusable(false);
        tblAddCustomer.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblAddCustomer.setRowHeight(20);
        tblAddCustomer.setSelectionBackground(new java.awt.Color(191, 116, 205));
        tblAddCustomer.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblAddCustomer);

        pnlSet.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 840, 270));

        jButton2.setBackground(new java.awt.Color(51, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlSet.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 90, 30));

        jButton3.setBackground(new java.awt.Color(51, 0, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnlSet.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 90, 30));

        jButton4.setBackground(new java.awt.Color(51, 0, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlSet.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 90, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/customerPanelImage.jpg"))); // NOI18N
        pnlSet.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 720));

        jPanel1.add(pnlSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1070, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked

    }//GEN-LAST:event_lblHomeMouseClicked

    private void txtCusNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusNICActionPerformed

    private void txtCusIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusIDActionPerformed
       
        try {
            
            String customerID = txtCusID.getText();
            
            CustomerDTO searchCustomer = new CustomerFormController().searchCustomer(customerID);
            if (searchCustomer != null) {
                txtCusID.setText(searchCustomer.getCustomerID());
                txtCusName.setText(searchCustomer.getCustomerName());
                txtCusAddress.setText(searchCustomer.getCustomerAddress());
                txtCusPhone.setText(searchCustomer.getCustomerPhone());
                txtCusNIC.setText(searchCustomer.getCustomerNIC());
                txtCusSalary.setText(searchCustomer.getCustomerSalary() + "");
                
            } else {
                clearAllText();
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtCusIDActionPerformed

    private void txtCusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusNameActionPerformed

    private void txtCusAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusAddressActionPerformed

    private void txtCusPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusPhoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearAllText();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String customerID = txtCusID.getText();
        String customerName = txtCusName.getText();
        String customerAddres = txtCusAddress.getText();
        String customerPhone=txtCusPhone.getText();
        String customerNIC=txtCusNIC.getText();
        double customerSalary = Double.parseDouble(txtCusSalary.getText());

        try {

            CustomerDTO newCustomer = new CustomerDTO(customerID, customerName, customerAddres,customerPhone,customerNIC, customerSalary);

            boolean addCustomer = new CustomerFormController().addCustomer(newCustomer);

            if (addCustomer) {
                JOptionPane.showMessageDialog(this, "Customer Saved");
                loadAllCustomers();
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Saved");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String customerID = txtCusID.getText();
        String customerName = txtCusName.getText();
        String customerAddres = txtCusAddress.getText();
        String customerPhone=txtCusPhone.getText();
        String customerNIC=txtCusNIC.getText();
        double customerSalary = Double.parseDouble(txtCusSalary.getText());

        try {
            CustomerDTO updateCustomer = new CustomerDTO(customerID, customerName, customerAddres,customerPhone,customerNIC, customerSalary);
            boolean result = new CustomerFormController().updateCustomer(updateCustomer);
            if (result) {
                JOptionPane.showMessageDialog(this, "Customer Updated..!");
                loadAllCustomers();
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Updated..!");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        String customerID = txtCusID.getText();

        try {
            boolean result = new CustomerFormController().deleteCustomer(customerID);
            if (result) {
                JOptionPane.showMessageDialog(this, "Customer Deleted");
                loadAllCustomers();
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Deleted");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtCusSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusSalaryActionPerformed

    private void lblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrderMouseClicked
        new OrderForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblOrderMouseClicked

    private void lblFoodManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoodManageMouseClicked
        new ItemForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblFoodManageMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustimerRegistration;
    private javax.swing.JLabel lblCustomerDetailes;
    private javax.swing.JLabel lblFoodManage;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblOrderdetailes;
    private javax.swing.JPanel pnlSet;
    private javax.swing.JTable tblAddCustomer;
    private javax.swing.JTextField txtCusAddress;
    private javax.swing.JTextField txtCusID;
    private javax.swing.JTextField txtCusNIC;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtCusPhone;
    private javax.swing.JTextField txtCusSalary;
    // End of variables declaration//GEN-END:variables

    private void table() {
        tblAddCustomer.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,18));
        tblAddCustomer.getTableHeader().setOpaque(false);
        tblAddCustomer.getTableHeader().setBackground(new Color(255,255,255));
        tblAddCustomer.getTableHeader().setForeground(new Color(51,0,51));
        tblAddCustomer.setRowHeight(25);
    }

    private void mouseClickedAndReleased() {
        JLabel[] lbl={lblHome,lblCustimerRegistration,lblCustomerDetailes,lblFoodManage,lblOrder,lblOrderdetailes};
        for (JLabel jLabel : lbl) {
                jLabel.setBackground(new Color(51,0,51));
                jLabel.setOpaque(true);
                jLabel.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                    }
                    @Override
                    public void mousePressed(MouseEvent e) { 
                    }
                    @Override
                    public void mouseReleased(MouseEvent e) { 
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                       jLabel.setBackground(new Color(191, 116, 205));
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                       jLabel.setBackground(new Color(51,0,51));
                    }
                });
        }
    }
    
    private void clearAllText() {
        txtCusID.setText("");
        txtCusName.setText("");
        txtCusAddress.setText("");
        txtCusSalary.setText("");
        txtCusPhone.setText("");
        txtCusNIC.setText("");
        txtCusID.requestFocus();
        loadAllCustomers();
    }
    
     private void loadAllCustomers() {

        DefaultTableModel dtm = (DefaultTableModel) tblAddCustomer.getModel();
        dtm.setRowCount(0);

        try {
            ArrayList<CustomerDTO> allCustomers = new CustomerFormController().getAllCustomers();
            for (CustomerDTO c : allCustomers) {

                Object[] row = {c.getCustomerID(), c.getCustomerName(), c.getCustomerAddress(),c.getCustomerPhone(),c.getCustomerNIC(), c.getCustomerSalary()};
                dtm.addRow(row);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
