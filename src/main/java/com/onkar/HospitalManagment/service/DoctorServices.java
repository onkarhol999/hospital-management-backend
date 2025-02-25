package com.onkar.HospitalManagment.service;

import com.onkar.HospitalManagment.model.Docters;
import com.onkar.HospitalManagment.repo.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServices {

    @Autowired
    private DoctorRepo repo;

    public List<Docters> getAllDoctors() {
        return repo.findAll();
    }

    public void addDocter(Docters docter) {
        repo.save(docter);
    }
}
