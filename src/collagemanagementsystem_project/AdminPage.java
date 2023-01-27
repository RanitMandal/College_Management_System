
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




public class AdminPage extends javax.swing.JFrame {
Connection con;
MyConnection myCon;
static String uDetails;        
         String name , add ,mail ,sMob ,sAge ,sCollegeCode,sCourse ,sDept ,sID,fees,cSearch ;
    
    public AdminPage(String uDetails) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.uDetails=uDetails;
        myCon = new MyConnection();
        con = myCon.doConnect(); 
        //fetchStudentDetails();
       // fetchStudentDetails();
       UserNameDis.setText(uDetails);
       UpdateStudentTable() ;
       
    }
    
    private void searchStudentDetails() {
        String SqlQuery;
        
    try {
        CollectInput();
        String sID = enterSId.getText().toString();
       
        {
        if(cSearch == "Student ID"){
           SqlQuery = "S_ID";}
        else if(cSearch == "Collage Code"){
            SqlQuery= "Collage_Code";}
        else if(cSearch == "Department"){
            SqlQuery= "Department";}
        else{
            SqlQuery ="Course_Name";}
        }
        
        
        PreparedStatement ps = con.prepareStatement( "SELECT S_ID,  Name, Address, Contact_No, Email_ID, Age, Collage_Code"
                                           + " , Course_Name, Department FROM studentstable WHERE "+SqlQuery+" = '" + sID+ "'");
        ResultSet rs = ps.executeQuery();
        TableModel tm = DbUtils.resultSetToTableModel(rs);
        studentTable.setModel(tm);
        
       }catch (SQLException ex) {
        Logger.getLogger (AdminPage.class.getName()).log (Level. SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());

       }
    
    }
    
     void CollectInput(){
        this.name = enterName.getText();
     //   this.add = enterAddress.getText();
     //   this.sMob = enterMobile.getText();
        this.mail = enterEmail.getText();       
     //   this.sAge = enterAge.getText();
     //   this.sCollegeCode = enterClgCode.getText();
     //   this.sCourse = enterCourse.getSelectedItem().toString();
      //  this.sDept = enterDept.getSelectedItem().toString();
        this.sID = enterSId.getText();
        this.cSearch = ChoseSearch.getSelectedItem().toString();
        CheakFees();
        
    }
      
     
     void CheakFees(){
         if(this.sCourse=="B.Tech" && this.sDept=="EE"){
                this.fees="4.2 Lakhs";}
            else if(this.sCourse=="B.Tech" && this.sDept=="ECE"){
                this.fees="4.5 Lakhs";}
            else if(this.sCourse=="B.Tech" && this.sDept=="ME"){
                this.fees="4 Lakhs";}
            else if(this.sCourse=="B.Tech" && this.sDept=="CSE"){
                this.fees="4.6 Lakhs";}
            else if(this.sCourse=="M.Tech" && this.sDept=="EE"){
                this.fees="5 Lakhs";}
            else if(this.sCourse=="M.Tech" && this.sDept=="ECE"){
                this.fees="5.5 Lakhs";}
            else if(this.sCourse=="M.Tech" && this.sDept=="ME"){
                this.fees="4.7 Lakhs";}
            else if(this.sCourse=="M.Tech" && this.sDept=="CSE"){
                this.fees="6 Lakhs";}

            else{
                this.fees="4 Lakhs +";}
     }
    
     private void cleareDetails() {  
            enterName.setText("");
          //  enterAddress.setText("");
            enterEmail.setText("");
          //  enterMobile.setText(""); 
          //  enterAge.setText("");
          //  enterClgCode.setText("");
            //enterCourse.setItem("M.Tech");
            //enterDept.setText("");
            enterSId.setText("");
         
     }   
            
     
     
    private void UpdateStudentTable() {
       try {
        PreparedStatement ps = con.prepareStatement("SELECT Admin_ID, Name, Email,Password FROM admintable");
        ResultSet rs = ps.executeQuery();
          TableModel tm = DbUtils.resultSetToTableModel(rs);
        studentTable.setModel(tm);
      
             
        
       }catch (SQLException ex) {
        Logger.getLogger (AdminPage.class.getName()).log (Level. SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());

       }
       cleareDetails();
       UpdateFacultyTable();
}
    
      private void UpdateFacultyTable() {
       try {
        PreparedStatement ps = con.prepareStatement("SELECT Faculty_ID,  Name, Department, Designation, Salary FROM faculty");
        ResultSet rs = ps.executeQuery();
          TableModel tm = DbUtils.resultSetToTableModel(rs);
       // studentTable1.setModel(tm);
      
             
        
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
        jLabel5 = new javax.swing.JLabel();
        enterEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
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
        setMinimumSize(new java.awt.Dimension(1120, 515));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(1120, 515));
        jPanel2.setPreferredSize(new java.awt.Dimension(1120, 515));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Update.setBackground(new java.awt.Color(153, 153, 153));
        btn_Update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        btn_Delete.setBackground(new java.awt.Color(153, 153, 153));
        btn_Delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 90, -1));

        btn_add.setBackground(new java.awt.Color(153, 153, 153));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 90, -1));

        btn_Cleare.setBackground(new java.awt.Color(153, 153, 153));
        btn_Cleare.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Cleare.setText("Clear");
        btn_Cleare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CleareActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Cleare, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 90, -1));
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
        jPanel2.add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 100, -1));

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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 650, 400));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Administration Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 120, 35));

        enterName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(enterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 270, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 120, 35));

        enterEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(enterEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 270, 35));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 110, 35));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 270, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 420, 280));

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
        jPanel2.add(btn_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 100, -1));
        jPanel2.add(enterSId, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 170, 25));

        btn_Logout.setBackground(new java.awt.Color(204, 204, 255));
        btn_Logout.setText("Logout");
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, -1));

        ChoseSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chose Select", "User ID", "Email ID", "Name" }));
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
        jPanel2.add(btn_Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 100, -1));

        btn_Close.setBackground(new java.awt.Color(153, 153, 153));
        btn_Close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Close.setText("Close");
        btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, 100, -1));

        btn_Back.setBackground(new java.awt.Color(153, 153, 153));
        btn_Back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, 100, -1));

        UserNameDis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UserNameDis.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel2.add(UserNameDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
           
         CollectInput();
        
        if(this.name.isEmpty() || this.sDept.isEmpty() || this.sMob.isEmpty() || this.mail.isEmpty() || this.sCollegeCode.isEmpty()
                || this.sCourse.isEmpty() || this.sDept.isEmpty() )
            JOptionPane.showMessageDialog(this,"Filed not fill plese cheak");
        else{
           
          MyConnection conn = new MyConnection();
          Connection sqlCon = conn.doConnect();
          
          String  sqlQuery = "insert into studentstable (Name, Address, Contact_No, Email_ID, Age, Collage_Code	"
                                           + " , Course_Name, Department ,Fees)values(?,?,?,?,?,?,?,?,?);";
        
          try {            
           PreparedStatement insert = sqlCon.prepareStatement(sqlQuery);
           
            insert.setString(1,this.name);
            insert.setString(2,this.add);
            insert.setInt(3,Integer.parseInt(this.sMob));
            insert.setString(4,this.mail);
            insert.setInt(5,Integer.parseInt(this.sAge));
            insert.setInt(6,Integer.parseInt(this.sCollegeCode));
            insert.setString(7,this.sCourse);
            insert.setString(8,this.sDept);            
            insert.setString(9,this.fees);
            

            
     
            insert.executeUpdate();
              
                JOptionPane.showMessageDialog(this, "Added Successfully!!");
                   
                   
            cleareDetails();
               
           }catch(SQLException e){
              JOptionPane.showMessageDialog(this, e.getMessage());
              JOptionPane.showMessageDialog(this, "Error");
           }
            
        
        UpdateStudentTable();  //for update the list
        }
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        
        CollectInput();
        
        if(this.name.isEmpty() || this.sDept.isEmpty() || this.sMob.isEmpty() || this.mail.isEmpty() || this.sCollegeCode.isEmpty()
                || this.sCourse.isEmpty() || this.sDept.isEmpty() )
            JOptionPane.showMessageDialog(this,"Filed not fill plese cheak");
        else{
            
          MyConnection conn = new MyConnection();
          Connection sqlCon = conn.doConnect();
          
          String  sqlQuery = "UPDATE studentstable SET Name = ?, Address = ?, Contact_No = ?, Email_ID	= ?, "
                  + "Age = ?, Collage_Code = ?, Course_Name =?, Department = ? , Fees = ? WHERE S_ID = ?";
        
          try {            
           PreparedStatement update = sqlCon.prepareStatement(sqlQuery);
           
            update.setString(1,this.name);
            update.setString(2,this.add);
            update.setInt(3,Integer.parseInt(this.sMob));
            update.setString(4,this.mail);
            update.setInt(5,Integer.parseInt(this.sAge));
            update.setInt(6,Integer.parseInt(this.sCollegeCode));
            update.setString(7,this.sCourse);
            update.setString(8,this.sDept);
            update.setString(9,this.fees);
            update.setString(10,this.sID);
            
     
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
        AdminPage.this.setVisible(false);
    }//GEN-LAST:event_btn_LogoutActionPerformed

    private void btn_CleareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CleareActionPerformed
        // TODO add your handling code here:
        
            cleareDetails();
    }//GEN-LAST:event_btn_CleareActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // TODO add your handling code here:
        
        int opt = JOptionPane.showConfirmDialog(null,"Are you sure to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if(opt==0){
        String sID = enterSId.getText();
      

        if(sID.isEmpty())
            JOptionPane.showMessageDialog(this,"Filed not fill plese cheak");
        else{
            MyConnection conn = new MyConnection();
           Connection sqlCon = conn.doConnect();
            
           String sqlQuery = "DELETE FROM studentstable WHERE S_ID = '"+sID+"'";
           
           try{
               PreparedStatement ps = sqlCon.prepareStatement(sqlQuery);
               ps.executeUpdate(sqlQuery);
               sqlCon.close();
              
                   JOptionPane.showMessageDialog(this, "Delete Successfully!!");
               
           }catch(SQLException e){
              JOptionPane.showMessageDialog(this, e.getMessage());
              JOptionPane.showMessageDialog(this, "Error");
           }}
            
            searchStudentDetails();        
            cleareDetails();
        
        
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        // TODO add your handling code here:
        MenubarOption menu = new MenubarOption(uDetails);
        menu.setVisible(true);
        AdminPage.this.setVisible(false);
    }//GEN-LAST:event_btn_HomeActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        // TODO add your handling code here:
        searchStudentDetails();
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
    
        
        try {
        int row = studentTable.getSelectedRow();
        String Table_clk = (studentTable.getModel().getValueAt(row,0).toString());
        PreparedStatement ps = con.prepareStatement("SELECT * FROM studentstable WHERE S_ID = '"+Table_clk+"'");
        ResultSet rs = ps.executeQuery();
   
        if(rs.next()){
        
            this.enterName.setText(String.valueOf(rs.getString("Name")));
          //  this.enterAddress.setText(String.valueOf(rs.getString("Address")));
            this.enterEmail.setText(String.valueOf(rs.getString("Email_ID")));
          //  this.enterMobile.setText(String.valueOf(rs.getString("Contact_No")));       
          //  this.enterClgCode.setText(String.valueOf(rs.getString("Collage_Code")));
          //  this.enterAge.setText(String.valueOf(rs.getString("Age")));
            //enterCourse.setText(String.valueOf(rs.getString("Course Name")));
          //  this.enterDept.setActionCommand(String.valueOf(rs.getString("Department")));
            //setText(String.valueOf(rs.getString("Department")));
            this.enterSId.setText(String.valueOf(rs.getString("S_ID")));
        }
    } catch (SQLException ex) {
        Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(this, "Unscuuesfull");

    }
    }//GEN-LAST:event_studentTableMouseClicked

    private void ChoseSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoseSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoseSearchActionPerformed

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
        AdminPage.this.setVisible(false);
    }//GEN-LAST:event_btn_BackActionPerformed

 
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage(uDetails).setVisible(true);
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
    private javax.swing.JTextField enterEmail;
    private javax.swing.JTextField enterName;
    private javax.swing.JTextField enterSId;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables

    

}
