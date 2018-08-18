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
public class Selected_Subjects {
    private String Student_id;
    private String Subject_code;
    private boolean compulsory;

    public boolean isCompulsory() {
        
        return compulsory;
        
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }

    public String getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(String Student_id) {
        this.Student_id = Student_id;
    }

    public String getSubject_code() {
        return Subject_code;
    }

    public void setSubject_code(String Subject_code) {
        this.Subject_code = Subject_code;
    }
    
}
