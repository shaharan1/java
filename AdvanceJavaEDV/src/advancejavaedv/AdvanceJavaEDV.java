package advancejavaedv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvanceJavaEDV {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

        createStudent("Badrul", "badrul@gmail.com", 2000);
        createStudent("Tanvir", "Tanvir@gmail.com", 3000.00f);
        createStudent("Emon", "Emon@gmail.com", 4000.00f);
        showAllStudent();

        System.out.println("-----------------------------------------");
        deleteStudent(2);
        deleteStudent(3);

        showAllStudent();
        System.out.println("-----------------------------------------");
        updateStudent("Emon", "Emon@gmail.com", 4000.00f, 2);

        showAllStudent();
        System.out.println("-----------------------------------------");

        deleteStudent(10);

    }

    public static Connection getCon() {

        String url = "jdbc:mysql://localhost:3306/practice";
        String user = "root";
        String password = "1234";
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdvanceJavaEDV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;

    }

    public static void createStudent(String name, String email, float fee) {

        String createSql = "insert into student(name,email,fee) values(?,?,?)";

        try {
            ps = getCon().prepareStatement(createSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);

            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Data Saved");
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEDV.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Not Saved");
        }
    }

    public static void showAllStudent() {

        String selectSql = "select * from student";
        try {
            ps = getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String student = rs.getInt(1) + " "
                        + rs.getString("name") + " "
                        + rs.getString(3) + " "
                        + rs.getFloat("fee");

                System.out.println(student);
            }

            rs.close();
            ps.close();
            getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEDV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteStudent(int id) {
        String deleteSql = "delete from student where id = ?";

        try {
            ps = getCon().prepareStatement(deleteSql);
            ps.setInt(1, id);

            int status = ps.executeUpdate();
            if (status > 0) {
                System.out.println("Student ID " + id + " Deleted ");
            } else {
                System.out.println("Student Data Not Deleted");
            }

            ps.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEDV.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Student Data Not Deleted");
        }

    }

    public static void updateStudent(String name, String email, float fee, int id) {
        String updateSql = "update student set name =?, email = ?, fee=? where id=?";
        try {
            ps = getCon().prepareStatement(updateSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);
            ps.setInt(4, id);

            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Data Updated");

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEDV.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Data Not Updated");
        }

    }

   
    
   
}
