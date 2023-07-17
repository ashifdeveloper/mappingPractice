package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends CrudRepository<Book,Long> {
}