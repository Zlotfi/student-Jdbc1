package com.intern.studentjdbc.repository;

import com.intern.studentjdbc.base.repository.BaseEntityRepository;
import com.intern.studentjdbc.domain.Course;

import javax.management.relation.Role;

public interface CourseRepository extends BaseEntityRepository {

    Course findByName(String courseName);
}
