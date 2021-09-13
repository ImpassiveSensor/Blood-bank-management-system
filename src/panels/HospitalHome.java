
package panels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class HospitalHome extends javax.swing.JFrame {
    public HospitalHome() {
        initComponents();
    }
    public HospitalHome(String H_ID){
        initComponents();
        hid.setText(H_ID);
        Integer id = Integer.getInteger(H_ID);
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=BloodBank;selectMethod=cursor", "sa", "123456");
            PreparedStatement prepStmnt = null;
            ResultSet dataset = null;
            String query = "select * from Hospital_Reg where Hospital_ID = "+H_ID;
            prepStmnt = connection.prepareStatement(query);
            dataset = prepStmnt.executeQuery();
            while(dataset.next()){
                mc.setText(dataset.getString("Hospital_name"));
                manager.setText(dataset.getString("Manager_ID"));
            }
            //mc.setText(nam);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hquantity = new javax.swing.JTextField();
        order = new javax.swing.JButton();
        mc = new javax.swing.JLabel();
        manager = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        box = new javax.swing.JComboBox<>();
        SignUP_notice = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("WELCOME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Make an order here...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Hospital ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        getContentPane().add(hid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Group");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        getContentPane().add(hquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 30));

        order.setBackground(new java.awt.Color(255, 102, 102));
        order.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        order.setForeground(new java.awt.Color(0, 51, 255));
        order.setText("Make Order");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        getContentPane().add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 279, 40));

        mc.setBackground(new java.awt.Color(255, 255, 102));
        mc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mc.setForeground(new java.awt.Color(0, 153, 0));
        getContentPane().add(mc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 390, 50));

        manager.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manager.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, 40));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 170, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("You are registered under Manager ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 310, 30));

        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });
        getContentPane().add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        SignUP_notice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(SignUP_notice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 231, 42));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\pics\\hospitalOrder.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HospitalLogin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
        //hid.setText(Name);
        ResultSet rs;
        int id = Integer.parseInt(hid.getText());
        System.out.println(id);
        int quantity = Integer.parseInt(hquantity.getText());
        String grp = box.getSelectedItem().toString();
        if (grp.isEmpty()) {

            SignUP_notice.setText("Please verify all fields");
        } else {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager
                        .getConnection(
                                "jdbc:sqlserver://localhost:1433;databaseName=BloodBank;selectMethod=cursor", "sa", "123456");

                String sql = "Insert into HospitalOrder"
                        + "(Order_group,Order_quantity,Hospital_ID)"
                        + "values(?,?,?)";
                PreparedStatement pst = connection.prepareStatement(sql);
                
                pst.setString(1, grp);
                pst.setInt(2, quantity);
                pst.setInt(3, id);
                Integer i = Integer.getInteger(hid.getText());
                String last = "";

                pst.executeUpdate();               
            } catch (Exception e) {
                e.printStackTrace();
            }
            SignUP_notice.setText("Order Placed Successfully");
            hid.setText("");
            hquantity.setText("");

        }

    }//GEN-LAST:event_orderActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_boxActionPerformed

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
            java.util.logging.Logger.getLogger(HospitalHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SignUP_notice;
    private javax.swing.JComboBox<String> box;
    private javax.swing.JTextField hid;
    private javax.swing.JTextField hquantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel manager;
    private javax.swing.JLabel mc;
    private javax.swing.JButton order;
    // End of variables declaration//GEN-END:variables
}
