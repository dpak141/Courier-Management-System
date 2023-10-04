package com.css.bll;

public class Report {
    
    private int reportID;
    private int orderID;
    private int customerID;
    private String customername;
    private int deliverystaffID;


    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public int getDeliverystaffID() {
        return deliverystaffID;
    }

    public void setDeliverystaffID(int deliverystaffID) {
        this.deliverystaffID = deliverystaffID;
    }

    
}
