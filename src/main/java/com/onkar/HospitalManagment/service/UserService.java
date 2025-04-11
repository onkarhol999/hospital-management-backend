package com.onkar.HospitalManagment.service;

import com.onkar.HospitalManagment.model.Users;
import com.onkar.HospitalManagment.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    public void addUser(Users user) {
        userRepo.save(user);
    }

    public boolean loginUser(String userName, String password) {
        List<Users> users = userRepo.findAll();

        for(Users user : users){
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)){
                return true;
            }
        }
       return false;
    }

    public Users getAllData(String userName) {
        return userRepo.findByUserName(userName);
    }

}
