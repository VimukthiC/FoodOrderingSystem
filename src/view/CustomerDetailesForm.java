/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/**
 *
 * @author vimukthi
 */
public class CustomerDetailesForm extends javax.swing.JFrame {

    /**
     * Creates new form CustomerRegistrationForm
     */
    public CustomerDetailesForm() {
        initComponents();
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel2.add(lblFoodManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 210, 70));

        lblOrder.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblOrder.setForeground(new java.awt.Color(255, 255, 255));
        lblOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Shopping_Cart_45px.png"))); // NOI18N
        lblOrder.setText("    ORDER");
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
        jPanel1.add(pnlSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1070, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked

    }//GEN-LAST:event_lblHomeMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerDetailesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetailesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCustimerRegistration;
    private javax.swing.JLabel lblCustomerDetailes;
    private javax.swing.JLabel lblFoodManage;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblOrderdetailes;
    private javax.swing.JPanel pnlSet;
    // End of variables declaration//GEN-END:variables
}