package com.intern.studentjdbc.repository;

import com.intern.studentjdbc.base.repository.BaseEntityRepository;
import com.intern.studentjdbc.domain.Student;

import java.util.ArrayList;

public interface StudentRepository extends BaseEntityRepository {

    Student findByUserName(String userName);
    boolean existsByUserName(String userName);
    boolean existsByStudentNumber(String studentNumber);
    Student[] findAllByFirstNameAndLastName(String firstName, String lastName);
}
