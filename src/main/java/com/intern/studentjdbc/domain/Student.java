package com.intern.studentjdbc.domain;


import com.intern.studentjdbc.base.domain.Entity;

@SuppressWarnings("unused")
//@Entity
public class Student extends Entity {
    private String firstName;
    private String lastName;
    private String studentNumber;
    private String userName;
    private String password;
    private Course[] courses;

    public Student(String firstName, String lastName, String studentNumber, String userName, String password, Course[] courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.userName = userName;
        this.password = password;
        this.courses = courses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
