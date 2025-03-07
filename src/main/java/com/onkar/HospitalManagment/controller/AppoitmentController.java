package com.onkar.HospitalManagment.controller;

import com.onkar.HospitalManagment.model.Appoitment;
import com.onkar.HospitalManagment.service.AppoitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AppoitmentController {

    @Autowired
    private AppoitmentService appoitmentService;

    @PostMapping("/addAppoitment")
    public String addAppoitment(@RequestBody Appoitment appoitment){
        appoitmentService.addAppoitment(appoitment);
        return "Added..";
    }

    @GetMapping("/getAllAppoitment")
    public List<Appoitment> getAllPoitment(){
        return appoitmentService.getAllPoitment();
    }

    @GetMapping("/getAppoitmentByDocter/{username}")
    public List<Appoitment> getAppoitmentByDocter(@PathVariable String username){
        return appoitmentService.getAppoitmentByDocter(username);
    }

    @DeleteMapping("/deleteAppoitmentById/{id}")
    public String deleteAppoitmentById(@PathVariable Integer id){
         appoitmentService.deleteAppoitmentById(id);
         return "Deleted..";
    }
}
