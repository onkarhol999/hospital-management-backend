package com.onkar.HospitalManagment.repo;

import com.onkar.HospitalManagment.model.Docters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends JpaRepository<Docters, Integer> {
}
