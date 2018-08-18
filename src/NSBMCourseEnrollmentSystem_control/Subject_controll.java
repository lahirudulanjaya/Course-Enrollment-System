/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_control;

import NSBMCourseEnrollmentSystem_DB_connection.DB_connection;
import NSBMCourseEnrollmentSystem_model.Subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Subject_controll {
    public static ArrayList<Subject> view_notcompulsory(String id) throws SQLException{
        Connection con =DB_connection.getConnection();
        String sql = "select subject.Subject_code,subject.Name,subject.Compulsory from subject where subject.Courses_Course_Id=(select Courses_Course_Id from undergraduate_student where StudentId=?) and subject.Compulsory=0";
        PreparedStatement pst =con.prepareStatement(sql);
        pst.setObject(1, id);
        ResultSet rs =  pst.executeQuery();
        ArrayList<Subject> subject = new ArrayList<Subject>();
        while(rs.next()){
            Subject sub =new Subject();
            sub.setName(rs.getString(2));
            sub.setSubject_code(rs.getString(1));
            sub.setCompulsory(rs.getBoolean(3));
            subject.add(sub);
        }
        return subject;
    }
     public static ArrayList<Subject> view_compulsory(String id) throws SQLException{
        Connection con =DB_connection.getConnection();
        String sql = "select subject.Subject_code,subject.Name,subject.Compulsory from subject where subject.Courses_Course_Id=(select Courses_Course_Id from undergraduate_student where StudentId=?) and subject.Compulsory=1";
        PreparedStatement pst =con.prepareStatement(sql);
        pst.setObject(1, id);
        ResultSet rs =  pst.executeQuery();
        ArrayList<Subject> subject = new ArrayList<Subject>();
        while(rs.next()){
            Subject sub =new Subject();
            sub.setName(rs.getString(2));
            sub.setSubject_code(rs.getString(1));
            sub.setCompulsory(rs.getBoolean(3));
            subject.add(sub);
        }
        
        return subject;
        
    }
     public static void add(Subject std) throws SQLException{
        String sql = "insert into subject values(?,?,?,?,?,?,?)";
        Connection con =DB_connection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,std.getSubject_code());
        pst.setObject(2,std.getName());
        
        pst.setObject(3,std.getCredits());
        pst.setObject(4,std.getCourse());
        pst.setObject(7,std.isCompulsory());
       
        pst.setObject(5,std.getYear());
        pst.setObject(6,std.getSemester());
        pst.executeUpdate();
        
        
    }
      public static Subject getsub(String name) throws SQLException{
         Connection con = DB_connection.getConnection();
         String sql = "select * from Subject where Subject_code =?";
         PreparedStatement pst = con.prepareStatement(sql);
         pst.setObject(1,name);
         ResultSet rs = pst.executeQuery();
         
             Subject us =new Subject();
             if(rs.next()){
            us.setSubject_code(rs.getString(1));
            us.setName(rs.getNString(2));
            us.setCredits(Integer.parseInt(rs.getString(3)));
            us.setCourse(rs.getString(4));
            
            us.setYear(Integer.parseInt(rs.getString(5)));
            us.setSemester(rs.getInt(6));
            us.setCompulsory(rs.getBoolean(7));
            
          return us;
             }
             else{
                 return null;
             }
          
     }
      public static void Subject_update(Subject std) throws SQLException{
        String sql = "update Subject set Subject_code=?,Name=?,Credit=?,Courses_Course_Id=?,Year=?,Semester=?,Compulsory=?";
        Connection con =DB_connection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
 
        pst.setObject(1,std.getCourse());
        
        pst.setObject(2,std.getName());
        pst.setObject(3,std.getCredits());
        pst.setObject(4,std.getSubject_code());
       
        pst.setObject(5,std.getYear());
        pst.setObject(6,std.getSemester());
        pst.setObject(7,std.isCompulsory());
        

        pst.executeUpdate();
        
        
    }
       public static void Subject_delete(String id) throws SQLException{
        String sql ="delete from Subject where Subject_code=?";
        Connection con =DB_connection.getConnection();
        PreparedStatement pst =con.prepareStatement(sql);
        pst.setObject(1,id);
        pst.executeUpdate();
    }
            
}
