package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Course;
import com.geekster.MappingPractice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;


    @PostMapping("course")
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @GetMapping("courses")
    public Iterable<Course> getAllCourses(){
        return courseService.getAllCourses();
    }


    @PutMapping("course/{id}/{name}")
    public String updateCourseById(@PathVariable Long id,@PathVariable String name){
        return courseService.updateCourseById(id,name);


    }


    @DeleteMapping("courses/{id}")
    public String deleteCourseById(@PathVariable Long id){
        return courseService.deleteCourseById(id);
    }


}
