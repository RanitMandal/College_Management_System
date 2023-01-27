package collagemanagementsystem_project;

import java.util.Date;

/**
 * @author RANIT
 */
public class WelcomePage extends javax.swing.JFrame {

    public WelcomePage() {
        
        initComponents();
        displayTime();
        this.setLocationRelativeTo(null);   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Enter = new javax.swing.JButton();
        dTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Enter.setBackground(new java.awt.Color(0, 102, 255));
        btn_Enter.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_Enter.setForeground(new java.awt.Color(204, 204, 0));
        btn_Enter.setText("Proceed");
        btn_Enter.setToolTipText("");
        btn_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 150, 40));

        dTime.setBackground(new java.awt.Color(51, 51, 255));
        dTime.setForeground(new java.awt.Color(255, 255, 255));
        dTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(dTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\RANIT\\My Drive\\Java Program\\CollageManagementSystem_Project\\Images\\Welcome_Image.jfif")); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 350));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnterActionPerformed
        LoginPage login = new LoginPage();
        login.setVisible(true);
        WelcomePage.this.setVisible(false);
    }//GEN-LAST:event_btn_EnterActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Enter;
    private javax.swing.JLabel dTime;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void displayTime() {
    dTime.setText(String.valueOf(new Date().clone()));
    }
}
