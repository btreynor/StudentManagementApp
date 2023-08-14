package com.treynorcodes.studentproject.repository;

import com.treynorcodes.studentproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
