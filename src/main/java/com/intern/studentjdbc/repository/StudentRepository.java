package com.intern.studentjdbc.repository;

import com.intern.studentjdbc.domain.Student;

import java.util.ArrayList;

public interface StudentRepository {

    ArrayList <Student> students = new ArrayList<>();

    Student findById(Long studentId);

    void deleteById(Long studentId);

    Student save(Student student);
    long count();
}
