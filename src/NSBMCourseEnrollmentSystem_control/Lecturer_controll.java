/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_control;

import NSBMCourseEnrollmentSystem_DB_connection.DB_connection;
import NSBMCourseEnrollmentSystem_model.Lecturer;
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
public class Lecturer_controll {
    public static void add(Lecturer std) throws SQLException{
        String sql = "insert into lecturer  values(?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection con =DB_connection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,std.getLecturer_id());
        pst.setObject(2,std.getName());
        pst.setObject(12,std.getDOB());
        pst.setObject(11,std.getAge());
        pst.setObject(6,std.getGender());
        pst.setObject(3,std.getAddress());
        pst.setObject(5,std.getEmail());
        pst.setObject(4,std.getPhone_number());
        pst.setObject(10,std.getCourse_id());
        pst.setObject(9,std.getFaculty_id());
        pst.setObject(7,std.getRoom_num());
        pst.setObject(8,std.getSubject());
        
        pst.executeUpdate();
        
        
    }
    public static Lecturer search(String id) throws SQLException{
        String sql = "select * from lecturer where Lecturer_ID=?";
        Connection con =DB_connection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1, id);
        ResultSet rs = pst.executeQuery();
        Lecturer std =new Lecturer();
        if(rs.next()){
            
            std.setLecturer_id(rs.getString(1));
            std.setName(rs.getNString(2));
            std.setAge(rs.getInt(11));
            std.setGender(rs.getString(6));
            std.setAddress(rs.getString(3));
            std.setEmail(rs.getString(5));
            std.setSubject(rs.getString(8));
            std.setPhone_number(rs.getInt(4));
            std.setFaculty_id(rs.getString(9));
            std.setCourse_id(rs.getString(10));
            std.setRoom_num(rs.getInt(7));
            std.setDOB(rs.getString(12));
            
            
            
            return std;
             }
        else{
            return null;
        }
                
    }
    public static void Lecturer_delete(String id) throws SQLException{
        String sql ="delete from lecturer where Lecturer_ID=?";
        Connection con =DB_connection.getConnection();
        PreparedStatement pst =con.prepareStatement(sql);
        pst.setObject(1,id);
        pst.executeUpdate();
    }
     public static void Lecturer_update(Lecturer std) throws SQLException{
        String sql = "update Lecturer set Name=?,Address=?,Contact_num=?,Email=?,Gender=?,Room_Room_ID=?,Subject_Subject_code=?,Faculty_id=?,Course_id=?,Age=?,DOB=? where Lecturer_ID =?";
        Connection con =DB_connection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        
       
        pst.setObject(12,std.getLecturer_id());
        pst.setObject(1,std.getName());
        pst.setObject(11,std.getDOB());
        pst.setObject(10,std.getAge());
        pst.setObject(5,std.getGender());
        pst.setObject(2,std.getAddress());
       pst.setObject(4,std.getEmail());
        pst.setObject(3,std.getPhone_number());
        pst.setObject(9,std.getCourse_id());
        pst.setObject(8,std.getFaculty_id());
        pst.setObject(6,std.getRoom_num());
        pst.setObject(7,std.getSubject());
        pst.executeUpdate();
     }
     public static ArrayList<Lecturer> getall() throws SQLException{
         Connection con = DB_connection.getConnection();
         String sql = "select * from Lecturer";
         Statement st = con.createStatement();
         ResultSet rs =st.executeQuery(sql);
         ArrayList<Lecturer> leclist =new ArrayList<>();
         while (rs.next()){
             Lecturer std =new Lecturer();
             std.setLecturer_id(rs.getString(1));
            std.setName(rs.getNString(2));
            std.setAge(rs.getInt(11));
            std.setGender(rs.getString(6));
            std.setAddress(rs.getString(3));
            std.setEmail(rs.getString(5));
            std.setSubject(rs.getString(8));
            std.setPhone_number(rs.getInt(4));
            std.setFaculty_id(rs.getString(9));
            std.setCourse_id(rs.getString(10));
            std.setRoom_num(rs.getInt(7));
            std.setDOB(rs.getString(12));
            leclist.add(std);
         }
         return leclist;
     }
            
             
    
    
}
