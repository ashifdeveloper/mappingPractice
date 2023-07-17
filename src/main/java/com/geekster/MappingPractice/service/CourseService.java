package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Course;
import com.geekster.MappingPractice.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;

    public String addCourse(Course course) {
        courseRepo.save(course);
        return "Course Added Successfully";
    }

    public Iterable<Course> getAllCourses() {
            return courseRepo.findAll();
        }

    public String updateCourseById(Long id, String title) {
        Optional<Course> myCourseOpt = courseRepo.findById(id);
        Course myCourse = null;
        if(myCourseOpt.isPresent()){
            myCourse = myCourseOpt.get();
        }
        else{
            return "Id Not Found";
        }
        myCourse.setCourseTitle(title);
        courseRepo.save(myCourse);
        return "course title Updated";
    }


    public String deleteCourseById(Long id) {

            Optional<Course> myCourseOpt = courseRepo.findById(id);
            Course myCourse = null;
            if(myCourseOpt.isPresent()){
                myCourse=myCourseOpt.get();
            }
            else{
                return "Id Not Found";
            }

            courseRepo.deleteById(id);
            return "Deleted for id "+id;
        
    }
}
