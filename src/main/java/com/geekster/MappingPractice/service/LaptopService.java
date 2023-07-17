package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Laptop;
import com.geekster.MappingPractice.model.Laptop;
import com.geekster.MappingPractice.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;

    public String addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
        return "Laptop Added Successfully";
    }

    public Iterable<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public String updateLaptopById(Long id, String name) {
        Optional<Laptop> myLaptopOpt = laptopRepo.findById(id);
        Laptop myLaptop = null;
        if(myLaptopOpt.isPresent()){
            myLaptop = myLaptopOpt.get();
        }
        else{
            return "Id Not Found";
        }
        myLaptop.setLaptopName(name);
        laptopRepo.save(myLaptop);
        return "laptop name Updated";
    }


    public String deleteLaptopById(Long id) {

        Optional<Laptop> myLaptopOpt = laptopRepo.findById(id);
        Laptop myLaptop = null;
        if(myLaptopOpt.isPresent()){
            myLaptop=myLaptopOpt.get();
        }
        else{
            return "Id Not Found";
        }

        laptopRepo.deleteById(id);
        return "Deleted for id "+id;

    }
}
