package com.geekster.MappingPractice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseTitle;
    private String courseDesc;
    private String courseDuration;
@ManyToMany
@JoinTable(name = "fk_student_course_table",joinColumns = @JoinColumn(name = "fk_course_id"),inverseJoinColumns = @JoinColumn(name = "fk_student_id"))
private List<Student> studentList;

}
