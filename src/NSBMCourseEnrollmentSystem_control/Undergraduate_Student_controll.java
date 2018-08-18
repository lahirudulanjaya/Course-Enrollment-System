/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_control;

import NSBMCourseEnrollmentSystem_DB_connection.DB_connection;
import NSBMCourseEnrollmentSystem_model.Undergraduate_Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Lahiru Dulanjaya
 */
public class Undergraduate_Student_controll {
    
    public static void add(Undergraduate_Student std) throws SQLException{
        String sql = "insert into undergraduate_student  values(?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection con =DB_connection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,std.getAdmission_number());
        pst.setObject(2,std.getName());
        pst.setObject(6,std.getDOB());
        pst.setObject(3,std.getAge());
        pst.setObject(4,std.getGender());
        pst.setObject(5,std.getAddress());
       
        pst.setObject(7,std.getPhone_number());
        pst.setObject(8,std.getCourse());
        pst.setObject(9,std.getFaculty());
        pst.setObject(10,std.getYear());
        pst.setObject(11,std.getSem());
        pst.setObject(12,std.getEmail());

        pst.executeUpdate();
        
        
    }
    public static Undergraduate_Student search(String id) throws SQLException{
        String sql = "select * from undergraduate_student where StudentId=?";
        Connection con =DB_connection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1, id);
        ResultSet rs = pst.executeQuery();
        Undergraduate_Student std =new Undergraduate_Student();
        if(rs.next()){
            
            std.setAdmission_number(rs.getString(1));
            std.setName(rs.getNString(2));
            std.setAge(rs.getInt(3));
            std.setGender(rs.getString(4));
            std.setAddress(rs.getString(5));
            std.setDOB(rs.getString(6));
            std.setPhone_number(rs.getInt(7));
            std.setFaculty(rs.getString(9));
            std.setCourse(rs.getString(8));
            std.setYear(rs.getInt(10));
            std.setSem(rs.getInt(11));
            return std;
             }
        else{
            return null;
        }
                
    }
    public static void Undergraduate_Student_delete(String id) throws SQLException{
        String sql ="delete from undergraduate_student where StudentId=?";
        Connection con =DB_connection.getConnection();
        PreparedStatement pst =con.prepareStatement(sql);
        pst.setObject(1,id);
        pst.executeUpdate();
    }
     public static void Undergraduate_Student_update(Undergraduate_Student std) throws SQLException{
        String sql = "update undergraduate_student set Name=?,Age=?,Gender=?,Address=?,DOB=?,Phn_num=?,Courses_Course_Id=?,Faculty_FacultyId=?,Year=?,Semester=? where StudentId =?";
        Connection con =DB_connection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(11,std.getAdmission_number());
        pst.setObject(1,std.getName());
        pst.setObject(5,std.getDOB());
        pst.setObject(2,std.getAge());
        pst.setObject(3,std.getGender());
        pst.setObject(4,std.getAddress());
       
        pst.setObject(6,std.getPhone_number());
        pst.setObject(7,std.getCourse());
        pst.setObject(8,std.getFaculty());
        pst.setObject(9,std.getYear());
        pst.setObject(10,std.getSem());

        pst.executeUpdate();
        
        
    }
     public static ArrayList<Undergraduate_Student> getall() throws SQLException{
         Connection con = DB_connection.getConnection();
         String sql = "select * from undergraduate_student";
         Statement st = con.createStatement();
         ResultSet rs =st.executeQuery(sql);
         ArrayList<Undergraduate_Student> stdlist =new ArrayList<>();
         while (rs.next()){
             Undergraduate_Student us =new Undergraduate_Student();
            us.setAdmission_number(rs.getString(1));
            us.setName(rs.getNString(2));
            us.setAge(rs.getInt(3));
            us.setGender(rs.getString(4));
            us.setAddress(rs.getString(5));
            us.setDOB(rs.getString(6));
            us.setPhone_number(rs.getInt(7));
            us.setFaculty(rs.getString(9));
            us.setCourse(rs.getString(8));
            
            stdlist.add(us);
             
         }
         return stdlist;
     }
    
}
    

