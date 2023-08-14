package com.treynorcodes.studentproject.service;

import com.treynorcodes.studentproject.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
