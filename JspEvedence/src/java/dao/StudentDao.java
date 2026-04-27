
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
   
    
    DbUtil util = new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    public int save(){
    
    
    }
    
     public List<Student> getAllStudents() {
       List<Student> students = new ArrayList<>();
       sql = "select * from student";
        try {
            ps=util.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            
            while (rs.next()) {                
                Student s=new Student(
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
}
