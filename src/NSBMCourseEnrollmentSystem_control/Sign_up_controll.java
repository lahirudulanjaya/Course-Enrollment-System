/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_control;

import NSBMCourseEnrollmentSystem_DB_connection.DB_connection;
import NSBMCourseEnrollmentSystem_view.Sign_up;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Sign_up_controll {
    
    public static void add(String user ,String password,String id) throws SQLException{
        
            try {
                Connection con = DB_connection.getConnection();
                String sql ="insert into Register values(?,PASSWORD(?),?)";
                PreparedStatement pst =con.prepareStatement(sql);
                pst.setObject(1,user);
                pst.setObject(2,password);
                pst.setObject(3,id);
                pst.executeUpdate();
                }
            catch (SQLException ex) {
                Logger.getLogger(Sign_up.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        
    }
    public static boolean search(String user,String password) throws SQLException{
        String sql ="select * from Register where User_Name=? and Password=PASSWORD(?)";
         Connection con = DB_connection.getConnection();
        PreparedStatement pst =con.prepareStatement(sql);
        pst.setObject(1,user);
        pst.setObject(2,password);
        ResultSet rs =pst.executeQuery();    
        return rs.next();
    }
    
    public static boolean checkvalidity(String id) throws SQLException{
        String sql ="select * from undergraduate_student where StudentId=?";
        Connection con = DB_connection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,id);
        ResultSet rs = pst.executeQuery();
        return rs.next();
        
    }
            
            
           
        
        
       
        
        
    }
    
    

