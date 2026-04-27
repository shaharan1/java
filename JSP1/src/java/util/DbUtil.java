
package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbUtil {
     private static Connection c = null;
    private static String url = "jdbc:mysql://localhost:3306/jspevd";
    private static String user = "root";
    private static String password = "1234";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    
    public  Connection con(){
    
         try {
             Class.forName(driver);
             c=DriverManager.getConnection(url, user, password);
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
         }
         return con();
    }
    
}
   
