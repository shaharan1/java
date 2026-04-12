package advanceevd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvanceEVD {



    public static void main(String[] args) {
        createData("Shaharan Hossain", "Senior Manager", Date.valueOf("2020-05-10"), 70000);
        createData("Badrul Amin", "Manager", Date.valueOf("2010-01-01"), 50000);
        createData("Abul Hasan", "HR", Date.valueOf("2014-11-30"), 40000);

        showAllData();
        System.out.println("-------------------");

        deleteData(1);
        
        showAllData();
        System.out.println("-------------------");
        
        
        updateData(2, "Badrul Amin", "Senior Manager", Date.valueOf("2010-01-01"), 75000);
        updateData(3, "Abul Hasan", "CEO", Date.valueOf("2014-11-30"), 90000);
        
        showAllData();
        System.out.println("-------------------");

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

    public static void createData(String name, String designation, Date joining_date, double salary) {
        String createSql = "INSERT INTO employee (name, designation, joining_date, salary) VALUES (?, ?, ?, ?)";
        try (Connection con = getCon(); PreparedStatement ps = con.prepareStatement(createSql)) {
            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setDate(3, joining_date);
            ps.setDouble(4, salary);
            ps.executeUpdate();
            System.out.println("Data Saved");
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceEVD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Not Saved");
        }
    }

    public static void showAllData() {
        String selectSql = "SELECT * FROM employee";

        try (Connection con = getCon(); PreparedStatement ps = con.prepareStatement(selectSql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " "
                        + rs.getString("name") + " "
                        + rs.getString("designation") + " "
                        + rs.getDate("joining_date") + " "
                        + rs.getDouble("salary"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceEVD.class.getName()).log(Level.SEVERE, null, ex);
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

    public static void updateData(int id, String name, String designation, Date joining_date, double salary) {
        String updateSql = "UPDATE employee SET name = ?, designation = ?, joining_date = ?, salary = ? WHERE id = ?";
        try (Connection con = getCon(); PreparedStatement ps = con.prepareStatement(updateSql)) {

            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setDate(3, joining_date);
            ps.setDouble(4, salary);
            ps.setInt(5, id);

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
