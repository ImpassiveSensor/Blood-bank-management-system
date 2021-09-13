package panels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import panels.HomeInformation;

public class HomePage extends javax.swing.JFrame{
    String UserName,UserAge;
    Integer un;

    public HomePage(){
        initComponents(); 
        DefaultTableModel model = (DefaultTableModel)Donation_table.getModel();
        model.setRowCount(0);  
        showing();
    }
    public HomePage(String userName)
    {
        initComponents();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=BloodBank;selectMethod=cursor", "sa", "123456");
            PreparedStatement prepStmnt = null;
            ResultSet dataset = null;
            String query = "select * from Registration where donorID = "+userName;
            System.out.println(query);
            prepStmnt = connection.prepareStatement(query);
            dataset = prepStmnt.executeQuery();
            while(dataset.next()){
                nam.setText(dataset.getString("FullName"));
            }
            //mc.setText(nam);
        }catch (Exception e) {
            e.printStackTrace();
        }
        UserName=userName;System.out.println("ddd"+UserName);
        un = Integer.valueOf(UserName);
        DefaultTableModel model = (DefaultTableModel)Donation_table.getModel();
        model.setRowCount(0);  
        showing();
        
    }
    
    public String getUserName()
    {
        return UserName;
    }
    
    
    
    public ArrayList<HomeInformation> List(){
        ArrayList<HomeInformation> List = new ArrayList<>();
        UserLogin log = new UserLogin();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=BloodBank;selectMethod=cursor", "sa", "123456");

            String sql, s, age;
            Statement statement;
            ResultSet rs;
            HomeInformation blood;
       
            int AGE = 0, a, ID, MID = 0;
            String GRP = "", PHN = "";
            sql = "select * from BLOOD where donorID = "+un+"order by DateOfDonation";
            PreparedStatement pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                ID = rs.getInt("donorID");
                
                if(ID == un){
                MID = rs.getInt("Manager_ID");
                GRP = rs.getString("Grp");
                //PHN = rs.getString("donor_phone");
                }
            }
            name_field.setText(UserName);
            //age_field.setText(String.valueOf(AGE));
       
            group_field.setText(GRP);
            String MAN_ID;
            MAN_ID = Integer.toString(MID);
            //phone_field.setText(PHN);
            Manager.setText(MAN_ID);
            sql = "Select DateOfDonation, Bag_Number from BLOOD where donorID = "+un; 
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            int counter = 0;
            String last = "";
            while(rs.next()){
                blood = new HomeInformation(rs.getString("DateOfDonation")); 
                List.add(blood);
                last = rs.getString("DateOfDonation");
                counter++;
            }
            String sC = Integer.toString(counter);
            times.setText(sC);
            date.setText(last);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return List;
    }
    
    
    public void showing(){
        ArrayList<HomeInformation> list = List();
        DefaultTableModel model = (DefaultTableModel)Donation_table.getModel();
        Object[] row = new Object[1];
        for(int i = 0; i < list.size(); i++){
            row[0] = list.get(i).getDonor_Name();
            model.addRow(row); 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Donation_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        times = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Manager = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        group_field = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name_field = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(955, 587));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("LogOut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 208, 60));

        Donation_table.setForeground(new java.awt.Color(255, 51, 51));
        Donation_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Dates"
            }
        ));
        jScrollPane2.setViewportView(Donation_table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 290, 350));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Blood Bank Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, 49));

        times.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        times.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(times, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 40, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("You have donated ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("times");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        Manager.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(Manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Last date of donation");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 160, 20));

        jLabel6.setFont(new java.awt.Font("Siyam Rupali", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("User Panel");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, 42));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("You are registered under Manger ID ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Group");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        group_field.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(group_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 74, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        name_field.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 130, 29));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("Welcome");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        nam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nam.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 250, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
         new UserLogin().setVisible(true);
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Donation_table;
    private javax.swing.JLabel Manager;
    private javax.swing.JLabel date;
    private javax.swing.JLabel group_field;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nam;
    private javax.swing.JLabel name_field;
    private javax.swing.JLabel times;
    // End of variables declaration//GEN-END:variables
}
