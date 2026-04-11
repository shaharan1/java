package advanceevd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvanceEVD {

    static PreparedStatement ps;
    static ResultSet rs;
//    private static int id;
//    private static String name;
//    private static float salary;
//    private static String department_name;

    public static void main(String[] args) {
        createEmployeeData("Shaharan", 50000, "JAVA");
        createEmployeeData("PK", 60000, "HTML");
        createEmployeeData("Abul", 70000, "PHP");
        showAllData();
        System.out.println("....................");

        deleteData(2);
        showAllData();
        System.out.println("....................");

        updateData(3, "Abul Updated", 75000, "Advanced PHP");
        showAllData();
        System.out.println("....................");
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
            Logger.getLogger(AdvanceEVD.class
                    .getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AdvanceEVD.class
                    .getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AdvanceEVD.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteData(int id) {
        String deleteSql = "DELETE FROM employee WHERE id = ?";
        try (Connection con = getCon(); PreparedStatement ps = con.prepareStatement(deleteSql)) {

            ps.setInt(1, id);
            int status = ps.executeUpdate();

            if (status > 0) {
                System.out.println("Data Deleted Successfully");
            } else {
                System.out.println("No Data Found with ID: " + id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceEVD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Not Deleted");
        }
    }

    public static void updateData(int id, String name, float salary, String department_name) {
        String updateSql = "UPDATE employee SET name = ?, salary = ?, department_name = ? WHERE id = ?";
        try {
            ps = getCon().prepareStatement(updateSql);

            ps.setString(1, name);
            ps.setFloat(2, salary);
            ps.setString(3, department_name);
            ps.setInt(4, id);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data Updated Successfully");
            } else {
                System.out.println("No record found with ID: " + id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceEVD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Not Updated");
        }
    }

    

}
