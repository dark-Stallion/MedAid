/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medaid;

import com.mysql.jdbc.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import medaid.newSignup;
import medaid.pwUpdateSplash;
import static medaid.checkdisease.myConn;
import static medaid.newSignup.myConn;
import static medaid.uploadedCase.myConn;

/**
 *
 * @author Sazib
 */
public class changepassword extends javax.swing.JFrame {

    /**
     * Creates new form changepassword
     */
    
    String str = "Please Enter Password";
    public changepassword() throws SQLException{
        initComponents();
        myConn = Conn.getConnection();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Password - MedAid+");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 204, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 190, 60));

        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 204, 153));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 340, 30));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 204));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 204, 153));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 340, 30));

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 204));
        jPasswordField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(0, 204, 153));
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 340, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctor pw update.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!(jTextField1.getText().equals("") || jPasswordField1.getText().equals("") || jPasswordField2.getText().equals(""))){
            
            try {
                stmt = myConn.prepareStatement("select * from doctor_info where doc_id=?");
                stmt.setInt(1, Integer.parseInt(jTextField1.getText()));
                myRs = stmt.executeQuery();
                
                if (!myRs.isBeforeFirst() ) {    
                    JOptionPane.showMessageDialog(null, "Unknown patient ID.");
                }else {
                    if(jPasswordField1.getText().equals(jPasswordField2.getText()))
                        update();
                    else
                        JOptionPane.showMessageDialog(null, "Password mismatch.");
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(changepassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please fill up all information!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new changepassword().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(changepassword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    public void update(){
            try {
                CallableStatement myStmt;
                myStmt = myConn.prepareCall("{call update_doctor(?, ?)}");
                if(!jPasswordField1.getText().isEmpty() || !jPasswordField2.getText().isEmpty()){
                    if(jPasswordField1.getText().equals(jPasswordField2.getText())){
                        myStmt.setString(1, jTextField1.getText());
                        myStmt.setString(2, jPasswordField1.getText());
                        myStmt.execute();
                        str = "Password Updated Successfully";
                    }else{
                        str = "Password Mismatch";
                    }
                    pwUpdateSplash p=new pwUpdateSplash(str);
                    p.setVisible(true);
                    dispose();
                }
            } catch (SQLException ex) {
                Logger.getLogger(newSignup.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    ResultSet myRs;
    PreparedStatement stmt;
    static Connection myConn;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}