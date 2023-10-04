/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.css.bll;


public class Customer {
    private String customerID;
    private String fullName;
    private String address;
    private String email;
    private String contact;
    private String gender;
    private String username;
    private String password;
    
    
    public Customer(String customerID,String fullName,String address,String email, String contact,String gender,String username, String password){
        this.customerID=customerID;
        this.fullName=fullName;      
        this.address=address;
        this.email=email;
        this.contact=contact;
        this.gender=gender;
        this.username=username;
        this.password=password;
    }
    
    public Customer(){
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    

}

    