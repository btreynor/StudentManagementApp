package com.treynorcodes.studentproject.controller;

import com.treynorcodes.studentproject.model.Student;
import com.treynorcodes.studentproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public List<Student> add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return studentService.getAllStudents();
    }

    @GetMapping("getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
