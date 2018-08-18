/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_model;

import java.text.DecimalFormat;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Result {
    private String index_num;
    private String Subject;
    private double Avg_assignment;
    private double Exam_mark;
    private double final_mark;
    private String Grade;

    public double getGPV() {
        DecimalFormat df = new DecimalFormat("#.####");
        return Double.parseDouble(df.format(final_mark/22.5));
    }

    public void setGPV() {
        this.GPV = final_mark/22.5;
    }
    private double GPV;
    
    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }
  

    public double getFinal_mark() {
        return final_mark;
    }

    public void setFinal_mark() {
        this.final_mark =(Avg_assignment+ Exam_mark)/2;
    }


    

    public double getAvg_assignment() {
        return Avg_assignment;
    }

    public void setAvg_assignment(double Avg_assignment) {
        this.Avg_assignment = Avg_assignment;
    }

    public double getExam_mark() {
        return Exam_mark;
    }

    public void setExam_mark(double Exam_mark) {
        this.Exam_mark = Exam_mark;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade() {
        this.Grade = grade();
    }

    public String getIndex_num() {
        return index_num;
    }

    public void setIndex_num(String index_num) {
        this.index_num = index_num;
    }
    
    public String grade(){
        if(final_mark>75){
            return "A";}
        else if(final_mark>65){
            return "B";
         }
        else if(final_mark>50){
            return "C";
        }
        else if(final_mark>35){
            return "D";
        }
        else{
            return "E";
        }
        
    }

    
    

    
}
