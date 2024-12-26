package com.intern.studentjdbc.repository.impl;

import com.intern.studentjdbc.base.repository.impl.BaseEntityRepositoryImpl;
import com.intern.studentjdbc.domain.Course;
import com.intern.studentjdbc.repository.CourseRepository;

@SuppressWarnings("unused")
public class CourseRepositoryImpl extends BaseEntityRepositoryImpl
        implements CourseRepository {
    @Override
    public Course findByName(String courseName) {
        return null;
    }
}
