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
public class practical_subject {
    private String Subject_code;
    private String name;
    private int credits;
    private double exam_marks;

    public String getSubject_code() {
        return Subject_code;
    }

    public void setSubject_code(String Subject_code) {
        this.Subject_code = Subject_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getExam_marks() {
        return exam_marks;
    }

    public void setExam_marks(double exam_marks) {
        this.exam_marks = exam_marks;
    }
    
}
