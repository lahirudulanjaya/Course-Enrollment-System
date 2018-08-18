/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_control;

import NSBMCourseEnrollmentSystem_DB_connection.DB_connection;
import NSBMCourseEnrollmentSystem_model.Assignment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Assignment_controll {
    public static void add(Assignment as) throws SQLException{
        Connection con =DB_connection.getConnection();
        String sql ="insert into assignment(Assignment_ID,Name,Marks,Grade,Student_Id,Subject_Code) values(?,?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,as.getAssignment_id());
        pst.setObject(2,as.getName());
        pst.setObject(3,as.getMarks());
        pst.setObject(4,as.getGrade());
        pst.setObject(5,as.getStudent_id());
        pst.setObject(6,as.getSubject_code());
        
        pst.executeUpdate();
        
    }
    public static Assignment get_grade(String id) throws SQLException{
        Assignment as =new Assignment();
        Connection con =DB_connection.getConnection();
        String sql ="select * from Student_Id";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs =pst.executeQuery();
        if(rs.next()){
            as.setAssignment_id(rs.getString(1));
            as.setName(rs.getString(2));
            as.setMarks(rs.getInt(3));
            as.setGrade(rs.getString(4));
            as.setSubject_code(rs.getString(6));
            as.setSubject_code(rs.getString(5));
            return as;
        }
        else{
            return null;
        }
    }
     public static ArrayList<Assignment> getall(String id,String sub_code) throws SQLException{
         Connection con = DB_connection.getConnection();
         String sql = "select Name,Marks,Grade from assignment where Student_Id=? and Subject_Code=?";
         
         
         PreparedStatement st = con.prepareStatement(sql);
         st.setObject(1, id);
         st.setObject(2, sub_code);
         ResultSet rs = st.executeQuery();
         ArrayList<Assignment> list = new ArrayList<>();
         while(rs.next()){
             Assignment as =new Assignment();
             as.setName(rs.getString(1));
             as.setMarks(rs.getInt(2));
             as.setGrade(rs.getString(3));
             
             list.add(as);
         }
         return list;
         
     }
    
        
        
 }
    

