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
public class Instructor {
   private String name;
   private String Instructor_id;
   private int age;
   private String Address;
   private int phone_number;
   private String DOB;
   private String Email;
   private String Gender;
   private int Lab_num;
   private String subjects;
   private String Course_Id;
   private String Faculty_Id;

    public String getCourse_Id() {
        return Course_Id;
    }

    public void setCourse_Id(String Course_Id) {
        this.Course_Id = Course_Id;
    }

    public String getFaculty_Id() {
        return Faculty_Id;
    }

    public void setFaculty_Id(String Faculty_Id) {
        this.Faculty_Id = Faculty_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor_id() {
        return Instructor_id;
    }

    public void setInstructor_id(String Instructor_id) {
        this.Instructor_id = Instructor_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getLab_num() {
        return Lab_num;
    }

    public void setLab_num(int Lab_num) {
        this.Lab_num = Lab_num;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
    
}
