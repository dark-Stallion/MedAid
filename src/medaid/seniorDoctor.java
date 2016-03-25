/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medaid;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static medaid.uploadedCase.myConn;

/**
 *
 * @author Sazib
 */
public class seniorDoctor extends javax.swing.JFrame {

    /**
     * Creates new form seniorDoctor
     */
    static String name, id;
    public seniorDoctor(String name, String id) throws SQLException {
        initComponents();
        this.name = name;
        this.id = id;
        jLabel1.setText(name);
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

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Senior Doctor Control Panel - MedAid+");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 200, 30));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/research.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 250, 60));

        jButton4.setBackground(new java.awt.Color(255, 255, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoutv2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 60, 60));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check disease.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 280, 60));

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patient.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 220, 60));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print file.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 70));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/senior doctor.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            loginform l=new loginform();
            l.setVisible(true);
            dispose();          // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(seniorDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        researchFrame f= new researchFrame(id);
        f.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            checkdisease c =new checkdisease();
            c.setVisible(true);
            //dispose();        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(seniorDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        patient_frame pp=new patient_frame(id);
        pp.setVisible(true);
        
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int doc_id = Integer.parseInt(JOptionPane.showInputDialog("Enter doctor ID"));
        createPDF(doc_id);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void createPDF(int doc_id){
        try {                                      
            stmt = myConn.prepareStatement("select * from doctor_info where doc_id=?");
            stmt.setInt(1, doc_id);
            myRs = stmt.executeQuery();
            myRs.next();
            
            
            stmt = myConn.prepareStatement("select count(distinct patient_id) from doc_patient where doc_id=?");
            stmt.setInt(1, doc_id);
            myRs1 = stmt.executeQuery();
            myRs1.next();
            
            chooser = new JFileChooser(); 
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Choose destination");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setAcceptAllFileFilterUsed(false);
            
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
                System.out.println("getCurrentDirectory(): " 
                   +  chooser.getCurrentDirectory());
                System.out.println("getSelectedFile() : " 
                   +  chooser.getSelectedFile());
            }
            else {
                System.out.println("No Selection ");
            }
            
            
            String FILE = "" + chooser.getSelectedFile() + "\\" + doc_id + ".pdf";
            
           
            document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(FILE));
            } catch (Exception ex) {
                Logger.getLogger(uploadedCase.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            document.open();
            // Left
            Paragraph paragraph1 = new Paragraph("Doctor Name: " + myRs.getString("doc_name") + "\nHospital: " + myRs.getString("doc_hospital")
                                                + "\nPosition: " + myRs.getString("doctor_position") + "\nMail address: " + myRs.getString("doctor_mail") + "\nPatients Treated: " + myRs1.getInt(1) + "\n\n") ;
            paragraph1.setAlignment(Element.ALIGN_LEFT);
            
            try {
                document.add(paragraph1);
            } catch (DocumentException ex) {
                Logger.getLogger(uploadedCase.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            CallableStatement myStmt;
            myStmt = myConn.prepareCall("{call get_doc_research(?)}");
            myStmt.setInt(1, doc_id);
            myStmt.execute();
            myRs = myStmt.executeQuery();
            
            while(myRs.next()){
                
                Paragraph paragraph2 = new Paragraph("Research name: " + myRs.getString("research_name") + "\nPublish date: " + myRs.getString("research_date")
                                                    + "\nResearch data: " + myRs.getString("research_data") + "\n\n");
                paragraph2.setAlignment(Element.ALIGN_LEFT);
                
                try {
                    document.add(paragraph2);
                } catch (DocumentException ex) {
                    Logger.getLogger(uploadedCase.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            document.close();
        } catch (SQLException ex) {
            Logger.getLogger(uploadedCase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(seniorDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seniorDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seniorDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seniorDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new seniorDoctor(name, id).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(seniorDoctor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    Document document;
    PreparedStatement stmt;
    JFileChooser chooser;
    ResultSet myRs1;
    ResultSet myRs;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}