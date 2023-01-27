
package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection {
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";    
    private static final String DBURL = "jdbc:mysql://localhost:3306/java_b4";    
    private static final String USERNAME = "root";    
    private static final String PASSWORD = "";   
    
    Connection con;
    
    public Connection doConnect(){
        try{
            
            Class.forName(DRIVER_NAME);
            con = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
        }catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
            
        } catch (SQLException ex) { 
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    
    
}
