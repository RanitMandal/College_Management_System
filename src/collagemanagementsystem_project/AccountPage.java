
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




public class AccountPage extends javax.swing.JFrame {
Connection con;
MyConnection myCon;
static String uDetails;        
         String name , mail ,sMob ,sDept ,sDeg ,sID,fees,cSearch ;
    
    public AccountPage(String uDetails) {
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
        Logger.getLogger (AccountPage.class.getName()).log (Level. SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());

       }
    
    }
    
     void CollectInput(){
        this.name = enterName.getText();
        //this.sMob = enterMobile.getText();
        this.mail = enterEmail.getText();       
        //this.sDeg = enterCourse.getSelectedItem().toString();
        //this.sDept = enterDept.getSelectedItem().toString();
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
            //enterMobile.setText(""); 
            //enterCourse.setItem("M.Tech");
            //enterDept.setText("");
            enterSId.setText("");
         
     }   
            
     
     
    private void UpdateStudentTable() {
       try {
        PreparedStatement ps = con.prepareStatement("SELECT Faculty_ID,  Name, Department, Designation, Salary FROM faculty");
        ResultSet rs = ps.executeQuery();
          TableModel tm = DbUtils.resultSetToTableModel(rs);
        studentTable.setModel(tm);
      
             
        
       }catch (SQLException ex) {
        Logger.getLogger (AccountPage.class.getName()).log (Level. SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());

       }
       cleareDetails();
     UpdateFacultyTable();
}
    
   private void UpdateFacultyTable() {
       try {
        PreparedStatement ps = con.prepareStatement("SELECT S_ID, Name, Course_Name, Department,Fees FROM studentstable");
        ResultSet rs = ps.executeQuery();
          TableModel tm = DbUtils.resultSetToTableModel(rs);
        studentTable1.setModel(tm);
      
             
        
       }catch (SQLException ex) {
        Logger.getLogger (StudentPage.class.getName()).log (Level. SEVERE, null, ex);
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
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        enterName1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        enterEmail1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btn_Update1 = new javax.swing.JButton();
        btn_Update3 = new javax.swing.JButton();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        studentTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        enterName2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        enterEmail2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        enterName3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        enterEmail3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        btn_Update2 = new javax.swing.JButton();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Details");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Cleare.setBackground(new java.awt.Color(153, 153, 153));
        btn_Cleare.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Cleare.setText("Clear");
        btn_Cleare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CleareActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Cleare, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, 90, -1));
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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 820, 260));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Student Fees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Faculty ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 120, 35));

        enterName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(enterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 270, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fees");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, 35));

        enterEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enterEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterEmailActionPerformed(evt);
            }
        });
        jPanel1.add(enterEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 180, 40));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Faculty Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Faculty ID");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 120, 35));

        enterName1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(enterName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 270, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fees");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 35));

        enterEmail1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enterEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterEmail1ActionPerformed(evt);
            }
        });
        jPanel3.add(enterEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 270, 35));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 420, 250));

        btn_Update1.setBackground(new java.awt.Color(153, 153, 153));
        btn_Update1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Update1.setText("Update");
        btn_Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Update1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, -1, -1));

        btn_Update3.setBackground(new java.awt.Color(153, 153, 153));
        btn_Update3.setText("Update");
        btn_Update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Update3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Update3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 420, 240));

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

        studentTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        studentTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Name", "Address", "Course"
            }
        ));
        studentTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(studentTable1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 820, 280));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Faculty Salary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Faculty ID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 120, 35));

        enterName2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(enterName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 270, 35));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Salary");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, 35));

        enterEmail2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enterEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterEmail2ActionPerformed(evt);
            }
        });
        jPanel4.add(enterEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 180, 35));

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Faculty Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Faculty ID");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 120, 35));

        enterName3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel5.add(enterName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 270, 35));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Fees");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 35));

        enterEmail3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enterEmail3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterEmail3ActionPerformed(evt);
            }
        });
        jPanel5.add(enterEmail3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 270, 35));

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 420, 250));

        btn_Update2.setBackground(new java.awt.Color(153, 153, 153));
        btn_Update2.setText("Update");
        btn_Update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Update2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn_Update2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 420, 250));

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

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        // TODO add your handling code here:
    
       LoginPage login = new LoginPage();
        login.setVisible(true);
        AccountPage.this.setVisible(false);
    }//GEN-LAST:event_btn_LogoutActionPerformed

    private void btn_CleareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CleareActionPerformed
        // TODO add your handling code here:
        
            cleareDetails();
    }//GEN-LAST:event_btn_CleareActionPerformed

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        // TODO add your handling code here:
        MenubarOption menu = new MenubarOption(uDetails);
        menu.setVisible(true);
        AccountPage.this.setVisible(false);
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
           // this.enterMobile.setText(String.valueOf(rs.getString("Contact_No")));       
            //enterCourse.setText(String.valueOf(rs.getString("Course Name")));
            //enterDept.setText(String.valueOf(rs.getString("Department")));
            this.enterSId.setText(String.valueOf(rs.getString("Faculty_ID")));
        }
    } catch (SQLException ex) {
        Logger.getLogger(AccountPage.class.getName()).log(Level.SEVERE, null, ex);
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
        AccountPage.this.setVisible(false);
    }//GEN-LAST:event_btn_BackActionPerformed

    private void studentTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_studentTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void enterEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterEmailActionPerformed
        // TODO add your hdling code here:
    }//GEN-LAST:event_enterEmailActionPerformed

    private void enterEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterEmail1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void enterEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterEmail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterEmail2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void enterEmail3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterEmail3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterEmail3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Update1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Update1ActionPerformed

    private void btn_Update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Update2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Update2ActionPerformed

    private void btn_Update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Update3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Update3ActionPerformed

 
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountPage(uDetails).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ChoseSearch;
    private javax.swing.JLabel UserNameDis;
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Cleare;
    private javax.swing.JButton btn_Close;
    private javax.swing.JButton btn_Home;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Update1;
    private javax.swing.JButton btn_Update2;
    private javax.swing.JButton btn_Update3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField enterEmail;
    private javax.swing.JTextField enterEmail1;
    private javax.swing.JTextField enterEmail2;
    private javax.swing.JTextField enterEmail3;
    private javax.swing.JTextField enterName;
    private javax.swing.JTextField enterName1;
    private javax.swing.JTextField enterName2;
    private javax.swing.JTextField enterName3;
    private javax.swing.JTextField enterSId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable studentTable;
    private javax.swing.JTable studentTable1;
    // End of variables declaration//GEN-END:variables

    

}
