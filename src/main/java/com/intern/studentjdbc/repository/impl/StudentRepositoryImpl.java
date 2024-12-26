package com.intern.studentjdbc.repository.impl;

import com.intern.studentjdbc.base.repository.impl.BaseEntityRepositoryImpl;
import com.intern.studentjdbc.domain.Student;
import com.intern.studentjdbc.repository.StudentRepository;

@SuppressWarnings("unused")
public class StudentRepositoryImpl extends BaseEntityRepositoryImpl
        implements StudentRepository {
    @Override
    public Student findByUserName(String userName) {
        return null;
    }

    @Override
    public boolean existsByUserName(String userName) {
        return false;
    }

    @Override
    public boolean existsByStudentNumber(String studentNumber) {
        return false;
    }
}
