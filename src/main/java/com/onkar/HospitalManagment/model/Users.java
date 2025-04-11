package com.onkar.HospitalManagment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {

     @Id
     private String userName;
     private String name;
     private String contactNumber;
     private String password;

    public Users(String userName, String name, String contactNumber, String password) {
        this.userName = userName;
        this.name = name;
        this.contactNumber = contactNumber;
        this.password = password;
    }

    public Users() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
