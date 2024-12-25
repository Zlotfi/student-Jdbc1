package com.intern.studentjdbc.domain;

import com.intern.studentjdbc.enumaration.CourseType;

@SuppressWarnings("unused")
//@Entity
public class Course {
    private Long id;
    private String courseName;
    private CourseType courseType;

    public Course(Long id, String courseName, CourseType courseType) {
        this.id = id;
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
}
