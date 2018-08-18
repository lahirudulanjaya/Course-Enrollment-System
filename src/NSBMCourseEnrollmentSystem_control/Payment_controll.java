/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_control;

import NSBMCourseEnrollmentSystem_DB_connection.DB_connection;
import NSBMCourseEnrollmentSystem_model.Selected_Subjects;
import NSBMCourseEnrollmentSystem_model.payment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Payment_controll {
    
    
    public static void add_payment(payment p) throws SQLException{
     String sql = "insert into payment values(?,?)";
     
        Connection con =DB_connection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1, p.getStudent_id());
        pst.setObject(2, p.getSubject_code());
        pst.executeUpdate();
        
        
    }
    public static String getpayment(String id) throws SQLException{
        String sql = "select Subject_Code from selected_subject where Student_Id=?";
        Connection con =DB_connection.getConnection();
        PreparedStatement st = con.prepareStatement(sql);
         st.setObject(1, id);
         ResultSet rs = st.executeQuery();
        String f ="";
         while(rs.next()){
             f=f+rs.getString(1)+"\n";
         }
             
         return f;
        
    }
     public static String check(String id) throws SQLException{
        String sql = "select Subject_Code from selected_subject where Student_Id=?";
         String sql1 = "select Subject_Code from payment where Student_Id=?";
        Connection con =DB_connection.getConnection();
        PreparedStatement st = con.prepareStatement(sql);
        PreparedStatement st1 = con.prepareStatement(sql1);
         st.setObject(1, id);
         st1.setObject(1, id);
         ResultSet rs = st.executeQuery();
         ResultSet rs1= st1.executeQuery();
         String g="";
        String f="";
        ArrayList<String> lis = new ArrayList<>();
         while(rs1.next()){
             lis.add(rs1.getString(1));
                 
             }
         while(rs.next()){
              f ="not paid";
             for(int i=0;i<lis.size();i++){
                 if(rs.getString(1).equals(lis.get(i))){
                     f="paid";
                     
                 }
             }
             
             
         
            
             g=g+f+"\n";
                 
             }
         return g;
     }
         
             
              
             
         
             
         
    
    
}
