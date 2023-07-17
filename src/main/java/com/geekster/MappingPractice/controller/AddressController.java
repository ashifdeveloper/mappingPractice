package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Address;
import com.geekster.MappingPractice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;


    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @GetMapping("addresss")
    public Iterable<Address> getAllAddresss(){
        return addressService.getAllAddresss();
    }


    @PutMapping("address/{id}/{name}")
    public String updateAddressById(@PathVariable Long id,@PathVariable String name){
        return addressService.updateAddressById(id,name);


    }


    @DeleteMapping("addresss/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }


}
