package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends CrudRepository<Laptop,Long> {
}
