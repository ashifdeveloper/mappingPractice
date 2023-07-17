package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Laptop;
import com.geekster.MappingPractice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;



    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }

    @GetMapping("laptops")
    public Iterable<Laptop> getAllLaptops(){
        return laptopService.getAllLaptops();
    }


    @PutMapping("laptop/{id}/{name}")
    public String updateLaptopById(@PathVariable Long id,@PathVariable String name){
        return laptopService.updateLaptopById(id,name);


    }


    @DeleteMapping("laptops/{id}")
    public String deleteLaptopById(@PathVariable Long id){
        return laptopService.deleteLaptopById(id);
    }


}
