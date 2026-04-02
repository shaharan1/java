package advancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvanceJava {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

        createStudent("Shaharan", "shaharan@gmail.com", 1540, "Sourthren Hall");
        createStudent("Rasel", "rasel@gmail.com", 7500, "Forhad Hall");
        createStudent("Bijoy", "bijoy@gmail.com", 1460, "West Hall");
        createStudent("Sumon", "sumon@gmail.com", 8700, "International Hall");
        showAllStudentData();
    }

    public static Connection getCon() {
        String url = "jdbc:mysql://localhost:3306/exam";
        String user = "root";
        String password = "1234";
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;

    }

    public static void createStudent(String name, String email, float fee, String adress) {

        String createSql = "insert into student(name,email,fee,adress) values(?,?,?,?)";
        try {
            ps = getCon().prepareStatement(createSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);
            ps.setString(4, adress);

            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Data Saved");
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Data Not Saved");

        }

    }

    public static void showAllStudentData() {

        String selectSql = "select * from student";
        try {
            ps = getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String student = rs.getInt("id") + " "
                    + rs.getString("name") + " "
                    + rs.getString("email") + " "
                    + rs.getFloat("fee") + " "
                    + rs.getString("adress");
            System.out.println(student);
            }
            ps.close();
            rs.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
