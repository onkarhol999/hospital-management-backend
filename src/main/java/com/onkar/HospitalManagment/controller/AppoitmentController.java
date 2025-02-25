package com.onkar.HospitalManagment.controller;

import com.onkar.HospitalManagment.model.Appoitment;
import com.onkar.HospitalManagment.service.AppoitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
