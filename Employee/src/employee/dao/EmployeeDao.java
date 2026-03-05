/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.dao;

import employee.model.Employee;
import employee.util.EmployeeDbUtil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class EmployeeDao {

    EmployeeDbUtil db = new EmployeeDbUtil();
    PreparedStatement ps;
    String sql = null;

    public void saveUser(User user) {
        sql = "insert into user (name,salary,email)values(?,?,?)";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setDouble(3, user.getSalary());
            ps.setInt(4, user.getId());

            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Employee> findAll() {
 
        sql = "select * from employee";
        List<Employee> list = new ArrayList<>();
        Employee c;
         ps = dbc.getCon().prepareStatement(sql);
          
        return null;

    }
}
