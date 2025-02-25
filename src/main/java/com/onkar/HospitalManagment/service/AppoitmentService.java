package com.onkar.HospitalManagment.service;

import com.onkar.HospitalManagment.model.Appoitment;
import com.onkar.HospitalManagment.repo.AppoitmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppoitmentService {

    @Autowired
    private AppoitmentRepo appoitmentRepo;

    public void addAppoitment(Appoitment appoitment) {
        appoitmentRepo.save(appoitment);
    }

    public List<Appoitment> getAllPoitment() {
        return appoitmentRepo.findAll();
    }

    public List<Appoitment> getAppoitmentByDocter(String username) {
        List<Appoitment> Apment = appoitmentRepo.findAll();
        List<Appoitment> Apbd = new ArrayList<>();
        for(Appoitment app : Apment){
            if (app.getDoctorUsername().equals(username)) {
                Apbd.add(app);
            }
        }
        return Apbd;
    }
}
