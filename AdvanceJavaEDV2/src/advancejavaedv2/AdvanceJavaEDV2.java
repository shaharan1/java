package advancejavaedv2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvanceJavaEDV2 {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

        createEmployeeData("Shaharan", 50000, "IT");
        createEmployeeData("Masud", 60000, "UML");
        createEmployeeData("Tanvir", 70000, "DEV");

        showAllData();
        deleteData(2);
    }

    public static Connection getCon() {
        String url = "jdbc:mysql://localhost:3306/practice";
        String user = "root";
        String password = "1234";
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = java.sql.DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdvanceJavaEDV2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static void createEmployeeData(String name, float salary, String department_name) {
        String createSql = "insert into employee (name,salary,department_name) values(?,?,?)";

        try {
            ps = getCon().prepareStatement(createSql);
            ps.setString(1, name);
            ps.setFloat(2, salary);
            ps.setString(3, department_name);
            ps.executeUpdate();

            ps.close();
            getCon().close();

            System.out.println("Data Saved");

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEDV2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Not Saved");

        }
    }

    public static void showAllData() {
        String selectSql = "select * from employee";

        try {
            ps = getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " "
                        + rs.getString("name") + " "
                        + rs.getFloat(3) + " "
                        + rs.getString(4));

            }
            ps.close();
            rs.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEDV2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteData(int id) {
        String deleteSql = "DELETE FROM employee WHERE id = ?";

        try {
            ps = getCon().prepareStatement(deleteSql);

            ps.setInt(1, id);
            int status = ps.executeUpdate();

            if (status > 0) {
                System.out.println("Data Deleted Successfully");
            } else {
                System.out.println("No Data Found with ID: " + id);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEDV2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Not Deleted");
        }
    }

}
