/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.css.dao;

import com.css.bll.Courier;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author prash
 */
public class CourierDaoImpl implements CourierDao {

    @Override
    public void saveCourier(Courier c) throws IOException {

        try ( BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/css/textFiles/Courier.txt", true))) {
            bw.write(c.getCid() + "," + c.getDate() + "," + c.getCustomerName() + "," + c.getAddress() + "," + c.getContact() + "," + c.getSource() + "," + c.getDestination() + "," + c.getWeight() + "," + c.getCost() + "," + c.getCourierType() + "," + c.getCourierStatus());
            bw.flush();
            bw.newLine();
            bw.close();
        }

    }

    @Override
    public void removeRecord(String filepath, String removeTerm, int positionofTerm, String delimiter) throws IOException {
        int position = positionofTerm - 1;
        String tempFile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);

        String currentLine;
        String data[];

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);

            while ((currentLine = br.readLine()) != null) {
                data = currentLine.split(",");
                if (!(data[position].equalsIgnoreCase(removeTerm))) {
                    pw.println(currentLine);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            bw.close();
            fw.close();

            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);
        } catch (Exception e) {

        }

    }

    @Override
    public ArrayList<String> getAllCourierdetails() throws IOException {
        ArrayList<String> fileData = new ArrayList<>();
        FileReader fr = new FileReader("src/com/css/textFiles/Courier.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            fileData.add(line);
        }
        return fileData;
    }

    @Override
    public void updateCourier(Courier c) throws IOException {
        ArrayList<String> tempArray = new ArrayList<>();
        try ( FileReader fr = new FileReader("src/com/css/textFiles/Courier.txt")) {

            Scanner reader = new Scanner(fr);
            String line;
            String[] lineArr;

            while ((line = reader.nextLine()) != null) {
                lineArr = line.split(",");
                if (lineArr[0].equals(c.getCid())) {
                    tempArray.add(
                            lineArr[0] + "," + lineArr[1] + "," + lineArr[2] + "," + lineArr[3] + "," + c.getContact() + "," + c.getSource() + "," + c.getDestination() + "," + c.getWeight() + "," + c.getCost() + "," + lineArr[9] + "," + c.getCourierStatus());
                } else {
                    tempArray.add(line);
                }
            }
            fr.close();
        } catch (Exception e) {
        }

        try {
            try ( PrintWriter pr = new PrintWriter("src/com/css/textFiles/Courier.txt")) {
                for (String str : tempArray) {
                    pr.println(str);
                }
            }
        } catch (FileNotFoundException e) {
        }
    }
}
