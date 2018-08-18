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
public class Exam {
    private String Student_Id;
    private String Course;
    private String Subject_code;
    private int Year;
    private int Semester;
    private String Exam_name;
    private int Exam_marks;
    private String Exam_grade;

    public String getStudent_Id() {
        return Student_Id;
    }

    public void setStudent_Id(String Student_Id) {
        this.Student_Id = Student_Id;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getSubject_code() {
        return Subject_code;
    }

    public void setSubject_code(String Subject_code) {
        this.Subject_code = Subject_code;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public String getExam_name() {
        return Exam_name;
    }

    public void setExam_name(String Exam_name) {
        this.Exam_name = Exam_name;
    }

    public int getExam_marks() {
        return Exam_marks;
    }

    public void setExam_marks(int Exam_marks) {
        this.Exam_marks = Exam_marks;
    }

    public String getExam_grade() {
        return Exam_grade;
    }

    public void setExam_grade(String Exam_grade) {
        this.Exam_grade = Exam_grade;
    }
    
    
}
