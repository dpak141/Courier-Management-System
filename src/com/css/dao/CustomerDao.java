/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.css.dao;

import com.css.bll.Customer;
import java.io.IOException;
import java.util.ArrayList;


public interface CustomerDao {

    void saveCustomer(Customer cu) throws IOException;

    void updateCustomer(Customer cu) throws IOException;

    void removeRecord(String filepath, String removeTerm, int positionofTerm, String delimiter) throws IOException;

    ArrayList<String> getAllCustomers() throws IOException;
}
