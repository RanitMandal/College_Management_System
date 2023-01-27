
package collagemanagementsystem_project;

import backend.MyConnection;
import java.sql.Connection;



/**
 * @author RANIT
 */
public class MenubarOption extends javax.swing.JFrame {

     Connection con;
MyConnection myCon;
static String uDetails;
    

    public MenubarOption(String uDetails) {
      
        

        initComponents();
        myCon = new MyConnection();
        con = myCon.doConnect();
        this.setLocationRelativeTo(null);
        displayUser.setText(uDetails);
        this.uDetails=uDetails;
    }

   
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btn_Account = new javax.swing.JButton();
        btn_Stduent = new javax.swing.JButton();
        displayUser = new javax.swing.JLabel();
        btn_Faculty = new javax.swing.JButton();
        btn_Admin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 460));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 460));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 460));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 460));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ABCD College of Techonology");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 390, 79));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 110, -1));

        btn_Account.setBackground(new java.awt.Color(153, 153, 153));
        btn_Account.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Account.setText("Accounts");
        btn_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AccountActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 180, 60));

        btn_Stduent.setBackground(new java.awt.Color(153, 153, 153));
        btn_Stduent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Stduent.setText("Student");
        btn_Stduent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StduentActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Stduent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, 60));

        displayUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        displayUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(displayUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 240, 33));

        btn_Faculty.setBackground(new java.awt.Color(153, 153, 153));
        btn_Faculty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Faculty.setText("Faculty");
        btn_Faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FacultyActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 180, 60));

        btn_Admin.setBackground(new java.awt.Color(153, 153, 153));
        btn_Admin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Admin.setText("Administration");
        btn_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 180, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1162, 1162, 1162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 370, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        LoginPage login = new LoginPage();
        login.setVisible(true);
        MenubarOption.this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_StduentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StduentActionPerformed
        StudentPage std = new StudentPage(uDetails);
        std.setVisible(true);
        MenubarOption.this.setVisible(false);
    }//GEN-LAST:event_btn_StduentActionPerformed

    private void btn_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AccountActionPerformed
       
        AccountPage std = new AccountPage(uDetails);
        std.setVisible(true);
        MenubarOption.this.setVisible(false);
    
    }//GEN-LAST:event_btn_AccountActionPerformed

    private void btn_FacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FacultyActionPerformed

        FacultyPage std = new FacultyPage(uDetails);
        std.setVisible(true);
        MenubarOption.this.setVisible(false);
    }//GEN-LAST:event_btn_FacultyActionPerformed

    private void btn_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdminActionPerformed
        // TODO add your handling code here:
        AdminPage std = new AdminPage(uDetails);
        std.setVisible(true);
        MenubarOption.this.setVisible(false);
    }//GEN-LAST:event_btn_AdminActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new MenubarOption("Root").setVisible(true);
             }
        });    
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Account;
    private javax.swing.JButton btn_Admin;
    private javax.swing.JButton btn_Faculty;
    private javax.swing.JButton btn_Stduent;
    private javax.swing.JLabel displayUser;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables


}
