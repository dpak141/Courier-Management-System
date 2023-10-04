/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.css.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReportDaoImpl implements ReportDao {

    @Override
    public ArrayList<String> getAllReports() throws IOException {
        ArrayList<String> fileData = new ArrayList<>();
        FileReader fr = new FileReader("src/com/css/textFiles/Report.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            fileData.add(line);
        }
        return fileData;
    }

}
