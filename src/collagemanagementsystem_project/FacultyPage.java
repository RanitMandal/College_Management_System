
package collagemanagementsystem_project;

import backend.MyConnection;
//import static collagemanagementsystem_project.LoginPage.uDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;




public class FacultyPage extends javax.swing.JFrame {
Connection con;
MyConnection myCon;
static String uDetails;        
         String name , mail ,sMob ,sDept ,sDeg ,sID,fees,cSearch ;
    
    public FacultyPage(String uDetails) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.uDetails=uDetails;
        myCon = new MyConnection();
        con = myCon.doConnect(); 
        //fetchStudentDetails();
       // fetchStudentDetails();
       UserNameDis.setText(uDetails);
       UpdateStudentTable();
       
    }
    
    private void searchStudentDetails() {
        String SqlQuery;
        
    try {
        CollectInput();
        String sID = enterSId.getText().toString();
       
        {
        if(cSearch == "Faculty ID"){
           SqlQuery = "Faculty_ID";}
        else if(cSearch == "Designation"){
            SqlQuery= "Collage_Code";}
        else{
            SqlQuery= "Department";}
       
        }
        
        
        PreparedStatement ps = con.prepareStatement( "SELECT Faculty_ID,  Name, Department, Designation, Contact_No, Email_ID"
                                           + " FROM faculty WHERE "+SqlQuery+" = '" + sID+ "'");
        ResultSet rs = ps.executeQuery();
        TableModel tm = DbUtils.resultSetToTableModel(rs);
        studentTable.setModel(tm);
        
       }catch (SQLException ex) {
        Logger.getLogger (FacultyPage.class.getName()).log (Level. SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());

       }
    
    }
    
     void CollectInput(){
        this.name = enterName.getText();
        this.sMob = enterMobile.getText();
        this.mail = enterEmail.getText();       
        this.sDeg = enterCourse.getSelectedItem().toString();
        this.sDept = enterDept.getSelectedItem().toString();
        this.sID = enterSId.getText();
        this.cSearch = ChoseSearch.getSelectedItem().toString();
        CheakFees();
        
    }
      
     
     void CheakFees(){
         if(this.sDeg=="B.Tech" && this.sDept=="EE"){
                this.fees="4.2 Lakhs";}
            else if(this.sDeg=="B.Tech" && this.sDept=="ECE"){
                this.fees="4.5 Lakhs";}
            else if(this.sDeg=="B.Tech" && this.sDept=="ME"){
                this.fees="4 Lakhs";}
            else if(this.sDeg=="B.Tech" && this.sDept=="CSE"){
                this.fees="4.6 Lakhs";}
            else if(this.sDeg=="M.Tech" && this.sDept=="EE"){
                this.fees="5 Lakhs";}
            else if(this.sDeg=="M.Tech" && this.sDept=="ECE"){
                this.fees="5.5 Lakhs";}
            else if(this.sDeg=="M.Tech" && this.sDept=="ME"){
                this.fees="4.7 Lakhs";}
            else if(this.sDeg=="M.Tech" && this.sDept=="CSE"){
                this.fees="6 Lakhs";}

            else{
                this.fees="4 Lakhs +";}
     }
    
     private void cleareDetails() {  
            enterName.setText("");
            enterEmail.setText("");
            enterMobile.setText(""); 
            //enterCourse.setItem("M.Tech");
            //enterDept.setText("");
            enterSId.setText("");
         
     }   
            
     
     
    private void UpdateStudentTable() {
       try {
        PreparedStatement ps = con.prepareStatement("SELECT Faculty_ID,  Name, Department, Designation, Contact_No, Email_ID FROM faculty");
        ResultSet rs = ps.executeQuery();
          TableModel tm = DbUtils.resultSetToTableModel(rs);
        studentTable.setModel(tm);
      
             
        
       }catch (SQLException ex) {
        Logger.getLogger (FacultyPage.class.getName()).log (Level. SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());

       }
       cleareDetails();
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_Cleare = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        btn_Home = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        enterName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        enterMobile = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        enterEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        enterDept = new javax.swing.JComboBox<>();
        enterCourse = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btn_Search = new javax.swing.JButton();
        enterSId = new javax.swing.JTextField();
        btn_Logout = new javax.swing.JButton();
        ChoseSearch = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_Refresh = new javax.swing.JButton();
        btn_Close = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        UserNameDis = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Details");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Update.setBackground(new java.awt.Color(153, 153, 153));
        btn_Update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, -1, -1));

        btn_Delete.setBackground(new java.awt.Color(153, 153, 153));
        btn_Delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 90, -1));

        btn_add.setBackground(new java.awt.Color(153, 153, 153));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 90, -1));

        btn_Cleare.setBackground(new java.awt.Color(153, 153, 153));
        btn_Cleare.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Cleare.setText("Clear");
        btn_Cleare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CleareActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Cleare, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 90, -1));
        jPanel2.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1286, 252, -1, -1));
        jPanel2.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        btn_Home.setBackground(new java.awt.Color(153, 153, 153));
        btn_Home.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Home.setText("Home");
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 650, 100, -1));

        studentTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Name", "Address", "Course"
            }
        ));
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 820, 580));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Faculty Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Faculty Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, 35));

        enterName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(enterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 270, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contact No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 120, 35));
        jLabel4.getAccessibleContext().setAccessibleName("");

        enterMobile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enterMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterMobileActionPerformed(evt);
            }
        });
        jPanel1.add(enterMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 270, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, 35));

        enterEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enterEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterEmailActionPerformed(evt);
            }
        });
        jPanel1.add(enterEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 270, 35));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Department");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 120, 35));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Designation");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 120, 35));

        enterDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chose Department", "CSE", "EE", "ECE", "ME" }));
        enterDept.setToolTipText("");
        enterDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterDeptActionPerformed(evt);
            }
        });
        jPanel1.add(enterDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 270, 40));

        enterCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Designation", "Ass. Prof.", "Asso. Prof.", "Prof.", "HOD", "Ass. HOD" }));
        enterCourse.setToolTipText("");
        enterCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterCourseActionPerformed(evt);
            }
        });
        jPanel1.add(enterCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 270, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 420, 450));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Search Details");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 100, 25));

        btn_Search.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btn_Search.setText("Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 134, 30));
        jPanel2.add(enterSId, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 210, 25));

        btn_Logout.setBackground(new java.awt.Color(204, 204, 255));
        btn_Logout.setText("Logout");
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 660, -1, -1));

        ChoseSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chose Select", "Student ID", "Collage Code", "Department", "Course" }));
        ChoseSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoseSearchActionPerformed(evt);
            }
        });
        jPanel2.add(ChoseSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ABCD OF TECHNOLOGY");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 280, 50));

        btn_Refresh.setBackground(new java.awt.Color(153, 153, 153));
        btn_Refresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Refresh.setText("Update");
        btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 100, -1));

        btn_Close.setBackground(new java.awt.Color(153, 153, 153));
        btn_Close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Close.setText("Close");
        btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 650, 100, -1));

        btn_Back.setBackground(new java.awt.Color(153, 153, 153));
        btn_Back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 650, 100, -1));

        UserNameDis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UserNameDis.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel2.add(UserNameDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
           
         CollectInput();
        
        if(this.name.isEmpty() || this.sDept.isEmpty() || this.sMob.isEmpty() || this.mail.isEmpty() 
                || this.sDeg.isEmpty() || this.sDept.isEmpty() )
            JOptionPane.showMessageDialog(this,"Filed not fill plese cheak");
        else{
           
          MyConnection conn = new MyConnection();
          Connection sqlCon = conn.doConnect();
          
          String  sqlQuery = "insert into faculty (Name, Department,Designation, Contact_No, Email_ID, Salary"
                                           + ")values(?,?,?,?,?,?);";
        
          try {            
           PreparedStatement insert = sqlCon.prepareStatement(sqlQuery);
           
            insert.setString(1,this.name);
            insert.setString(2,this.sDept);
            insert.setString(3,this.sDeg);
            insert.setLong(4,Long.parseLong(this.sMob));
            insert.setString(5,this.mail);            
            insert.setString(6,this.fees);
            

            
     
            insert.executeUpdate();
              
                JOptionPane.showMessageDialog(this, "Added Successfully!!");
                   
                   
            cleareDetails();
            UpdateStudentTable();   
           }catch(SQLException e){
              JOptionPane.showMessageDialog(this, e.getMessage());
              JOptionPane.showMessageDialog(this, "Error");
           }
            
        
          //for update the list
        }
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        
        CollectInput();
        
        if(this.name.isEmpty() || this.sDept.isEmpty() || this.sMob.isEmpty() || this.mail.isEmpty()
                || this.sDeg.isEmpty() || this.sDept.isEmpty() )
            JOptionPane.showMessageDialog(this,"Filed not fill plese cheak");
        else{
            
          MyConnection conn = new MyConnection();
          Connection sqlCon = conn.doConnect();
          
          String  sqlQuery = "UPDATE faculty SET Name = ?, Department = ? , Designation = ? ,"
                  + " Contact_No = ?, Email_ID = ?, Salary = ? WHERE Faculty_ID = ? ";
        
          try {            
           PreparedStatement update = sqlCon.prepareStatement(sqlQuery);
           
            update.setString(1,this.name);
            update.setString(2,this.sDept);
            update.setString(3,this.sDeg);
            update.setLong(4,Long.parseLong(this.sMob));
            update.setString(5,this.mail);            
            update.setString(6,this.fees);
            update.setString(7,this.sID);
            
     
            update.executeUpdate();
              
                JOptionPane.showMessageDialog(this, "Updated Successfully!!");
                   
                   
            cleareDetails();
               
           }catch(SQLException e){
              JOptionPane.showMessageDialog(this, e.getMessage());
              JOptionPane.showMessageDialog(this, "Error");
           }
            
        } 
        UpdateStudentTable();  //for update the list
   
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        // TODO add your handling code here:
    
       LoginPage login = new LoginPage();
        login.setVisible(true);
        FacultyPage.this.setVisible(false);
    }//GEN-LAST:event_btn_LogoutActionPerformed

    private void btn_CleareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CleareActionPerformed
        // TODO add your handling code here:
        
            cleareDetails();
    }//GEN-LAST:event_btn_CleareActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // TODO add your handling code here:
        
        
        String sIDe = enterSId.getText();
      int opt = JOptionPane.showConfirmDialog(null,"Are you sure to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if(opt==0){

        if(sIDe.isEmpty())
            JOptionPane.showMessageDialog(this,"Filed not fill plese cheak");
        else{
            MyConnection conn = new MyConnection();
           Connection sqlCon = conn.doConnect();
            
           String sqlQuery = "DELETE FROM faculty WHERE Faculty_ID = '"+sIDe+"'";
           
           try{
               PreparedStatement ps = sqlCon.prepareStatement(sqlQuery);
               ps.executeUpdate(sqlQuery);
               //sqlCon.close();
              
                   JOptionPane.showMessageDialog(this, "Delete Successfully!!");
               
           }catch(SQLException e){
              JOptionPane.showMessageDialog(this, e.getMessage());
              JOptionPane.showMessageDialog(this, "Error");
           }
        }
            
            searchStudentDetails();        
            cleareDetails();
        
        
        }
         UpdateStudentTable();
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        // TODO add your handling code here:
        MenubarOption menu = new MenubarOption(uDetails);
        menu.setVisible(true);
        FacultyPage.this.setVisible(false);
    }//GEN-LAST:event_btn_HomeActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        // TODO add your handling code here:
        searchStudentDetails();
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
    
        
        try {
        int row = studentTable.getSelectedRow();
        String Table_clk = (studentTable.getModel().getValueAt(row,0).toString());
        PreparedStatement ps = con.prepareStatement("SELECT * FROM faculty WHERE Faculty_ID = '"+Table_clk+"'");
        ResultSet rs = ps.executeQuery();
   
        if(rs.next()){
        
            this.enterName.setText(String.valueOf(rs.getString("Name")));
            this.enterEmail.setText(String.valueOf(rs.getString("Email_ID")));
            this.enterMobile.setText(String.valueOf(rs.getString("Contact_No")));       
            //enterCourse.setText(String.valueOf(rs.getString("Course Name")));
            //enterDept.setText(String.valueOf(rs.getString("Department")));
            this.enterSId.setText(String.valueOf(rs.getString("Faculty_ID")));
        }
    } catch (SQLException ex) {
        Logger.getLogger(FacultyPage.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(this, "Unscuuesfull");

    }
    }//GEN-LAST:event_studentTableMouseClicked

    private void enterMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterMobileActionPerformed

    private void ChoseSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoseSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoseSearchActionPerformed

    private void enterDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterDeptActionPerformed

    private void enterCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterCourseActionPerformed

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
        // TODO add your handling code here:
        UpdateStudentTable();
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseActionPerformed
        // TODO add your handling code here:
              System.exit(0);

    }//GEN-LAST:event_btn_CloseActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        // TODO add your handling code here:
          MenubarOption menu = new MenubarOption(uDetails);
        menu.setVisible(true);
        FacultyPage.this.setVisible(false);
    }//GEN-LAST:event_btn_BackActionPerformed

    private void enterEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterEmailActionPerformed

 
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyPage(uDetails).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ChoseSearch;
    private javax.swing.JLabel UserNameDis;
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Cleare;
    private javax.swing.JButton btn_Close;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Home;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Update;
    private javax.swing.JButton btn_add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> enterCourse;
    private javax.swing.JComboBox<String> enterDept;
    private javax.swing.JTextField enterEmail;
    private javax.swing.JTextField enterMobile;
    private javax.swing.JTextField enterName;
    private javax.swing.JTextField enterSId;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables

    

}
