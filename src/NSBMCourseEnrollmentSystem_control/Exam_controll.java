/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_control;

import NSBMCourseEnrollmentSystem_DB_connection.DB_connection;
import NSBMCourseEnrollmentSystem_model.Exam;
import NSBMCourseEnrollmentSystem_model.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Exam_controll {
    //adding Exam marks to the database
    public static void add(Exam ex) throws SQLException{
        Connection con =DB_connection.getConnection();//Connect to mysql
        String sql ="insert into Exam(Student_Id,Course,Subject_code,Year,Semester,Exam_name,Exam_marks,Exam_grade) values(?,?,?,?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,ex.getStudent_Id());
        pst.setObject(2,ex.getCourse());
        pst.setObject(3,ex.getSubject_code());
        pst.setObject(4,ex.getYear());
        pst.setObject(5,ex.getSemester());
        pst.setObject(6,ex.getExam_name());
        pst.setObject(7,ex.getExam_marks());
        pst.setObject(8,ex.getExam_grade());
        
        pst.executeUpdate();
        
    }
    public static ArrayList<Result> results(String id) throws SQLException{
        Connection con =DB_connection.getConnection();
        String sql ="select assignment.Student_Id,assignment.Subject_Code,AVG(Marks),Exam_marks from assignment inner join exam on exam.Subject_code = assignment.Subject_Code where assignment.Student_Id =? group by Subject_Code";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,id);
        ResultSet rs = pst.executeQuery();
        ArrayList<Result> result = new ArrayList<>();
        while(rs.next()){
            Result res =new Result();
           res.setIndex_num(rs.getString(1));
           res.setSubject(rs.getString(2));
           res.setAvg_assignment(rs.getDouble(3));
           res.setExam_mark(rs.getDouble(4));
           res.setFinal_mark();
           res.setGrade();
           result.add(res);
            
        }
        return result;
        
    }
    public static void add(String id,double avg,double gpv) throws SQLException{
        Connection con =DB_connection.getConnection();
        String sql ="insert into Rank values(?,?,?)";
         PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,id);
        pst.setObject(2,avg);
        pst.setObject(3, gpv);
        pst.executeUpdate();
    }
    public static ArrayList<Exam> getall(String id) throws SQLException{
         Connection con = DB_connection.getConnection();
         String sql = "select Subject_code,Exam_marks,Exam_grade from exam where Student_Id=?";
         
         
         PreparedStatement st = con.prepareStatement(sql);
         st.setObject(1, id);
         
         ResultSet rs = st.executeQuery();
         ArrayList<Exam> list = new ArrayList<>();//array list of Exam objects
         while(rs.next()){
             Exam as =new Exam();
             as.setSubject_code(rs.getString(1));
             as.setExam_marks(rs.getInt(2));
             as.setExam_grade(rs.getString(3));
             
             list.add(as);
         }
         return list;
    
    }
    
    
    
}
