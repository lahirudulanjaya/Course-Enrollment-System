/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_control;

import NSBMCourseEnrollmentSystem_DB_connection.DB_connection;
import NSBMCourseEnrollmentSystem_model.Lab;
import NSBMCourseEnrollmentSystem_model.Room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class class_allocation_controll {
    
     public static void add_room(Room as) throws SQLException{
        Connection con =DB_connection.getConnection();
        String sql ="insert into room values(?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,as.getRoomno());
        pst.setObject(2,as.getSubject());
        pst.setObject(3,as.getDate());
        pst.setObject(4,as.getTime());
        pst.executeUpdate();
        
    }
     public static void add_lab(Lab as) throws SQLException{
        Connection con =DB_connection.getConnection();
        String sql ="insert into room values(?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,as.getLabno());
        pst.setObject(2,as.getInstuctor_id());
        pst.setObject(3,as.getSubject());
        pst.setObject(4,as.getDate());
        pst.setObject(5,as.getTime());
        pst.executeUpdate();
        
    }
    
}
