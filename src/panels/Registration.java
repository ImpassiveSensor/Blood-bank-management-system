package panels;


import panels.UserLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ContractNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        SignUP_notice = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        BG = new javax.swing.JTextField();
        bGrp = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("User Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 48));

        UserName.setBackground(new java.awt.Color(240, 240, 240));
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        getContentPane().add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Full Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        getContentPane().add(FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Contact Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        getContentPane().add(ContractNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 190, 30));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 136, 44));

        SignUP_notice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(SignUP_notice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 320, 40));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 136, 44));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 190, 30));

        bGrp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bGrp.setForeground(new java.awt.Color(255, 0, 0));
        bGrp.setText("Blood Group");
        getContentPane().add(bGrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 190, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\pics\\donate.jpg")); // NOI18N
        jLabel6.setText("d");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Username = UserName.getText();
        String Fullname = FullName.getText();
        String EmailId = Email.getText();
        String PassWord = Password.getText();
        String Contract = ContractNumber.getText();
        String Group = BG.getText();

        if (Username.isEmpty() || Fullname.isEmpty() || EmailId.isEmpty() || PassWord.isEmpty() || Contract.isEmpty()) {

            SignUP_notice.setText("Please verify all fields");
        } else {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager
                        .getConnection(
                                "jdbc:sqlserver://localhost:1433;databaseName=BloodBank;selectMethod=cursor", "sa", "123456");

                String sql = "Insert into REGISTRATION"
                        + "(UserName,FullName,Email,Pasword,ContactNumber, Manager_ID, Grp)"
                        + "values(?,?,?,?,?,?,?)";
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.setString(1, Username);
                pst.setString(2, Fullname);
                pst.setString(3, EmailId);
                pst.setString(4, PassWord);
                pst.setString(5, Contract);
                pst.setInt(6, 500);
                pst.setString(7, Group);

                pst.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            }
            SignUP_notice.setText("Registered Successfully ");
            UserName.setText("");
            FullName.setText("");
            Email.setText("");
            ContractNumber.setText("");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new UserLogin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BG;
    private javax.swing.JTextField ContractNumber;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FullName;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel SignUP_notice;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel bGrp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
