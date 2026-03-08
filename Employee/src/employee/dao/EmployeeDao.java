/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.dao;

import employee.model.Employee;
import employee.util.EmployeeDbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class EmployeeDao {

    EmployeeDbUtil db = new EmployeeDbUtil();
    PreparedStatement ps;
    String sql = null;
    private ResultSet rs;

    public void saveUser(User user) {
        sql = "insert into user (name,salary,email)values(?,?,?)";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setDouble(3, user.getSalary());

            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            JOptionPane.showMessageDialog(null, "Data Inserted");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data not Insert");
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Employee e) {
        sql = "update employee set name=?,salary=?,email=? where id=? ";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setDouble(2, e.getSalary());
            ps.setString(3, e.getEmail());

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

            JOptionPane.showMessageDialog(null, "Data Updated");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data not Update");
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Employee> findAll(Employee e) throws SQLException {

        sql = "select * from employee";
        List<Employee> elist = new ArrayList<>();

        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                e = new Employee(rs.getInt("id"));
                rs.getString("name");
                rs.getDouble("salary");
                rs.getString("email");
                elist.add(e);

            }

            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {

        }
       
        

        return elist;

    }

    public void delete(int id) {
        sql = "delete from employee where id=?";

        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            db.getCon().close();
            JOptionPane.showMessageDialog(null, "Data Deleted");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data not Deleted");
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
