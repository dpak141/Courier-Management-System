package com.css.bll;

public class Employee {

    private String employeeID;
    private String fullName;
    private String address;
    private String email;
    private String contact;
    private String qualicication;
    private String role;
    private String gender;
    private String username;
    private String password;
 

    public Employee(String employeeID, String fullName, String address, String email, String contact, String qualification, String role, String gender, String username, String password) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.contact = contact;
        this.role = role;
        this.gender = gender;
        this.username = username;
        this.password = password;
        
    }

    public Employee() {
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
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

    public String getQualicication() {
        return qualicication;
    }

    public void setQualicication(String qualicication) {
        this.qualicication = qualicication;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
