package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends CrudRepository<Course,Long> {
}