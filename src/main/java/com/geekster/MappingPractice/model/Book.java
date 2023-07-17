package com.geekster.MappingPractice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookDesc;
    private String bookPrice;

    @ManyToOne
    @JoinColumn(name = "fk_student_id")
    private Student student;

}
