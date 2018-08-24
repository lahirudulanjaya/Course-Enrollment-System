/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_control;

import NSBMCourseEnrollmentSystem_DB_connection.DB_connection;
import NSBMCourseEnrollmentSystem_model.Selected_Subjects;
import NSBMCourseEnrollmentSystem_model.Subject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Selected_Subject_controll {
    
    public static void add_subject(Selected_Subjects sub) throws SQLException{
        //insert values to selected_subject table
        Connection con = DB_connection.getConnection();//create database connection
        String sql ="insert into selected_subject values(?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(2,sub.getSubject_code());
        pst.setObject(1,sub.getStudent_id());
        pst.setObject(3,sub.isCompulsory());
        
        pst.executeUpdate();
        
    }
    public static boolean allreadyexists(String id) throws SQLException{
        Connection con = DB_connection.getConnection();
        String sql ="select * from selected_subject where Student_Id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,id);
        ResultSet rs= pst.executeQuery();
        
        return rs.next();
        
    }
    public static void Update_subject(Selected_Subjects ss) throws SQLException{
        Connection con = DB_connection.getConnection();
        String sql ="update selected_subject set Subject_Code=? where Student_Id=? and Compulsory=? ";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,ss.getSubject_code());
        pst.setObject(2,ss.getStudent_id());
        pst.setObject(3,false);
        
        pst.executeUpdate();
    }
    public static void Delete_subject(String id) throws SQLException{
        Connection con = DB_connection.getConnection();
        String sql ="delete from selected_subject where Student_Id=? and Compulsory=? ";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,id);
        pst.setObject(2,false);
        pst.executeUpdate();
    }
    public static ArrayList<Selected_Subjects> Selected_subject_list(String id) throws SQLException{
        
        Connection con = DB_connection.getConnection();
        String sql ="select Subject_Code from selected_subject where Student_Id =?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,id);
        ResultSet rs = pst.executeQuery();
        ArrayList<Selected_Subjects> Sub_list =new ArrayList<>();
        while(rs.next()){
            Selected_Subjects ss =new Selected_Subjects();
            ss.setSubject_code(rs.getString(1));
            
            Sub_list.add(ss);
        }
        return Sub_list;
        
    }
        

    
    
}
