/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class AdminBloodUpdate extends javax.swing.JFrame {

    /**
     * Creates new form AdminBloodUpdate
     */
    public AdminBloodUpdate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        D_ID = new javax.swing.JTextField();
        D_date = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        box = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_IDActionPerformed(evt);
            }
        });
        getContentPane().add(D_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 153, 39));
        getContentPane().add(D_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 156, 34));

        update.setBackground(new java.awt.Color(255, 153, 153));
        update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 255));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 150, 47));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Blood Bank Management System");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 55));

        jLabel2.setFont(new java.awt.Font("Siyam Rupali", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Admin Panel");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 57));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Donor ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 81, 35));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Group");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 57, 37));

        box.setBackground(new java.awt.Color(0, 0, 0));
        box.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        box.setForeground(new java.awt.Color(255, 102, 255));
        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 153, 39));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\pics\\update.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void D_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_IDActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        String id= D_ID.getText();
        //String number = B_num.getText();
        //String name = D_name.getText();
        String group = box.getSelectedItem().toString();
        String date = D_date.getText();
        
        if(id.isEmpty() || group.isEmpty() || date.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill all fields");
        }
        else{
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BloodBank;selectMethod=cursor", "sa", "123456");

                String sql = "Update BLOOD Set donorID = ?, Manager_ID = ?, Grp = ?, DateOfDonation = ? where donorID="+id;
                PreparedStatement pst = connection.prepareStatement(sql);
 
                pst.setString(1, id);
                pst.setInt(2, 501);
                //pst.setString(2, number);
                //pst.setString(3, name);
                pst.setString(3, group);
                pst.setString(4, date);
          
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null,"Updated Successfully");
                dispose();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

     public AdminBloodUpdate(String Donor_ID, String Grp, String DateOfDonation, String Bag_Number) {
        initComponents();
        //jLabel3.setText(Donor_ID);
        //jLabel3.setVisible(false); 
        D_ID.setText(Donor_ID);
        //B_num.setText(Bag_Number);
        //D_name.setText(Donor_Name);
        //D_grp.setText(Grp);
        D_date.setText(DateOfDonation);
       
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
            java.util.logging.Logger.getLogger(AdminBloodUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminBloodUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminBloodUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminBloodUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminBloodUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField D_ID;
    private javax.swing.JTextField D_date;
    private javax.swing.JComboBox<String> box;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
