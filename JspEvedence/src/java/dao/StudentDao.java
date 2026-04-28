package dao;

import entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class StudentDao {

    static DbUtil util = new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static int saveStudent(Student s) {

        if (!(s.getName().isEmpty())) {

        }

        int status = 0;
        sql = "insert into student(name, email, dob, fee) values(?,?,?,?)";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getDob());
            ps.setDouble(4, s.getFee());

            status = ps.executeUpdate();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        sql = "select * from student";
        try {
            ps = util.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("dob"),
                        rs.getDouble("fee")
                );
                students.add(s);
            }

            ps.close();
            rs.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public static void deleteStudent(int id) {
        sql = "delete from student where id= ?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Student getById(int id) {
        Student s = null;
        sql = "select * from student where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("dob"),
                        rs.getDouble("fee")
                );
            }

            rs.close();
            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    public static int updateStudent(Student s) {
        int status = 0;
        sql = "update student set name= ?, email= ?, dob= ?, fee=? where id=?";
       
        try {
            ps = util.getCon().prepareStatement(sql);
            
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getDob());
            ps.setDouble(4, s.getFee());
            ps.setInt(5, s.getId());

            status = ps.executeUpdate();
            
           
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

}
