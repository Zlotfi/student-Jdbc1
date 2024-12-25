package com.intern.studentjdbc.domain;

@SuppressWarnings("unused")
//@Entity
public class Course {
    private Long courseId;
    private String courseName;
    private Student[] students;

    public Course(Long courseId, String courseName, Student[] students) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = students;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
