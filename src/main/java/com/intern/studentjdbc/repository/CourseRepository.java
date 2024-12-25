package com.intern.studentjdbc.repository;

import com.intern.studentjdbc.domain.Course;

import javax.management.relation.Role;

public interface CourseRepository {

    Course[] findAll();

    Course findById(Long courseId);
    Role save(Role role);
    Role update(Role role);
}
