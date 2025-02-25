package com.onkar.HospitalManagment.controller;

import com.onkar.HospitalManagment.model.Docters;
import com.onkar.HospitalManagment.service.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class DoctorController {

    @Autowired
    private DoctorServices services;

    @GetMapping("/getAllDoctors")
    public List<Docters> getAllDocotrs(){
        return services.getAllDoctors();
    }

    @PostMapping("/addDocter")
    public String addDcoter(@RequestBody Docters docter){
        services.addDocter(docter);
        return "added..";
    }
}
