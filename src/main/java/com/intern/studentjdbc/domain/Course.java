package com.intern.studentjdbc.domain;

import com.intern.studentjdbc.enumaration.CourseType;

@SuppressWarnings("unused")
//@Entity
public class Course {
    private Long courseId;
    private String courseName;
    private CourseType courseType;

    public Course(Long courseId, String courseName, CourseType courseType) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseType = courseType;
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

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
}
