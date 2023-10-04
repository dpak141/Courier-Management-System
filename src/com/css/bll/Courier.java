/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.css.bll;

/**
 *
 * @author prash
 */
public class Courier {

    private String cid;
    private String date;
    private String customerName;
    private String address;
    private String contact;
    private String source;
    private String destination;
    private double weight;
    private double cost;
    private String courierStatus;
    private String courierType;

    public Courier(String cid, String date, String customerName, String address, String contact, String source, String destination, double weight, String courierType, double cost, String courierStatus) {
        this.cid = cid;
        this.date = date;
        this.customerName = customerName;
        this.address = address;
        this.contact = contact;
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        this.courierType = courierType;
        this.cost = cost;
        this.courierStatus=courierStatus;
    }

    public Courier() {

    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCourierStatus() {
        return courierStatus;
    }

    public void setCourierStatus(String courierStatus) {
        this.courierStatus = courierStatus;
    }

    public String getCourierType() {
        return courierType;
    }

    public void setCourierType(String courierType) {
        this.courierType = courierType;
    }

    public Object getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
