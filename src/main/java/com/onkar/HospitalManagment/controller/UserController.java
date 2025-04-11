package com.onkar.HospitalManagment.controller;

import com.onkar.HospitalManagment.model.Users;
import com.onkar.HospitalManagment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody Users user){
         userService.addUser(user);
         return "User Added...";
    }

    @PostMapping("/loginUser")
    public boolean loginUser(@RequestBody Map<String, String> userData) {
        String userName = userData.get("userName");
        String password = userData.get("password");
        return userService.loginUser(userName, password);
    }

    @PostMapping("/getAllData")
    public Users getAllUsers(@RequestBody Map<String, String> request) {
        String userName = request.get("userName");
        return userService.getAllData(userName);
    }
}
