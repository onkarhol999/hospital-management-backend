package com.onkar.HospitalManagment.repo;

import com.onkar.HospitalManagment.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, String> {
    Users findByUserName(String userName);
}
