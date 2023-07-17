package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Student;
import com.geekster.MappingPractice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Student Added Successfully";
    }

    public Iterable<Student> getAllStudents() {
            return studentRepo.findAll();
        }

    public String updateStudentById(Long id, String name) {
        Optional<Student> myStudentOpt = studentRepo.findById(id);
        Student myStudent = null;
        if(myStudentOpt.isPresent()){
            myStudent = myStudentOpt.get();
        }
        else{
            return "Id Not Found";
        }
        myStudent.setStudentName(name);
        studentRepo.save(myStudent);
        return "student Type Updated";
    }


    public String deleteStudentById(Long id) {

            Optional<Student> myStudentOpt = studentRepo.findById(id);
            Student myStudent = null;
            if(myStudentOpt.isPresent()){
                myStudent=myStudentOpt.get();
            }
            else{
                return "Id Not Found";
            }

            studentRepo.deleteById(id);
            return "Deleted for id "+id;
        
    }
}
