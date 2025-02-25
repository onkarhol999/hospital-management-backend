package com.onkar.HospitalManagment.service;

import com.onkar.HospitalManagment.model.Appoitment;
import com.onkar.HospitalManagment.repo.AppoitmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
