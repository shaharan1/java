package advancejavaevedence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvanceJavaEvedence {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

    }

    public static Connection getCon() {
        String url = "jdbc:mysql://localhost:3306/evedence";
        String user = "root";
        String password = "1234";
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdvanceJavaEvedence.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;

    }

    public static void createData(String name, String email, float fee) {
        String createSql = "insert into student(name,email,fee) valuse(?,?,?)";

        try {
            ps = getCon().prepareStatement(createSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(32, fee);
            ps.executeUpdate();
            
            ps.close();
            getCon().close();
            
            System.out.println("Data Saved");

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEvedence.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Data Not Saved");

        }

    }
    
    public static void showAllData (){
    
    
    }

}
