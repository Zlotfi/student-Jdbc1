package com.intern.studentjdbc.domain;

import com.intern.studentjdbc.base.domain.Entity;
import com.intern.studentjdbc.enumaration.CourseType;

@SuppressWarnings("unused")
//@Entity
public class Course extends Entity{
    private String courseName;
    private CourseType courseType;

    public Course(String courseName, CourseType courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
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
