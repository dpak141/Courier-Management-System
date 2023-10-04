/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.css.dao;

import com.css.bll.Employee;
import com.css.bll.User;
import java.io.IOException;
import java.util.ArrayList;


public interface EmployeeDao {

    void saveEmployee(Employee e) throws IOException;

    void updateEmployee(Employee e) throws IOException;

    void removeRecord(String filepath, String removeTerm, int positionofTerm, String delimiter) throws IOException;
    
//    boolean checkUser(Employee e) throws IOException;

    ArrayList<String> getAllEmployees() throws IOException;
}
