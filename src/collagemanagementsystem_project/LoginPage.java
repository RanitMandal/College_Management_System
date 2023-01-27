
package collagemanagementsystem_project;

import backend.MyConnection;
import javax.swing.JOptionPane;
import java.sql.*; 
import javax.swing.*;  
import backend.MyConnection;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;



/**
 * @author RANIT
 */
public class LoginPage extends javax.swing.JFrame {

    static String uDetails;

    public LoginPage() {
        
    

        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    
    private void searchLoginDetails(int sID) {
  
    try {
        
        MyConnection conn = new MyConnection();
         Connection con = conn.doConnect();
         
        PreparedStatement ps = con.prepareStatement("SELECT * FROM admintable WHERE Admin_ID = "+sID);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
        
            this.uDetails =("Welcome, "+String.valueOf(rs.getString("Name")));
        }
       }catch (SQLException ex) {
        Logger.getLogger (StudentPage.class.getName()).log (Level. SEVERE, null, ex);
       }
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        enterUserId = new javax.swing.JTextField();
        enterPassword = new javax.swing.JPasswordField();
        btn_Login = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_Forget = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setForeground(new java.awt.Color(255, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\RANIT\\My Drive\\Java Program\\CollageManagementSystem_Project\\src\\collagemanagementsystem_project\\Untitled-3.png")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 264, 227));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome To");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("System");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 260, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("College Management");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 410));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\RANIT\\My Drive\\Java Program\\CollageManagementSystem_Project\\src\\collagemanagementsystem_project\\icons8_key_20px_1.png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 37, 32));

        enterUserId.setBackground(new java.awt.Color(255, 102, 102));
        enterUserId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enterUserId.setForeground(new java.awt.Color(255, 255, 255));
        enterUserId.setBorder(null);
        enterUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterUserIdActionPerformed(evt);
            }
        });
        jPanel1.add(enterUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 242, 30));

        enterPassword.setBackground(new java.awt.Color(255, 102, 102));
        enterPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enterPassword.setForeground(new java.awt.Color(255, 255, 255));
        enterPassword.setBorder(null);
        jPanel1.add(enterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 246, 30));

        btn_Login.setBackground(new java.awt.Color(0, 204, 255));
        btn_Login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 100, 40));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 70, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("New User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 100, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/collagemanagementsystem_project/icons8_contacts_20px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 40, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 260, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 260, 10));

        jLabel5.setFont(new java.awt.Font("Vivaldi", 3, 48)); // NOI18N
        jLabel5.setText("Login....");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 70));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 30, 30));

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton5.setLabel("x");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 10, 30, 30));

        btn_Forget.setBackground(new java.awt.Color(255, 102, 102));
        btn_Forget.setText("Forget Password");
        btn_Forget.setAlignmentY(0.0F);
        btn_Forget.setBorder(null);
        btn_Forget.setContentAreaFilled(false);
        btn_Forget.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_Forget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ForgetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Forget, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 410, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        
        String uname = enterUserId.getText();
        String pwd = String.valueOf(enterPassword.getPassword());
        
        if(uname.isEmpty() || pwd.isEmpty())
            JOptionPane.showMessageDialog(this,"Filed not fill plese cheak");
        else{
            MyConnection conn = new MyConnection();
           Connection sqlCon = conn.doConnect();
          
            
            
           String sqlQuery = "SELECT * FROM admintable WHERE Admin_ID = ? AND Password = ?";
           
           try{
               PreparedStatement ps = sqlCon.prepareStatement(sqlQuery);
               ps.setInt(1, Integer.parseInt(uname));
               ps.setString(2, pwd);
               ResultSet result = ps.executeQuery();
               if(result.next()){
                   JOptionPane.showMessageDialog(this,"Login Succesfull");
                    
     
                   searchLoginDetails(Integer.parseInt(uname));
                           
                           
                    MenubarOption menu = new MenubarOption(uDetails);
                    menu.setVisible(true);
                    LoginPage.this.setVisible(false);
                    
                    
               }
               else
                   JOptionPane.showMessageDialog(this, "Login Failed\n Plese Check User ID & Password");
               
           }catch(SQLException e){
              JOptionPane.showMessageDialog(this, e.getMessage());
           }
       }                
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        WelcomePage login = new WelcomePage();
        login.setVisible(true);
        LoginPage.this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void enterUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterUserIdActionPerformed

    }//GEN-LAST:event_enterUserIdActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

                        System.exit(0);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_ForgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ForgetActionPerformed

    }//GEN-LAST:event_btn_ForgetActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Forget;
    private javax.swing.JButton btn_Login;
    private javax.swing.JPasswordField enterPassword;
    private javax.swing.JTextField enterUserId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
