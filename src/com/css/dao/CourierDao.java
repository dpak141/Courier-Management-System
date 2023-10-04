package com.css.dao;

import com.css.bll.Courier;
import java.util.ArrayList;
import java.io.IOException;

public interface CourierDao {

    void saveCourier(Courier c) throws IOException;

    void updateCourier(Courier c) throws IOException;

    void removeRecord(String filepath, String removeTerm, int positionofTerm, String delimiter) throws IOException;

    ArrayList<String> getAllCourierdetails() throws IOException;

}
