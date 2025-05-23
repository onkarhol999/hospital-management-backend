package com.onkar.HospitalManagment.repo;

import com.onkar.HospitalManagment.model.Appoitment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppoitmentRepo extends JpaRepository<Appoitment, Integer> {

}
