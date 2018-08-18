/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_model;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Assignment {
    private String Assignment_id;
    private String name;
    private int marks;
    private String Grade;
    private String Student_id;
    private String Subject_code;

    public String getSubject_code() {
        return Subject_code;
    }

    public void setSubject_code(String Subject_code) {
        this.Subject_code = Subject_code;
    }

    public String getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(String Student_id) {
        this.Student_id = Student_id;
    }

    public String getAssignment_id() {
        return Assignment_id;
    }

    public void setAssignment_id(String Assignment_id) {
        this.Assignment_id = Assignment_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
    
    
    
}
