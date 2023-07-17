package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Address;
import com.geekster.MappingPractice.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address Added Successfully";
    }

    public Iterable<Address> getAllAddresss() {
            return addressRepo.findAll();
        }

    public String updateAddressById(Long id, String landmark) {
        Optional<Address> myAddressOpt = addressRepo.findById(id);
        Address myAddress = null;
        if(myAddressOpt.isPresent()){
            myAddress = myAddressOpt.get();
        }
        else{
            return "Id Not Found";
        }
        myAddress.setAddressLandmark(landmark);
        addressRepo.save(myAddress);
        return "address Type Updated";
    }


    public String deleteAddressById(Long id) {

            Optional<Address> myAddressOpt = addressRepo.findById(id);
            Address myAddress = null;
            if(myAddressOpt.isPresent()){
                myAddress=myAddressOpt.get();
            }
            else{
                return "Id Not Found";
            }

            addressRepo.deleteById(id);
            return "Deleted for id "+id;
        
    }
}
