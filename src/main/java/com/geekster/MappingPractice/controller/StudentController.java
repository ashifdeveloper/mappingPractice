package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Student;
import com.geekster.MappingPractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("students")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @PutMapping("student/{id}/{name}")
    public String updateStudentById(@PathVariable Long id,@PathVariable String name){
        return studentService.updateStudentById(id,name);


    }


    @DeleteMapping("students/{id}")
    public String deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudentById(id);
    }


}
